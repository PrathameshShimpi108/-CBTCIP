import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

interface SA {
    abstract void signup();
}

interface Log {
    abstract void login();
}

public class SignUp implements SA, Log {

    static Scanner sc = new Scanner(System.in);

    static String fullName;
    private String Username;
    private String Username1;
    private String Password;
    private String Password1;
    static String Email;
    static String phonenum;
    static String Bank = "MYBANK"; // Set bank name
    static String Bname="Khadakpada";
    static String IFSC;
    static String UPIid;
    static double balance = 0; // Initial balance is set to 0 for new users
    static long debit_Cardno;
    static long custid;
    static String birthdate = "13-09-1999";
    static String phoneno;
    static String Uname;
    static String Pswd;
    static String Gender;
    static String accountno;
    
    


    public String getUserName() {
        return this.Username;
    }

    public String getUserName1() {
        return this.Username1;
    }

    public String getPassword() {
        return Password;
    }

    public String getPassword1() {
        return this.Password;
    }

    public String getPhoneNum() {
        return phonenum;
    }

    @Override
    public String toString() {
    	 return this.Username1;
    }

    public void signup() {

        System.out.println("Enter Your Email:");
        Email = sc.nextLine();

        System.out.println("Enter Phone Number:");// username:user
        phonenum = sc.nextLine();

        System.out.println("Enter Your Full Name:");
        fullName = sc.nextLine();

        System.out.println("Create username:");// username:user
        Username = sc.nextLine();

        System.out.println("Create password:");// password:user
        Password = sc.nextLine();

        System.out.println("Enter username:");// username:user
        Username1 = sc.nextLine();

        System.out.println("Enter password:");// password:user
        Password1 = sc.nextLine();

        if (Username.equals(Username1) && Password.equals(Password1)) {
            System.out.println("Authentication Successful");
            createBankAccount();
            insertUserIntoDatabase();
            Welcome ref1 = new Welcome();
            ref1.welcome();
        } else {
            System.out.println("Authentication Failed");
            signup();
        }

    }

    public void login() {

        System.out.println("Enter Your Phone Number:");
        phoneno = sc.next();

        System.out.println("Enter Your User Name:");
        Uname = sc.next();

        System.out.println("Enter Your Password:");
        Pswd = sc.next();
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?user=root&password=root")) {
            String sql = "SELECT * FROM user_details WHERE phone_number = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, phoneno);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    String dbUsername = rs.getString("username");
                    String dbPassword = rs.getString("password");
                    long phonenum=rs.getLong("phone_number");
                    if (Uname.equals(dbUsername) && Pswd.equals(dbPassword)) {
                        System.out.println("Login Successful");
                        Welcome ref1= new Welcome();
                        ref1.welcome2();
                    } else {
                        System.out.println("Incorrect username or password");
                        login();
                    }
                } else {
                    System.out.println("Incorrect Credentials");
                    System.out.println("Try Again");
                    login();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public ResultSet getUserDetails(String phoneNumber, String userName, String password) {
        ResultSet rs = null;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?user=root&password=root")) {
            String sql = "SELECT * FROM user_details WHERE phone_number = ? AND username = ? AND password = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, phoneNumber);
                stmt.setString(2, userName);
                stmt.setString(3, password);
                rs = stmt.executeQuery();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }


    private void createBankAccount() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?user=root&password=root")) {
            String sql = "CREATE TABLE IF NOT EXISTS user_details (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "full_name VARCHAR(255)," +
                    "phone_number VARCHAR(15)," +
                    "bank_name VARCHAR(255)," +
                    "balance DOUBLE," +
                    "ifsc_code VARCHAR(10)," +
                    "customer_id VARCHAR(10)," +
                    "account_no VARCHAR(20)," +
                    "upi_id VARCHAR(255)," +
                    "username VARCHAR(255)," +
                    "password VARCHAR(255))";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertUserIntoDatabase() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?user=root&password=root")) {
            String sql = "INSERT INTO user_details (full_name, phone_number, bank_name, balance, ifsc_code, customer_id, account_no, upi_id, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, fullName);
                stmt.setString(2, phonenum);
                stmt.setString(3, Bank);
                stmt.setDouble(4, balance);
                IFSC = generateIFSC();
                stmt.setString(5, IFSC);
                custid = generateCustomerID();
                stmt.setString(6, String.valueOf(custid));
                accountno = generateAccountNo();
                stmt.setString(7, accountno);
                UPIid = generateUPIID();
                stmt.setString(8, UPIid);
                stmt.setString(9, Username);
                stmt.setString(10, Password);
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("User registered successfully!");
                } else {
                    System.out.println("Failed to register user.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String generateIFSC() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder("MYBANK");
        for (int i = 0; i < 4; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }

    private long generateCustomerID() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000); // Generate a 6-digit random number
    }

    private String generateAccountNo() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }

    private String generateUPIID() {
        return phonenum + "@" + Bank;
    }

}
