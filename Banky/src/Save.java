import java.util.Scanner;

public class Save extends Welcome
{
	public static void save()
	{
	System.out.println("______________________________________________________________________");
	System.out.println("                                                                      ");
	System.out.println("1.Accounts");
	System.out.println("2.Deposits");
	System.out.println("3.Back");
	System.out.println("______________________________________________________________________");
    System.out.println("Select:");
    Scanner sc=new Scanner(System.in);
    int slc= sc.nextInt();
    switch(slc)
    {
    case 1:
    	new Account();
    	Account.account();
    break;
    case 2:
    	new Deposits();
    	Deposits.deposit();
    break;
    case 3: Welcome ho=new Welcome();
    	ho.welcome();
    default:
    	System.out.println("invalid input");
    	save();		//METHOD RECURSSION
    }
   }
//	public static void welcome()
// 	{
//	  System.out.println("=======================================================");
//      System.out.println("                   Welcome to UPI                      ");
//	  System.out.println("=======================================================");
// 	}
}
class Account extends Save
{
	{
		  System.out.println("=======================================================");
	      System.out.println("                      Accounts                         ");
		  System.out.println("=======================================================");
		  
	}
	Account()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Savings Accounts");
		System.out.println("______________________________________________________________________");
		
		System.out.println("Savings Accounts");
		System.out.println(accountno);
		System.out.println("Account Balance:");
		System.out.println(balance);
		System.out.println("1.BACK");
	}
	public static void account()
	{
		int a=sc.nextInt();
		switch(a)
		{
		case 1: save();
		break;
		}
	}
}
class Deposits extends Save
{
	{
		  System.out.println("=======================================================");
	      System.out.println("                      Deposits                         ");
		  System.out.println("=======================================================");
	}
	Deposits()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("      Open Fixed Deposit"); 
		System.out.println("Earn higher interest on your savings along with flexibility & security");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("______________________________________________________________________");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("      Open Tax Saver Deposit"); 
		System.out.println("Get the combination of two benefits - saving tax while earning interest");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("______________________________________________________________________");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("      Open Recurring Deposit"); 
		System.out.println("Invest a pre-decided sum of money every month and start building ");
		System.out.println("for the future");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("______________________________________________________________________");
		System.out.println("1.BACK");
	}
	public static void deposit()
	{
		int a=sc.nextInt();
		switch(a)
		{
		case 1: save();
		break;
		}
	}
}