import java.util.Scanner;
class Home extends Welcome
{
//	protected static long accountno;
	
	public static void home()
	{
		SignUp r=new SignUp();
		String Username=r.getUserName();
		System.out.println(" -------------------------------------------------------------");
		System.out.print("|");
		System.out.print("                           Accounts                           ");
		System.out.println("|");
		System.out.println(" -------------------------------------------------------------");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Savings Account:                                              ");
		System.out.println(accountno);
		System.out.println(balance);
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.Open Accounts");
		System.out.println("2.Show Account Details");
		System.out.println("3.Show Statements");
		System.out.println("4.Share Account Details");
		System.out.println("5.Due Bills");
		System.out.println("6.Back");
	    System.out.println("______________________________________________________________________");
	    System.out.println("Select Option:");
	    Welcome ref1=new Welcome();		
	    Scanner s = new Scanner(System.in);
		int select = s.nextInt();
		switch(select)
		{
		case 1: 
				Accounts acc=new Accounts();
				acc.accounts();
		break;
		case 2: 
				Details det=new Details();
				det.details();
			
		break;
		case 3:
				Statements stat=new Statements();
				stat.statements();
		break;
		case 4:
				ShareDetails share=new ShareDetails();
				share.sharedetails();
		break;
		case 5:
				DueBills due =new DueBills();
				due.duebills();
		break;
		case 6: 
				ref1.welcome();
		break;
		default:
			System.out.println("invalid input");
			home();
		break;
		}
	}
}

class Accounts extends Home
{
	
	Accounts()
	{
		SignUp.accountno=accountno;
		SignUp.balance=balance;
		
	}
	public void accounts()
	{
		System.out.println("Savings Account");
		System.out.println(accountno);
		
		System.out.println("______________________________________________________________________");
		System.out.println("Available Balance");
		System.out.println(balance);
		System.out.println("______________________________________________________________________");
		System.out.println("1.Back");
		int A=sc.nextInt();
		switch(A)
		{
		case 1: home();
		break;
		default:
			System.out.println("invalid input");
			accounts();
		break;
		}
	}
}

class Details extends Home
{
	Details()
	{
		
		SignUp.Bname=Bname;
		SignUp.accountno=accountno;
	}
	public void details()
	{
		SignUp ref=new SignUp();
		System.out.println("Account Holders: "+" " +fullName);
		System.out.println("Branch: "+ Bname);
		System.out.println("IFSC: " +IFSC);
		System.out.println( ref.toString());
//		System.out.println("Phone Number: "+ref.getPhoneNum());
		System.out.println("Account Number: "+accountno);
		System.out.println("1.Back");
		int D=sc.nextInt();
		switch(D)
		{
		case 1: home();
		default:
			System.out.println("invalid input");
			details();
		break;
		}
	}
}
class Statements extends Home
{
	Statements()
	{
	
	}
	public void statements()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("                                                                      ");
		System.out.println("                            Statements                                ");
		System.out.println("                                                                      ");
		System.out.println("______________________________________________________________________");
		System.out.println("Recent Transactions =");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("...");
		System.out.println("1.Back");
		int St=sc.nextInt();
		switch(St)
		{
		case 1: home();
		default:
			System.out.println("invalid input");
			statements();
		break;
		}
	}
}
class ShareDetails extends Home
{
	
	public void sharedetails()
	{
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Send to:-");
		System.out.println("WhatsApp");
		System.out.println("SMS");
		System.out.println("Telegram");
		System.out.println("Twitter");
		System.out.println("Gmail");
		System.out.println("Facebook");
		System.out.println("----------------------------------------------------------------------");

		System.out.println("1.Back");
		int Sh=sc.nextInt();
		switch(Sh)
		{
		case 1: home();
		default:
			System.out.println("invalid input");
			sharedetails();
		break;
		}
	}


}


class DueBills extends Home
{
	DueBills()
	{
   
	}
	public void duebills()
	{
		System.out.println("Register your bills and pay all your bills with one click");
	    System.out.println(" -----------------");
	    System.out.print("|");
		System.out.print("  Add Due Bill   ");
		System.out.println("|");
		System.out.println(" -----------------");
		System.out.println("1.Back");
		int du=sc.nextInt();
		switch(du)
		{
		case 1: home();
		default:
			System.out.println("invalid input");
			duebills();
		break;
		}
	}
}


