
import java.util.Scanner;

public class Invest extends Welcome {

	public static void invest()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.Demat");
		System.out.println("2.Mutual Fund");
		System.out.println("3.Back");
		System.out.println("______________________________________________________________________");
	    System.out.println("Select Option:");
	    Scanner sc=new Scanner(System.in);
	    int select= sc.nextInt();
	    switch(select)
	    {
	    case 1: Demat ref=new Demat();
	    		ref.personalDemat();
	    		ref.findStock();
	    break;
	    case 2: 
	    		MutualFund.mutualFund();
	    break;
	    case 3: Welcome ho=new Welcome();
		ho.welcome();
		break;
		default: 
			System.out.println("invalid input");
			invest();
	    }
	}
}
class Demat extends Invest
{
	{

		  System.out.println("=======================================================");
	      System.out.println("                      Demat                            ");
		  System.out.println("=======================================================");
		  
	}
	
	public void personalDemat()
	{
		System.out.println("________________________________________________");
		System.out.println("                                                ");
		System.out.println("Personal Demat");
		System.out.println("________________________________________________");
		System.out.println("Demat No.");
		System.out.println("Rs.0.00");
	}
	public void findStock()
	{
		System.out.println("________________________________________________");
		System.out.println("                                                ");
		System.out.println("Find a Stock");
		System.out.println("________________________________________________");
		System.out.println("Company Name/ISIN");
		System.out.println("-------------------------------------------------");
		System.out.println("1.Back");
		int se=sc.nextInt();
		switch(se)
		{
		case 1: invest();
		break;
		}
	}
	
}

class MutualFund extends Invest
{
	
	public static void mutualFund()
	{
		System.out.println("Mutual Funds are a great way to build wealth over the");
		System.out.println("long term. My Bank Offers you easy and systematic");
		System.out.println("ways to track and invest in India's best mutual funds.");
		System.out.println("Looks like you do not have an Investment account with");
		System.out.println("us yet.Please visit yourr nearest Bank branch to ");
		System.out.println("activate your account.");
		System.out.println("1.Back");
		int se=sc.nextInt();
		switch(se)
		{
		case 1: invest();
		break;
		}
	}
}
