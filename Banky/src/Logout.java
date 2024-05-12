import java.util.Scanner;

public class Logout extends SignUp {
	public static void logout()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("=========*******==========");
		System.out.println("| A. Sign Up |  B. Login |");
		System.out.println("=========*******==========");
		char select=sc.next().charAt(0);
		Welcome ref1=new Welcome();
		SignUp ref=new SignUp();
		Welcome log=new Welcome();
		if(select=='A'||select=='a') 
		{	
			ref.signup();
			
			ref1.welcome();
			}
		else if(select=='B'||select=='b'){
		 
			log.login();
			
			ref1.welcome();
		}
		else {
			System.out.println("Invalid Input");
			logout();
		}
	}
}
