import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class YourProfile extends Welcome 
{
	
	public static void profile()
	{
		SignUp r= new SignUp();
		r.getUserName();
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.Personal Profile");
		System.out.println("2.Manage Alerts");
		System.out.println("3.Tax");
		System.out.println("4.Security Center");
		System.out.println("5.Feedback");
		System.out.println("6.Back");
		System.out.println("______________________________________________________________________");
	    System.out.println("Select:");
	    Scanner sc=new Scanner(System.in);
	    int slc= sc.nextInt();
	    switch(slc)
	    {
	    case 1: PersonalProfile per=new PersonalProfile();
	    		per.personalProfile();
	    		per.aadharAndPan();
	    		per.contact();
	    		per.kyc();
	    break; 
	    case 2:
	    	ManageAlerts man=new ManageAlerts();
	    	man.setUp();
	    break;
	    case 3:
	    	Tax t=new Tax();
	    	t.tax();
	    break;
	    case 4:
	    	SecurityCenter cen=new SecurityCenter();
	    	cen.manage();
	    break;
	    case 5:
	    	Feedback fee=new Feedback();
	    	fee.feedback();
	    break;
	    case 6: 
	    	 Welcome ho=new Welcome(); 	
	    		ho.welcome();
	    default:
	    	System.out.println("invalid input");
	    	profile(); 
	    }
	}
	
	public static void profile2()
	{
		SignUp r= new SignUp();
		r.getUserName();
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.Personal Profile");
		System.out.println("2.Manage Alerts");
		System.out.println("3.Tax");
		System.out.println("4.Security Center");
		System.out.println("5.Feedback");
		System.out.println("6.Back");
		System.out.println("______________________________________________________________________");
	    System.out.println("Select:");
	    Scanner sc=new Scanner(System.in);
	    int slc= sc.nextInt();
	    switch(slc)
	    {
	    case 1: PersonalProfile per=new PersonalProfile();
	    		per.personalProfile2();
	    		per.aadharAndPan();
	    		per.contact();
	    		per.kyc();
	    break; 
	    case 2:
	    	ManageAlerts man=new ManageAlerts();
	    	man.setUp();
	    break;
	    case 3:
	    	Tax t=new Tax();
	    	t.tax();
	    break;
	    case 4:
	    	SecurityCenter cen=new SecurityCenter();
	    	cen.manage();
	    break;
	    case 5:
	    	Feedback fee=new Feedback();
	    	fee.feedback();
	    break;
	    case 6: 
	    	 Welcome ho=new Welcome(); 	
	    		ho.welcome();
	    default:
	    	System.out.println("invalid input");
	    	profile2(); 
	    }
	}
}

class PersonalProfile extends YourProfile
{
	{
		  System.out.println("=======================================================");
	      System.out.println("                   Person Profile                      ");
		  System.out.println("=======================================================");
		  
		  
	}

	public void personalProfile(){
		fetchUserDetails() ;
		SignUp ref=new SignUp();
		System.out.println("____________________________________________________");
		System.out.println("                                                    ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("|                                                   ");
//		System.out.println("Name: ");
		System.out.print("Name: ");
		System.out.println(fullName + "                            |");
		System.out.print("Customer id: ");
		System.out.println(custid+ "                                 |");
		System.out.println(birthdate);
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("____________________________________________________");
		System.out.println("1. Open Aadhar And Pan");
		System.out.println("2. Open Contact");
		System.out.println("3. Check KYC Status");
		System.out.println("4. Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			aadharAndPan();
		break;
		case 2:
			contact();
		break;
		case 3: 
			kyc();
		break;
		case 4:
			profile();
		break;
		default: 
			personalProfile();
		break;
		}
	}

	
	public void personalProfile2(){
		fetchUserDetails() ;
		SignUp ref=new SignUp();
		System.out.println("____________________________________________________");
		System.out.println("                                                    ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("|                                                   ");
//		System.out.println("Name: ");
		System.out.print("Name: ");
		System.out.println(fullName + "                            |");
		System.out.print("Customer id: ");
		System.out.println(custid+ "                                 |");
		System.out.println(birthdate);
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("____________________________________________________");
		System.out.println("1. Open Aadhar And Pan");
		System.out.println("2. Open Contact");
		System.out.println("3. Check KYC Status");
		System.out.println("4. Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			aadharAndPan();
		break;
		case 2:
			contact();
		break;
		case 3: 
			kyc();
		break;
		case 4:
			profile2();
		break;
		default: 
			personalProfile2();
		break;
		}
	}
	
	  private void fetchUserDetails() {
	        ResultSet userDetails = null;
	        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?user=root&password=root");
	             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user_details WHERE phone_number = ?")) {
	            stmt.setString(1, phoneno);
	            userDetails = stmt.executeQuery();
	            if (userDetails != null && userDetails.next()) {
	                fullName = userDetails.getString("full_name");
	                custid = userDetails.getLong("customer_id");
	                // Fetch and assign other user details as needed
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (userDetails != null) {
	                try {
	                    userDetails.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	
	public void aadharAndPan()
	{
		System.out.println("____________________________________________________");
		System.out.println("                                                    ");
		System.out.print("|                                                   ");
		System.out.println("|");
		
		System.out.println("====================================================");
		System.out.print("|");
		System.out.print("Aadhar :											  ");
		System.out.println("                                                   |");
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.print("|");
		System.out.print("PAN : ");
		System.out.println("                                                   |");
		System.out.println("====================================================");
		System.out.println("1.Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: personalProfile();
		break;
		}
	}
	public void contact()
	{
		System.out.println("====================================================");
		System.out.println("                      CONTACT                       ");
		System.out.println("====================================================");
		System.out.println("____________________________________________________");
		System.out.println("                                                    ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("====================================================");
		System.out.print("|                                                   ");
		System.out.println("|"); 
		System.out.print("Email :"+ Email +"											  ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("Gender:"+ Gender +"                                           ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("Mobile: "+ phoneno+"                                          ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("Residence Phone: UPDATE");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("Office Phone: UPDATE");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("Mailing Address: 2/04 NEELKANTH PARK DWARKA NAGARI");
		System.out.println("PHASE NO 1 WAYALE NAGAR");
		System.out.println("KHADAKPADA KALYAN WEST");
		System.out.println("THANE MAHARASHTRA -421301");
		System.out.println("INDIA");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("Permanent Address: 2/04 NEELKANTH PARK DWARKA NAGARI");
		System.out.println("PHASE NO 1 WAYALE NAGAR");
		System.out.println("KHADAKPADA KALYAN WEST");
		System.out.println("THANE MAHARASHTRA -421301");
		System.out.println("INDIA");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("|"); 
		System.out.println("====================================================");
		System.out.println("1.Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: personalProfile();
		break;
		}
	}
	
	public void kyc()
	{
		System.out.println("====================================================");
		System.out.println("                      KYC                       ");
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.print("|");
		System.out.print("KYC Status :	Yes									  ");
		System.out.println("                                                  |");
		System.out.println("====================================================");
		System.out.println("1.Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: personalProfile();
		break;
		}
	}
	
}

class ManageAlerts extends YourProfile
{
	{
		  System.out.println("=======================================================");
	      System.out.println("                   Manage Alerts                      ");
		  System.out.println("=======================================================");
		  System.out.println("____________________________________________________");
		  System.out.println(" ");
		  System.out.println("Select Account");
		  System.out.println(" ");
		  System.out.println("Savings-"+ accountno);
		  System.out.println(" ");
		  System.out.println("Balance Rs."+ balance);
		  System.out.println(" ");
		  System.out.println("Email Id:"+ Email);
		  System.out.println(" ");
		  System.out.println("Gender : Male");
		  System.out.println(" ");
		  System.out.println("Mobile No: "+ phoneno);
		  System.out.println("____________________________________________________");
	}
	
	public void setUp()
	{
		System.out.println("=======================================================");
	    System.out.println("Set Up Alert For                                       ");
	    System.out.println("=======================================================");
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("1.Salary Credit");
		System.out.println("2.Credit Above Set Amount");
		System.out.println("3.Debit Above Set Amount");
		System.out.println("4.Other Alerts");
		System.out.println("5.Back");
		int a= sc.nextInt();
		switch(a)
		{
		case 1:
			salaryCredit();
		break;
		case 2:
			creditAboveSet();
		break;
		case 3:
			debitAboveSet();
		break;
		case 4: 
			otherAlerts();
		break;
		case 5: 
			profile();
		default: setUp();
		break;
		}
	}
	
	public void email()
	{
		System.out.println("Alert setting to Email Successful.");
		System.out.println("Press 1 for Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: setUp();
		}
	}
	
	public void sms()
	{
		System.out.println("Alert setting to SMS Successful.");
		System.out.println("Press 1 for Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: setUp();
		}
	}
	
	public void both()
	{
		System.out.println("Alert setting to both Email & SMS Successful.");
		System.out.println("Press 1 for Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: setUp();
		}
	}
	
	public void salaryCredit()
	{
		System.out.println("-------------------------------------------------------");
	    System.out.println("Salary Credit                                       ");
	    System.out.println("-------------------------------------------------------");
	    System.out.println("Select Mode to set your Alerts on: ");
	    System.out.print("1.EMAIL");
		System.out.print(" |   2. SMS    | ");
		System.out.println(" |   3. BOTH   | ");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			email();
		break;
		case 2:
			sms();
		break;
		case 3:
			both();
		break;
		default: 
			System.out.println("Invalid Input");
			salaryCredit();		
		}
	}
	public void creditAboveSet()
	{
		System.out.println("-------------------------------------------------------");
	    System.out.println("Credit Above Set Amount                                       ");
	    System.out.println("-------------------------------------------------------");
	    System.out.println("Select Mode: ");
	    System.out.print("1.EMAIL");
		System.out.print(" |   2. SMS    | ");
		System.out.println(" |   3. BOTH   | ");
		System.out.println("for transactions above");
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("5000                                               >");
		System.out.println("____________________________________________________");
		int a=sc.nextInt();
				switch(a)
				{
				case 1:
					email();
				break;
				case 2:
					sms();
				break;
				case 3:
					both();
				break;
				default: 
					System.out.println("Invalid Input");
					creditAboveSet();	
				}
	}
	public void debitAboveSet()
	{
		System.out.println("-------------------------------------------------------");
	    System.out.println("Debit Above Set Amount                                       ");
	    System.out.println("-------------------------------------------------------");
	    System.out.println("Select Mode: ");
	    System.out.print("1.EMAIL");
		System.out.print(" |   2. SMS    | ");
		System.out.println(" |   3. BOTH   | ");
		System.out.println("for transactions above");
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("5000                                               >");
		System.out.println("____________________________________________________");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			email();
		break;
		case 2:
			sms();
		break;
		case 3:
			both();
		break;
		default: 
			System.out.println("Invalid Input");
			debitAboveSet();	
		}
	}
	public void otherAlerts()
	{
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("Periodic Balance Check                             >");
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("Balance Change                                     >");
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("Balance Below Set Amount                           >");
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("Cheque Bounce                                      >");
		System.out.println("____________________________________________________");
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("Limit Change                                       >");
		System.out.println("____________________________________________________");
		System.out.println("-------------------------------------------------------");
		System.out.println("                   1.Done");
		System.out.println("-------------------------------------------------------");
		int a= sc.nextInt();
		switch(a)
		{
		case 1: setUp();
		}
	}
}

class Tax extends YourProfile
{
	Tax()
	{
		System.out.println("====================================================");
		System.out.println("                        TAX                         ");
		System.out.println("====================================================");
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("PAN:                LHXXXXX4C");
		System.out.println("____________________________________________________");
	}
	public void tax()
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("Know Taxes Paid Or Deducteed");
		System.out.println("-------------------------------------------------------");
		System.out.println("____________________________________________________");
		System.out.println("TDS Summary & TDS Certificate");
		System.out.println(" ");
		System.out.println("For Tax Deducted at Source (TDS) on your savings and  >");
		System.out.println("deposit accounts in current and the previous ");
		System.out.println("financial year");
		System.out.println(" ");
		System.out.println("____________________________________________________");
		String a=sc.nextLine();
		switch(a)
		{
		default: 
			profile();
		}
	}
}

class SecurityCenter extends YourProfile
{
	SecurityCenter()
	{
		System.out.println("====================================================");
		System.out.println("                 Security Center                    ");
		System.out.println("====================================================");
	}
	public void manage()
	{
		System.out.println("____________________________________________________");
		System.out.println(" ");
		System.out.println("Manage Your PINs & Passwords");
		System.out.println("1.Change Your Password");
		System.out.println("Create strong,secure passwords and change them ");
		System.out.println("regularly via Change Password.");
		System.out.println(" ");
		System.out.println("2.Manage Easy Login Method");
		System.out.println("Change default login method & Set a 4 Digit ");
		System.out.println("Login PIN and FingerPrint.");
		System.out.println(" ");
		System.out.println("3.Change Card PINs");
		System.out.println("Change Credit Cards and Debit cards PINs.");
		System.out.println(" ");
		System.out.println("4.BACK");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: 
			changePass();
			
		break;
		case 2:
			manageLogin();
			
		break;
		case  3:
			changeCardPin();
			
		break;
		case 4:
			profile();
		break;
		default: manage();
		break;
		}
	}
	public void changePass()
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("					Set Password						");
		System.out.println("-------------------------------------------------------");
		System.out.println("Old IPIN/Password");
		System.out.println("__________________________________");
		System.out.println("");
		System.out.println("New IPIN/Password");
		System.out.println("__________________________________");
		System.out.println(" ");
		System.out.println("Confirm New IPIN/Password");
		System.out.println("-----------");
		System.out.print("| ");
	    System.out.print(" 1.Confirm ");
	    System.out.println("|");
	    System.out.println("-----------");
		System.out.println("-----------");
		System.out.print("| ");
	    System.out.print(" 2.Cancel ");
	    System.out.println("|");
	    System.out.println("-----------");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: 
			confirm();
		break;
		case 2: 
			manage();
		break;
		default: 
			changePass();
			break;
		}
	}
	public void confirm()
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("		New Password Changed Successfully			");
		System.out.println("-------------------------------------------------------");
	}
	public void manageLogin()
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("	    	 Manage Easy Login Method   	    		");
		System.out.println("-------------------------------------------------------");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Device registered on: 30 Oct 2022");
		System.out.println("Samsung Phone");
		System.out.println("Remove Device Registration");
		System.out.println("______________________________________________________________________");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("ALTERNATE Login");
		System.out.println(" ");
		System.out.println(" 4 digit Login PIN for quick accwaa");
		System.out.println(" 1.Change ");
		System.out.println("Fingerprint");
		System.out.println("2. Cancel/Back");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: change();
		break;
		case 2: manage();
		break;
		default: manageLogin();
		break;
		}
		
	}
	public void change()
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("		New PIN Set Successfully			");
		System.out.println("-------------------------------------------------------");
	}
	public void changeCardPin()
	{
		System.out.println("====================================================");
		System.out.println("                 Cards                    ");
		System.out.println("====================================================");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Credit Cards");
		System.out.println("______________________________________________________________________");
		System.out.println("Card Type: ");
		System.out.println("Credit Card No.: ");
		System.out.println("Linked Accounts");
		System.out.println("Savings - "+ accountno);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Debit Cards");
		System.out.println("______________________________________________________________________");
		System.out.println("Card Type: ");
		System.out.println("Credit Card No.: ");
		System.out.println("Linked Accounts");
		System.out.println("Savings - "+ accountno);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("1.BACK");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: manage();
		break;
		default: changeCardPin();
		break;
		}
	}
	
}

class Feedback extends YourProfile
{
	public void feedback()
	{
		System.out.println("=======================================================");
		System.out.println(" ");
	    System.out.println("        Your feedback is important to us      ");
	    System.out.println(" ");
	    System.out.println(" 		please rate your overall app experience");
	    System.out.println("");
	    System.out.println("                     Tap to rate ");
	    System.out.println(" Very Poor");
	    System.out.println(" Poor");
	    System.out.println(" Average");
	    System.out.println(" Good");
	    System.out.println(" Excellent");
	    System.out.println("-----------");
		System.out.print("| ");
	    System.out.print(" 1.Submit ");
	    System.out.println("|");
	    System.out.println("-----------");
		System.out.println("-----------");
		System.out.print("| ");
	    System.out.print(" 2.Not Now ");
	    System.out.println("|");
	    System.out.println("-----------");
		System.out.println("=======================================================");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: thanks();
		break;
		case 2: profile();
		break;
		default: feedback();
		break;
		}
	}
	public void thanks()
	{
		System.out.println("Thanks for Your Review");
		int a=sc.nextInt();
		switch(a)
		{
		default: feedback();
		break;
		}
	}
}