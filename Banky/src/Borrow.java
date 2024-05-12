import java.util.Scanner;

public class Borrow extends Welcome {

	public void borrow()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.Personal Loan");
		System.out.println("2.Gold Loan");
		System.out.println("3.Car Loan");
		System.out.println("4.Two Wheeler Loan");
		System.out.println("5.Home Loan");
		System.out.println("6.Digital Loan");
		System.out.println("7.Back");
		System.out.println("______________________________________________________________________");
	    System.out.println("Select Option:");
	    Scanner sc=new Scanner(System.in);
	    int slc= sc.nextInt();
	    switch(slc)
	    {
	    
	    case 1: PersonalLoan ref=new PersonalLoan();
	    		ref.loanIn10sec();
	    		ref.personalLoan();
	    		char A= sc.next().charAt(0);
	    		if(A=='A'||A=='a'|| A=='1')
	    		{
	    			ref.applyOnline();
	    		}
	    		else if(A=='B' || A=='b')
	    		{
	    			ref.knowMore();
	    		}
	    		else {
	    			System.out.println("Invalid Input");
	    			 borrow();
	    		}
	    break;
	    case 2: GoldLoan ref1= new GoldLoan();
	    		ref1.goldLoan();
	    		char B=sc.next().charAt(0);
	    		if(B=='A'||B=='a'|| B=='1')
	    		{
	    			ref1.applyOnline();
	    		}
	    		else if(B=='B' || B=='b')
	    		{
	    			ref1.knowMore();
	    		}
	    		else {
	    			System.out.println("Invalid Input");
	    			borrow();
	    		}
	    break;
	    case 3: CarLoan ref2=new CarLoan();
	    		ref2.carLoan();
	    		char C=sc.next().charAt(0);
	    		if(C=='A'||C=='a'|| C=='1')
	    		{
	    			ref2.applyOnline();
	    		}
	    		else if(C=='B' || C=='b')
	    		{
	    			ref2.knowMore();
	    		}
	    		else {
	    			System.out.println("Invalid Input");
	    			borrow();
	    		}
	    break;
	    case 4: TwoWheelerLoan ref3=new TwoWheelerLoan();
				ref3.twowheelerLoan();
				char D=sc.next().charAt(0);
				if(D=='A'||D=='a'|| D=='1')
				{
					ref3.applyOnline();
				}
				else if(D=='B' || D=='b')
				{
					ref3.knowMore();
				}
				else {
					System.out.println("Invalid Input");
					borrow();
				}
		break;	
	    case 5: HomeLoan ref4=new HomeLoan();
				ref4.homeLoan();
				char E=sc.next().charAt(0);
				if(E=='A'||E=='a'|| E=='1')
				{
					ref4.applyOnline();
				}
				else if(E=='B' || E=='b')
				{
					ref4.knowMore();
				}
				else {
					System.out.println("Invalid Input");
					borrow();
				}
	    break;
	    case 6: DigitalLoan ref5= new DigitalLoan();
	    		ref5.digitalLoan();
	    		char F=sc.next().charAt(0);
				if(F=='A'||F=='a'|| F=='1')
				{
					ref5.applyOnline();
				}
				else if(F=='B' || F=='b')
				{
					ref5.knowMore();
				}
				else {
					System.out.println("Invalid Input");
					borrow();
				}
		break;
	    case 7: 
	    		Welcome ho=new Welcome();	
	    		ho.welcome();
		default :
			System.out.println("Invalid Input");
			borrow();
	    }
	}
	
//	public static void welcome()
// 	{
//	  System.out.println("=======================================================");
//      System.out.println("                   Welcome to UPI                      ");
//	  System.out.println("=======================================================");
// 	}
}
class PersonalLoan extends Borrow
{
	{

		  System.out.println("=======================================================");
	      System.out.println("                   Personal Loan                       ");
		  System.out.println("=======================================================");
		  
	}
	public void loanIn10sec()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println(" Personal Loan in 10 seconds");
		System.out.println("                                                                      ");
		System.out.println("Get Money in your account instantly");
		System.out.println("(For selective customers only)");
		System.out.println("                                                                      ");
		System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                     1. APPLY ONLINE                	   ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	}
	public void personalLoan()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println(" Personal Loan ");
		System.out.println("                                                                      ");
		System.out.println("Check your eligibility and apply instantly");
		System.out.println("(in-principle Approval in 10 mins*)");
		System.out.println("                                                                      ");
		System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                   A.  APPLY ONLINE                       ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	    System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                    B.  KNOW MORE                         ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	}
	public void applyOnline()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.print("| We've Helped Lakhs fulfill                           ");
		System.out.println("|");
		System.out.print("| their duty and reach their dreams                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.print("| * Avail loan up to Rs.40 Lakhs                       ");
		System.out.println("|");
		System.out.print("| * Enjoy competitive interest rates starting at 10.50%");
		System.out.println("|");
		System.out.print("| * Get eligibility check in just 5 minutes & loan     ");
		System.out.println("|");
		System.out.print("|   release in 2                                       ");
		System.out.println("|");
		System.out.print("| * Relax with flexible EMIs-choose repayment          ");
		System.out.println("|");
		System.out.print("|   duration upto 3 years                              ");
		System.out.println("|");
		System.out.println("|");
		System.out.print("| * Track application easily on our mobile app         ");
		System.out.println("|");
		System.out.print("| * Enjoy secure doorstep documentation                ");
		System.out.println("|");
		System.out.print("| * Secure yourself with accident cover & loan security");
		System.out.println("|");
		System.out.print("|   at normal premium Chat/contact our live            ");
		System.out.println("|");
		System.out.print("| * assistant for any help you need                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.println("_____________________________________________________");
		System.out.println("-------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("  Mobile Number                                        ");
	    System.out.println("|");
	    System.out.println("  ------------------------------------------------------");
	    System.out.println("[] I authorize My Bank and its representatives to Call,");
	    System.out.println("   SMS or communicate via WhatsApp. This consent overr-");
	    System.out.println("   -ides any registration for DNC/NDNC. I confirm I am ");
	    System.out.println("   in India, I am a major and a resident of India and I");
	    System.out.println("   have read and I accept My Bank's Privacy Policy");
	    System.out.println("   Click here to read PRIVACY POLICY and provide CONSENT");
	    System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
	}
	public void knowMore()
	{
		System.out.println("==================================================================");
	    System.out.println("               Personal Loan Online                     ");
	    System.out.println("                   ");
	    System.out.println("Fulfill your financial needs with loan distribrsal in 10 seconds* ");
	    System.out.println("#LiveYourWay");
	    System.out.println("==================================================================");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("My Bank Personal Loan is designed to fulfill your 	 ");
		System.out.println("diverse monetary needs easily and quickly, making it ");
		System.out.println("one of the best credit options. A Personal Loan is   ");
		System.out.println("ideal for funding planned events, such as marriages, ");
		System.out.println("vacations & home renovation or unplanned ones, kike  ");
		System.out.println("emergency medical procedures. The best part is that  ");
		System.out.println("you can get a Personal Loan quickly through an end to");
		System.out.println("end online process for your every need.");
		System.out.println("_____________________________________________________");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("Check if you have a Pre-approved Loan Offer");
		System.out.println(" -------------");
		System.out.print("|");
	    System.out.print(" CHECK OFFER ");
	    System.out.println("|");
	    System.out.println(" -------------");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("CALCULATE YOUR LOAN EMI--");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Ammount you need in Rs.: ");
		System.out.println("for how many years: ");
		System.out.println("Interest ratr of: ");
		System.out.println("                      ");
		System.out.println("                                  -----------");
		System.out.print("                                 |");
	    System.out.print(" CALCULATE ");
	    System.out.println("|");
	    System.out.println("                                  -----------");
	    System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("FEATURES-->");
		System.out.println(" ");
		System.out.println("Get a personal loan in quick time");
		System.out.println(" * Check eligibility in one minute online and at");
		System.out.println("   select branches.");
		System.out.println(" * Get funds on 10 seconds if you are a pre-approved. ");
		System.out.println(" * Other customers can get a loan within 4 working ");
		System.out.println("   days subject to documentation and verification as ");
		System.out.println("   per bank's requirement.");
		System.out.println("   ");
		System.out.println("APPLY ONLINE for a PERSONAL LOAN");
		System.out.println("_____________________________________________________");
	}
}
class GoldLoan extends Borrow
{
	{

		  System.out.println("=======================================================");
	      System.out.println("                     Gold Loan                         ");
		  System.out.println("=======================================================");
		  
	}
	public void goldLoan()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println(" Gold Loan ");
		System.out.println("                                                                      ");
		System.out.println("Check your eligibility and apply instantly");
		System.out.println("(in-principle Approval in 10 mins*)");
		System.out.println("                                                                      ");
		System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                   A.  APPLY ONLINE                       ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	    System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                    B.  KNOW MORE                         ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	}
	
	public void applyOnline()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.print("| We've Helped Lakhs fulfill                           ");
		System.out.println("|");
		System.out.print("| their duty and reach their dreams                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.print("| * Avail loan up to Rs.50 Lakhs                       ");
		System.out.println("|");
		System.out.print("| * Enjoy competitive interest rates starting at 10.50%");
		System.out.println("|");
		System.out.print("| * Get eligibility check in just 5 minutes & loan     ");
		System.out.println("|");
		System.out.print("|   release in 2                                       ");
		System.out.println("|");
		System.out.print("| * Relax with flexible EMIs-choose repayment          ");
		System.out.println("|");
		System.out.print("|   duration upto 3 years                              ");
		System.out.println("|");
		System.out.println("|");
		System.out.print("| * Track application easily on our mobile app         ");
		System.out.println("|");
		System.out.print("| * Enjoy secure doorstep documentation                ");
		System.out.println("|");
		System.out.print("| * Secure yourself with accident cover & loan security");
		System.out.println("|");
		System.out.print("|   at normal premium Chat/contact our live            ");
		System.out.println("|");
		System.out.print("| * assistant for any help you need                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.println("_____________________________________________________");
		System.out.println("-------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("  Mobile Number                                        ");
	    System.out.println("|");
	    System.out.println("  ------------------------------------------------------");
	    System.out.println("[] I authorize My Bank and its representatives to Call,");
	    System.out.println("   SMS or communicate via WhatsApp. This consent overr-");
	    System.out.println("   -ides any registration for DNC/NDNC. I confirm I am ");
	    System.out.println("   in India, I am a major and a resident of India and I");
	    System.out.println("   have read and I accept My Bank's Privacy Policy");
	    System.out.println("   Click here to read PRIVACY POLICY and provide CONSENT");
	    System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
	}
	public void knowMore()
	{
		System.out.println("==================================================================");
	    System.out.println("               GOLD Loan Online                     ");
	    System.out.println("                   ");
	    System.out.println("Fulfill your financial needs with loan distribrsal in 10 seconds* ");
	    System.out.println("#LiveYourWay");
	    System.out.println("==================================================================");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("My Bank Personal Loan is designed to fulfill your 	 ");
		System.out.println("diverse monetary needs easily and quickly, making it ");
		System.out.println("one of the best credit options. A Personal Loan is   ");
		System.out.println("ideal for funding planned events, such as marriages, ");
		System.out.println("vacations & home renovation or unplanned ones, kike  ");
		System.out.println("emergency medical procedures. The best part is that  ");
		System.out.println("you can get a Personal Loan quickly through an end to");
		System.out.println("end online process for your every need.");
		System.out.println("_____________________________________________________");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("Check if you have a Pre-approved Loan Offer");
		System.out.println(" -------------");
		System.out.print("|");
	    System.out.print(" CHECK OFFER ");
	    System.out.println("|");
	    System.out.println(" -------------");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("CALCULATE YOUR LOAN EMI--");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Ammount you need in Rs.: ");
		System.out.println("for how many years: ");
		System.out.println("Interest ratr of: ");
		System.out.println("                      ");
		System.out.println("                                  -----------");
		System.out.print("                                 |");
	    System.out.print(" CALCULATE ");
	    System.out.println("|");
	    System.out.println("                                  -----------");
	    System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("FEATURES-->");
		System.out.println(" ");
		System.out.println("Get a personal loan in quick time");
		System.out.println(" * Check eligibility in one minute online and at");
		System.out.println("   select branches.");
		System.out.println(" * Get funds on 10 seconds if you are a pre-approved. ");
		System.out.println(" * Other customers can get a loan within 4 working ");
		System.out.println("   days subject to documentation and verification as ");
		System.out.println("   per bank's requirement.");
		System.out.println("   ");
		System.out.println("APPLY ONLINE for a PERSONAL LOAN");
		System.out.println("_____________________________________________________");
	}
}
class CarLoan extends Borrow
{
	{

		  System.out.println("=======================================================");
	      System.out.println("                      Car Loan                         ");
		  System.out.println("=======================================================");
		  
	}
	public void carLoan()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println(" Car Loan ");
		System.out.println("                                                                      ");
		System.out.println("Check your eligibility and apply instantly");
		System.out.println("(in-principle Approval in 10 mins*)");
		System.out.println("                                                                      ");
		System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                   A.  APPLY ONLINE                       ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	    System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                    B.  KNOW MORE                         ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	}
	public void applyOnline()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.print("| We've Helped Lakhs fulfill                           ");
		System.out.println("|");
		System.out.print("| their duty and reach their dreams                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.print("| * Avail loan up to Rs.40 Lakhs                       ");
		System.out.println("|");
		System.out.print("| * Enjoy competitive interest rates starting at 10.50%");
		System.out.println("|");
		System.out.print("| * Get eligibility check in just 5 minutes & loan     ");
		System.out.println("|");
		System.out.print("|   release in 2                                       ");
		System.out.println("|");
		System.out.print("| * Relax with flexible EMIs-choose repayment          ");
		System.out.println("|");
		System.out.print("|   duration upto 3 years                              ");
		System.out.println("|");
		System.out.println("|");
		System.out.print("| * Track application easily on our mobile app         ");
		System.out.println("|");
		System.out.print("| * Enjoy secure doorstep documentation                ");
		System.out.println("|");
		System.out.print("| * Secure yourself with accident cover & loan security");
		System.out.println("|");
		System.out.print("|   at normal premium Chat/contact our live            ");
		System.out.println("|");
		System.out.print("| * assistant for any help you need                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.println("_____________________________________________________");
		System.out.println("-------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("  Mobile Number                                        ");
	    System.out.println("|");
	    System.out.println("  ------------------------------------------------------");
	    System.out.println("[] I authorize My Bank and its representatives to Call,");
	    System.out.println("   SMS or communicate via WhatsApp. This consent overr-");
	    System.out.println("   -ides any registration for DNC/NDNC. I confirm I am ");
	    System.out.println("   in India, I am a major and a resident of India and I");
	    System.out.println("   have read and I accept My Bank's Privacy Policy");
	    System.out.println("   Click here to read PRIVACY POLICY and provide CONSENT");
	    System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
	}
	public void knowMore()
	{
		System.out.println("==================================================================");
	    System.out.println("               Car Loan Online                     ");
	    System.out.println("                   ");
	    System.out.println("Fulfill your financial needs with loan distribrsal in 10 seconds* ");
	    System.out.println("#LiveYourWay");
	    System.out.println("==================================================================");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("My Bank Personal Loan is designed to fulfill your 	 ");
		System.out.println("diverse monetary needs easily and quickly, making it ");
		System.out.println("one of the best credit options. A Personal Loan is   ");
		System.out.println("ideal for funding planned events, such as marriages, ");
		System.out.println("vacations & home renovation or unplanned ones, kike  ");
		System.out.println("emergency medical procedures. The best part is that  ");
		System.out.println("you can get a Personal Loan quickly through an end to");
		System.out.println("end online process for your every need.");
		System.out.println("_____________________________________________________");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("Check if you have a Pre-approved Loan Offer");
		System.out.println(" -------------");
		System.out.print("|");
	    System.out.print(" CHECK OFFER ");
	    System.out.println("|");
	    System.out.println(" -------------");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("CALCULATE YOUR LOAN EMI--");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Ammount you need in Rs.: ");
		System.out.println("for how many years: ");
		System.out.println("Interest ratr of: ");
		System.out.println("                      ");
		System.out.println("                                  -----------");
		System.out.print("                                 |");
	    System.out.print(" CALCULATE ");
	    System.out.println("|");
	    System.out.println("                                  -----------");
	    System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("FEATURES-->");
		System.out.println(" ");
		System.out.println("Get a personal loan in quick time");
		System.out.println(" * Check eligibility in one minute online and at");
		System.out.println("   select branches.");
		System.out.println(" * Get funds on 10 seconds if you are a pre-approved. ");
		System.out.println(" * Other customers can get a loan within 4 working ");
		System.out.println("   days subject to documentation and verification as ");
		System.out.println("   per bank's requirement.");
		System.out.println("   ");
		System.out.println("APPLY ONLINE for a PERSONAL LOAN");
		System.out.println("_____________________________________________________");
	}
}
class TwoWheelerLoan extends Borrow
{
	{

		  System.out.println("=======================================================");
	      System.out.println("                 Two Wheeler Loan                      ");
		  System.out.println("=======================================================");
		  
	}
	public void twowheelerLoan()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println(" Two Wheeler Loan ");
		System.out.println("                                                                      ");
		System.out.println("Check your eligibility and apply instantly");
		System.out.println("(in-principle Approval in 10 mins*)");
		System.out.println("                                                                      ");
		System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                   A.  APPLY ONLINE                       ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	    System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                    B.  KNOW MORE                         ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	}
	public void applyOnline()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.print("| We've Helped Lakhs fulfill                           ");
		System.out.println("|");
		System.out.print("| their duty and reach their dreams                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.print("| * Avail loan up to Rs.40 Lakhs                       ");
		System.out.println("|");
		System.out.print("| * Enjoy competitive interest rates starting at 10.50%");
		System.out.println("|");
		System.out.print("| * Get eligibility check in just 5 minutes & loan     ");
		System.out.println("|");
		System.out.print("|   release in 2                                       ");
		System.out.println("|");
		System.out.print("| * Relax with flexible EMIs-choose repayment          ");
		System.out.println("|");
		System.out.print("|   duration upto 3 years                              ");
		System.out.println("|");
		System.out.println("|");
		System.out.print("| * Track application easily on our mobile app         ");
		System.out.println("|");
		System.out.print("| * Enjoy secure doorstep documentation                ");
		System.out.println("|");
		System.out.print("| * Secure yourself with accident cover & loan security");
		System.out.println("|");
		System.out.print("|   at normal premium Chat/contact our live            ");
		System.out.println("|");
		System.out.print("| * assistant for any help you need                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.println("_____________________________________________________");
		System.out.println("-------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("  Mobile Number                                        ");
	    System.out.println("|");
	    System.out.println("  ------------------------------------------------------");
	    System.out.println("[] I authorize My Bank and its representatives to Call,");
	    System.out.println("   SMS or communicate via WhatsApp. This consent overr-");
	    System.out.println("   -ides any registration for DNC/NDNC. I confirm I am ");
	    System.out.println("   in India, I am a major and a resident of India and I");
	    System.out.println("   have read and I accept My Bank's Privacy Policy");
	    System.out.println("   Click here to read PRIVACY POLICY and provide CONSENT");
	    System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
	}
	public void knowMore()
	{
		System.out.println("==================================================================");
	    System.out.println("               Two Wheeler Loan Online                     ");
	    System.out.println("                   ");
	    System.out.println("Fulfill your financial needs with loan distribrsal in 10 seconds* ");
	    System.out.println("#LiveYourWay");
	    System.out.println("==================================================================");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("My Bank Personal Loan is designed to fulfill your 	 ");
		System.out.println("diverse monetary needs easily and quickly, making it ");
		System.out.println("one of the best credit options. A Personal Loan is   ");
		System.out.println("ideal for funding planned events, such as marriages, ");
		System.out.println("vacations & home renovation or unplanned ones, kike  ");
		System.out.println("emergency medical procedures. The best part is that  ");
		System.out.println("you can get a Personal Loan quickly through an end to");
		System.out.println("end online process for your every need.");
		System.out.println("_____________________________________________________");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("Check if you have a Pre-approved Loan Offer");
		System.out.println(" -------------");
		System.out.print("|");
	    System.out.print(" CHECK OFFER ");
	    System.out.println("|");
	    System.out.println(" -------------");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("CALCULATE YOUR LOAN EMI--");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Ammount you need in Rs.: ");
		System.out.println("for how many years: ");
		System.out.println("Interest ratr of: ");
		System.out.println("                      ");
		System.out.println("                                  -----------");
		System.out.print("                                 |");
	    System.out.print(" CALCULATE ");
	    System.out.println("|");
	    System.out.println("                                  -----------");
	    System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("FEATURES-->");
		System.out.println(" ");
		System.out.println("Get a personal loan in quick time");
		System.out.println(" * Check eligibility in one minute online and at");
		System.out.println("   select branches.");
		System.out.println(" * Get funds on 10 seconds if you are a pre-approved. ");
		System.out.println(" * Other customers can get a loan within 4 working ");
		System.out.println("   days subject to documentation and verification as ");
		System.out.println("   per bank's requirement.");
		System.out.println("   ");
		System.out.println("APPLY ONLINE for a PERSONAL LOAN");
		System.out.println("_____________________________________________________");
	}
}
class HomeLoan extends Borrow
{
	{

		  System.out.println("=======================================================");
	      System.out.println("                     Home Loan                         ");
		  System.out.println("=======================================================");
		  
	}
	public void homeLoan()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println(" Home Loan ");
		System.out.println("                                                                      ");
		System.out.println("Check your eligibility and apply instantly");
		System.out.println("(in-principle Approval in 10 mins*)");
		System.out.println("                                                                      ");
		System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                   A.  APPLY ONLINE                       ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	    System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                    B.  KNOW MORE                         ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	}
	public void applyOnline()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.print("| We've Helped Lakhs fulfill                           ");
		System.out.println("|");
		System.out.print("| their duty and reach their dreams                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.print("| * Avail loan up to Rs.40 Lakhs                       ");
		System.out.println("|");
		System.out.print("| * Enjoy competitive interest rates starting at 10.50%");
		System.out.println("|");
		System.out.print("| * Get eligibility check in just 5 minutes & loan     ");
		System.out.println("|");
		System.out.print("|   release in 2                                       ");
		System.out.println("|");
		System.out.print("| * Relax with flexible EMIs-choose repayment          ");
		System.out.println("|");
		System.out.print("|   duration upto 3 years                              ");
		System.out.println("|");
		System.out.println("|");
		System.out.print("| * Track application easily on our mobile app         ");
		System.out.println("|");
		System.out.print("| * Enjoy secure doorstep documentation                ");
		System.out.println("|");
		System.out.print("| * Secure yourself with accident cover & loan security");
		System.out.println("|");
		System.out.print("|   at normal premium Chat/contact our live            ");
		System.out.println("|");
		System.out.print("| * assistant for any help you need                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.println("_____________________________________________________");
		System.out.println("-------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("  Mobile Number                                        ");
	    System.out.println("|");
	    System.out.println("  ------------------------------------------------------");
	    System.out.println("[] I authorize My Bank and its representatives to Call,");
	    System.out.println("   SMS or communicate via WhatsApp. This consent overr-");
	    System.out.println("   -ides any registration for DNC/NDNC. I confirm I am ");
	    System.out.println("   in India, I am a major and a resident of India and I");
	    System.out.println("   have read and I accept My Bank's Privacy Policy");
	    System.out.println("   Click here to read PRIVACY POLICY and provide CONSENT");
	    System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
	}
	public void knowMore()
	{
		System.out.println("==================================================================");
	    System.out.println("               Home Loan Online                     ");
	    System.out.println("                   ");
	    System.out.println("Fulfill your financial needs with loan distribrsal in 10 seconds* ");
	    System.out.println("#LiveYourWay");
	    System.out.println("==================================================================");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("My Bank Personal Loan is designed to fulfill your 	 ");
		System.out.println("diverse monetary needs easily and quickly, making it ");
		System.out.println("one of the best credit options. A Personal Loan is   ");
		System.out.println("ideal for funding planned events, such as marriages, ");
		System.out.println("vacations & home renovation or unplanned ones, kike  ");
		System.out.println("emergency medical procedures. The best part is that  ");
		System.out.println("you can get a Personal Loan quickly through an end to");
		System.out.println("end online process for your every need.");
		System.out.println("_____________________________________________________");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("Check if you have a Pre-approved Loan Offer");
		System.out.println(" -------------");
		System.out.print("|");
	    System.out.print(" CHECK OFFER ");
	    System.out.println("|");
	    System.out.println(" -------------");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("CALCULATE YOUR LOAN EMI--");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Ammount you need in Rs.: ");
		System.out.println("for how many years: ");
		System.out.println("Interest ratr of: ");
		System.out.println("                      ");
		System.out.println("                                  -----------");
		System.out.print("                                 |");
	    System.out.print(" CALCULATE ");
	    System.out.println("|");
	    System.out.println("                                  -----------");
	    System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("FEATURES-->");
		System.out.println(" ");
		System.out.println("Get a personal loan in quick time");
		System.out.println(" * Check eligibility in one minute online and at");
		System.out.println("   select branches.");
		System.out.println(" * Get funds on 10 seconds if you are a pre-approved. ");
		System.out.println(" * Other customers can get a loan within 4 working ");
		System.out.println("   days subject to documentation and verification as ");
		System.out.println("   per bank's requirement.");
		System.out.println("   ");
		System.out.println("APPLY ONLINE for a PERSONAL LOAN");
		System.out.println("_____________________________________________________");
	}
}
class DigitalLoan extends Borrow
{
	{

		  System.out.println("=======================================================");
	      System.out.println("                    Digital Loan                       ");
		  System.out.println("=======================================================");
		  
	}
	public void digitalLoan()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println(" Digital Loan ");
		System.out.println("                                                                      ");
		System.out.println("Check your eligibility and apply instantly");
		System.out.println("(in-principle Approval in 10 mins*)");
		System.out.println("                                                                      ");
		System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                   A.  APPLY ONLINE                       ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	    System.out.println("  --------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("                    B.  KNOW MORE                         ");
	    System.out.println("|");
	    System.out.println("  --------------------------------------------------------");
	}
	public void applyOnline()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.print("| We've Helped Lakhs fulfill                           ");
		System.out.println("|");
		System.out.print("| their duty and reach their dreams                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.print("| * Avail loan up to Rs.40 Lakhs                       ");
		System.out.println("|");
		System.out.print("| * Enjoy competitive interest rates starting at 10.50%");
		System.out.println("|");
		System.out.print("| * Get eligibility check in just 5 minutes & loan     ");
		System.out.println("|");
		System.out.print("|   release in 2                                       ");
		System.out.println("|");
		System.out.print("| * Relax with flexible EMIs-choose repayment          ");
		System.out.println("|");
		System.out.print("|   duration upto 3 years                              ");
		System.out.println("|");
		System.out.println("|");
		System.out.print("| * Track application easily on our mobile app         ");
		System.out.println("|");
		System.out.print("| * Enjoy secure doorstep documentation                ");
		System.out.println("|");
		System.out.print("| * Secure yourself with accident cover & loan security");
		System.out.println("|");
		System.out.print("|   at normal premium Chat/contact our live            ");
		System.out.println("|");
		System.out.print("| * assistant for any help you need                    ");
		System.out.println("|");
		System.out.print("|                                                      ");
		System.out.println("|");
		System.out.println("_____________________________________________________");
		System.out.println("-------------------------------------------------------");
		System.out.print("| ");
	    System.out.print("  Mobile Number                                        ");
	    System.out.println("|");
	    System.out.println("  ------------------------------------------------------");
	    System.out.println("[] I authorize My Bank and its representatives to Call,");
	    System.out.println("   SMS or communicate via WhatsApp. This consent overr-");
	    System.out.println("   -ides any registration for DNC/NDNC. I confirm I am ");
	    System.out.println("   in India, I am a major and a resident of India and I");
	    System.out.println("   have read and I accept My Bank's Privacy Policy");
	    System.out.println("   Click here to read PRIVACY POLICY and provide CONSENT");
	    System.out.println("--------------------------------------------------------");
		System.out.println(" Let's Get Started ");
		System.out.println("--------------------------------------------------------");
	}
	public void knowMore()
	{
		System.out.println("==================================================================");
	    System.out.println("               Digital Loan Online                     ");
	    System.out.println("                   ");
	    System.out.println("Fulfill your financial needs with loan distribrsal in 10 seconds* ");
	    System.out.println("#LiveYourWay");
	    System.out.println("==================================================================");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("My Bank Personal Loan is designed to fulfill your 	 ");
		System.out.println("diverse monetary needs easily and quickly, making it ");
		System.out.println("one of the best credit options. A Personal Loan is   ");
		System.out.println("ideal for funding planned events, such as marriages, ");
		System.out.println("vacations & home renovation or unplanned ones, kike  ");
		System.out.println("emergency medical procedures. The best part is that  ");
		System.out.println("you can get a Personal Loan quickly through an end to");
		System.out.println("end online process for your every need.");
		System.out.println("_____________________________________________________");
		System.out.println("_____________________________________________________");
		System.out.println("                                                     ");
		System.out.println("Check if you have a Pre-approved Loan Offer");
		System.out.println(" -------------");
		System.out.print("|");
	    System.out.print(" CHECK OFFER ");
	    System.out.println("|");
	    System.out.println(" -------------");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("CALCULATE YOUR LOAN EMI--");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Ammount you need in Rs.: ");
		System.out.println("for how many years: ");
		System.out.println("Interest ratr of: ");
		System.out.println("                      ");
		System.out.println("                                  -----------");
		System.out.print("                                 |");
	    System.out.print(" CALCULATE ");
	    System.out.println("|");
	    System.out.println("                                  -----------");
	    System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("  ");
		System.out.println("_____________________________________________________");
		System.out.println("FEATURES-->");
		System.out.println(" ");
		System.out.println("Get a personal loan in quick time");
		System.out.println(" * Check eligibility in one minute online and at");
		System.out.println("   select branches.");
		System.out.println(" * Get funds on 10 seconds if you are a pre-approved. ");
		System.out.println(" * Other customers can get a loan within 4 working ");
		System.out.println("   days subject to documentation and verification as ");
		System.out.println("   per bank's requirement.");
		System.out.println("   ");
		System.out.println("APPLY ONLINE for a PERSONAL LOAN");
		System.out.println("_____________________________________________________");
	}
}