import java.util.Scanner;
import java.sql.*;

interface BA
{
	abstract void welcome();
}
interface BA2
{
	abstract void welcome2();
}

public class Welcome extends SignUp implements BA,BA2  {
	
	
   

	
	@Override
	public void welcome()
	{
		
		
		System.out.println("Welcome to My Bank");
		System.out.println("=================***********==================");
		System.out.println("You will see the info you want in this site");
		
		System.out.println( "=========================================================================================================================================================");
		System.out.println("|");
		System.out.print("|");
		System.out.println("                                                                Bank                                                                                      ");
		System.out.println("|");
		System.out.println( "=========================================================================================================================================================");
		
		System.out.println("1    :   HOME");
		System.out.println("2    :   PAY");
		System.out.println("3    :   SAVE");
		System.out.println("4    :   INVEST");
		System.out.println("5    :   BORROW");
		System.out.println("6    :   YOUR PROFILE");
		System.out.println("7    :   LOGOUT");

		System.out.println("=================***********==================");

		System.out.println("What sector you would like to explore???");
		System.out.print(" Please Select any option : ");
		Scanner s = new Scanner(System.in);
		int options = s.nextInt();
		switch (options)
		{
		case 1: 
			Home.home();
		break;
		case 2: 
			Pay.pay();
		break;
		case 3: 
			Save.save();
		break;
		case 4: 
			Invest.invest();
		break;
		case 5:
			Borrow ref=new Borrow();
			ref.borrow();
		break;
		case 6: 
			YourProfile.profile();
		break;
		case 7:
			Logout.logout();
		break;
		default: 			
			System.out.println("invalid input");
			welcome();
		break;
		}
	}
	@Override
	public  void welcome2()
	{
		
		System.out.println("Welcome to My Bank");
		System.out.println("=================***********==================");
		System.out.println("You will see the info you want in this site");
		
		System.out.println( "=========================================================================================================================================================");
		System.out.println("|");
		System.out.print("|");
		System.out.println("                                                                Bank                                                                                      ");
		System.out.println("|");
		System.out.println( "=========================================================================================================================================================");
		
		System.out.println("1    :   HOME");
		System.out.println("2    :   PAY");
		System.out.println("3    :   SAVE");
		System.out.println("4    :   INVEST");
		System.out.println("5    :   BORROW");
		System.out.println("6    :   YOUR PROFILE");
		System.out.println("7    :   LOGOUT");

		System.out.println("=================***********==================");

		System.out.println("What sector you would like to explore???");
		System.out.print(" Please Select any option : ");
		Scanner s = new Scanner(System.in);
		int options = s.nextInt();
		switch (options)
		{
		case 1: 
			Home2.home2();
		break;
		case 2: 
			Pay.pay();
		break;
		case 3: 
			Save.save();
		break;
		case 4: 
			Invest.invest();
		break;
		case 5:
			Borrow ref=new Borrow();
			ref.borrow();
		break;
		case 6: 
			YourProfile.profile2();
		break;
		case 7:
			Logout.logout();
		break;
		default: 			
			System.out.println("invalid input");
		
			welcome2();
		break;
		}
	}

}
