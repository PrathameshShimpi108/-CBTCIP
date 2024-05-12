import java.util.Scanner;

 public class Pay extends Welcome {
//	int UPI_id=123;
//	long Phoneno=9891219291l;
//	long Accountno=92919139197311313l;
//	long debit_Cardno=92937432781039l;
	 public static void pay()
	 {
		
	 	System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.UPI Payment");
		System.out.println("2.Money Transfer");
		System.out.println("3.Cards");
		System.out.println("4.Recharge");
		System.out.println("5.Cheques");
		System.out.println("6.Bill Pay");
		System.out.println("7.Back");
		System.out.println("______________________________________________________________________");
	    System.out.println("Select Option:");
	    Scanner sc=new Scanner(System.in);
	    int slc= sc.nextInt();
	    switch(slc)
	    {
	    case 1: 
	    	UPI.upi();
	    break;
	    case 2:
	    	MoneyTransfer.moneyTransfer();
	    break;
	    case 3: 
	    	Cards.card();
	    break;
	    case 4: 
	    		Recharge ref=new Recharge();
	    		Recharge.recharge();
	    		
	    break;
//	    	switch(A)
//	    	{
//	    	case 'A':  case 'a' : ref.Mobile();
//	    	break;
//	    	case 'B':  case 'b' : ref.DataCard();
//	    	break;
//	    	case 'C':  case 'c' : ref.DTH();
//	    	break;

	    case 5:
	    	Cheque ref3=new Cheque();
	    		char sel=sc.next().charAt(0);
	   
	    		switch(sel)
	    		{
	    		case 'A':case 'a': 
	    			ref3.Status();
	    		break;
	    		case 'B': case 'b': 
	    			ref3.StopPayment();
	    		break;
	    		case 'C': case 'c': 
	    			ref3.GetNew();
	    		break;
	    		default:
	    			System.out.println("--Invalid Input--");
	    			
	    		break;
	    		}
	    break;
	    case 6: 
	    	BillPay ref1=new BillPay();
	    	ref1.billPay();
	    		
		break;
	    case 7: Welcome ho=new Welcome(); 	
	    		ho.welcome(); 
	    break;
		default: 
			System.out.println("invalid input");
			pay();
	      }
	    }
	 
	
	 
}
 
class UPI extends Pay
{
	
	static{

	  System.out.println("=======================================================");
      System.out.println("                       UPI                             ");
	  System.out.println("=======================================================");
	  
	}
	
//	{
//	  System.out.println("Select UPI Mode");
//	}
	public static void upi()
	{
		SignUp ref=new SignUp();
		System.out.println("Select UPI Mode");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.Send Money");
		System.out.println("2.Request Money");
		System.out.println("3.Scan & Pay");
		System.out.println("4.Split Bill");
		 System.out.println("5.Back");
		System.out.println("______________________________________________________________________");
		System.out.println("------------------");
		System.out.print("| ");
	    System.out.print("Select Option: ");
	    System.out.println("|");
	    System.out.println("------------------");
	    System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Payment Request Received");
		System.out.println("You have no payment requests pending");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");	
		System.out.println("                                                                      ");
		System.out.println("Your UPI ID                                             ");
		System.out.println(UPIid);
		System.out.println("Deregister UPI ID");
		System.out.println(ref.getPhoneNum());
	    System.out.println("______________________________________________________________________");
	    System.out.println("______________________________________________________________________");
	    System.out.println("Linked Accounts");
	    System.out.println("Default Account: "+ Bank);
	    System.out.println(accountno);
	    System.out.println("Balance: "+ balance);
	   
	    Scanner sc=new Scanner(System.in);
	    int select = sc.nextInt();
		switch(select)
		{
		case 1: SendMoney send= new SendMoney("9281949148@hdfc");
				send.sendMoney();
		break;
		case 2: RequestMoney req=new RequestMoney();
				req.requestMoney();
		
		break;
		case 3: ScanPay sca=new ScanPay();
		  		sca.scanPay();
		break;
		case 4:SplitBill split= new SplitBill();
				split.splitBill();
		break;
		case 5: pay();
		break;
		}
	}
}
class SendMoney extends UPI
{
	SendMoney(String UPIid)
	{
		this.UPIid=UPIid;
		
	}
	public void sendMoney()
	{
		System.out.println("From");
		System.out.println(UPIid);
		System.out.println(Bank+"-"+accountno);
		System.out.println("Balance " + balance);
		System.out.println("___________________________________________________________");
		System.out.println("Transfer to"); 
		System.out.println("===========================================================");
		System.out.println("                                                           ");
		System.out.print("UPI ID");
		System.out.print(" |   Send Money   | ");
		System.out.println(" |   Mobile Number  | ");
		System.out.println("                                                           ");
		System.out.println("===========================================================");
		System.out.println("1.Back");
		int se=sc.nextInt();
		switch(se)
		{
		case 1: upi();
		break;
		}
	}
}
class RequestMoney extends UPI
{
	
	public void requestMoney()
	{
		System.out.println("Payer UPI ID:");
		System.out.println("Payer Name:");
		System.out.println("Amount:");
		System.out.println("Remarks:");
		System.out.println("-----------");
		System.out.print("| ");
	    System.out.print(" Continue ");
	    System.out.println("|");
	    System.out.println("-----------");
		System.out.println("-----------");
		System.out.print("| ");
	    System.out.print(" Cancel ");
	    System.out.println("|");
	    System.out.println("-----------");
	    System.out.println("1.Back");
		int se=sc.nextInt();
		switch(se)
		{
		case 1: upi();
		break;
		}
	}
}

class ScanPay extends UPI
{
	static 
	{
			System.out.println("==================================================================");
			System.out.println("                           SCAN & PAY                             ");
			System.out.println("==================================================================");
	}
	
	public void scanPay()
	{
		System.out.println("Scan Qr Code");
		System.out.println("____________________________________________________");
		System.out.println("                                                    ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("____________________________________________________");
		System.out.println("1.Back");
		int se=sc.nextInt();
		switch(se)
		{
		case 1: upi();
		break;
		}
	}
}
class SplitBill extends UPI
{
	static 
	{
			System.out.println("==================================================================");
			System.out.println("                           SPLIT BILL                             ");
			System.out.println("==================================================================");
	}
	
	public void splitBill()
	{
		System.out.println("ADD EXPENSE");
		System.out.println("____________________________________________________");
		System.out.println("Amount:");
		System.out.println("Remarks:");
		System.out.println("Add Contacts:");
		System.out.println("UPI ID or Mobile");
		System.out.println("Split");
		System.out.println("_____________________________");
		System.out.println("                             ");
		System.out.println("   Equally   |   Unequally   ");
		System.out.println("_____________________________");
		System.out.println(fullName);
		System.out.println(UPIid);
		System.out.println("-----------");
		System.out.print("| ");
	    System.out.print(" Continue ");
	    System.out.println("|");
	    System.out.println("-----------");
		System.out.println("-----------");
		System.out.print("| ");
	    System.out.print(" Cancel ");
	    System.out.println("|");
	    System.out.println("-----------");
	    System.out.println("1.Back");
		int se=sc.nextInt();
		switch(se)
		{
		case 1: upi();
		break;
		}
	}
	
}

class MoneyTransfer extends Pay
{
	static 
	{
			System.out.println("==================================================================");
			System.out.println("                         MONEY TRANSFER                           ");
			System.out.println("==================================================================");
	}
	public static void moneyTransfer()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("From");
		System.out.println(UPIid);
		System.out.println(Bank+"-"+accountno);
		System.out.println("Balance " + balance);
		System.out.println("To");
		System.out.println("Enter Payee Name");
		System.out.println("Enter Payee Account Number");
		System.out.println("______________________________________________________________________");
		System.out.println("1.Back");
		int se=sc.nextInt();
		switch(se)
		{
		case 1: pay();
		break;
		}
	}
	
}

class Cards extends Pay
{
	static 
	{
			System.out.println("=========================================================");
			System.out.println("                         Cards                           ");
			System.out.println("=========================================================");
	}
	public static void card()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Select Card");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("1.Credit Card");
		System.out.println("2.Debit Card");
		System.out.println("3.Show inactive Cards");
		System.out.println("4.Back");
		System.out.println("______________________________________________________________________");
		Scanner sca=new Scanner(System.in);
		int card=sca.nextInt();
		switch(card)
		{
		case 1: new CreditCard();
				CreditCard.creditCard();
		break;
		case 2: new DebitCard();
				DebitCard.debitCard();
		break;
		case 3: new InActive();
				InActive.inActive();
		break;
		case 4: pay();
		break;
		default: pay();
		break;
		}
		
	}
}
	class CreditCard extends Cards
	{
		
		public static void creditCard()
		{
			System.out.println("______________________________________________________________________");
			System.out.println("                                                                      ");
			System.out.println("Credit Cards");
			System.out.println("______________________________________________________________________");
			System.out.println("Card Type: ");
			System.out.println("Credit Card No.: ");
			System.out.println("Linked Accounts");
			System.out.println("Savings - "+ accountno);
			System.out.println("----------------------------------------------------------------------");
		}
	}
	class DebitCard extends Cards
	{
		
		public static void debitCard()
		{

			System.out.println("______________________________________________________________________");
			System.out.println("                                                                      ");
			System.out.println("Debit Cards");
			System.out.println("______________________________________________________________________");
			System.out.println("Card Type: ");
			System.out.println("Credit Card No.: ");
			System.out.println("Linked Accounts");
			System.out.println("Savings - "+ accountno);
			System.out.println("----------------------------------------------------------------------");
		}
	}
	class InActive extends Cards
	{
		
		public static void inActive()
		{
			System.out.println("______________________________________________________________________");
			System.out.println("                                                                      ");
			System.out.println("                          No Inactive Cards                           ");
			System.out.println("______________________________________________________________________");
		}
	}

class Recharge extends Pay
{
	{
		System.out.println("=========================================================");
		System.out.println("                       Recharge                          ");
		System.out.println("=========================================================");
	}
	public static void recharge()
	{
		System.out.println("New Recharge");
		System.out.println("                                      ");
		System.out.println("---------------------------------------");
		System.out.println(" A. Mobile |  B. Data Card  | C. DTH  |");
		System.out.println("---------------------------------------");
		System.out.println("Enter Mobile Number");
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
	    char A=sc.next().charAt(0);
		if(A=='A'||A=='a')
		{
			Mobile();
		}
		else if(A=='B'|| A=='b')
		{
			DataCard();
		}
		else if(A=='C'||A=='c')
		{
			DTH();
		}
		else if(A=='D'||A=='d')
		{
			pay();
		}
		else
		{
			System.out.println("--Invalid Input--");
		}
	}
	public static void Mobile()
	{
		SignUp ref=new SignUp();
		System.out.println("__________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("                Mobile Prepaid Recharge                   ");
		System.out.println("__________________________________________________________");
		System.out.println("Mobile Number");
		System.out.println(ref.getPhoneNum());
		System.out.println("_______________________");
		System.out.print("Service Provider");
		System.out.println("-Enter Service Provider: ");
		System.out.print("Recharge Plan");
		System.out.println("Select ISO Packs: ");
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("1.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("2.Cancel ");
	    System.out.println("|");
	    System.out.println("-------------");
	    int se=sc.nextInt();
		switch(se)
		{
		case 1: 
				continue1();
		break;
		case 2: recharge();
		break;
		}
	}
	public static void DataCard()
	{
		SignUp ref=new SignUp();
		System.out.println("_________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("                  Data Card Recharge                     ");
		System.out.println("_________________________________________________________");
		System.out.println("Mobile Number");
		System.out.println(ref.getPhoneNum());
		System.out.println("_______________________");
		System.out.print("Service Provider");
		System.out.println("-Enter Service Provider: ");
		System.out.print("Recharge Plan");
		System.out.println("Select ISO Packs: ");
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("1.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
	    System.out.print("| ");
	    System.out.print("2.Cancel ");
	    System.out.println("|");
	    System.out.println("-------------");
	    int se=sc.nextInt();
		switch(se)
		{
		case 1: 
				continue2();
		break;
		case 2: recharge();
		break;
		}
	}
	public static void DTH()
	{
		SignUp ref=new SignUp();
		System.out.println("_________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("                     DTH Recharge                        ");
		System.out.println("_________________________________________________________");
		System.out.println("Mobile Number");
		System.out.println(ref.getPhoneNum());
		System.out.println("_______________________");
		System.out.print("Service Provider");
		System.out.println("-Enter Service Provider: ");
		System.out.println("Recharge with");
		System.out.println("Enter Amount: ");
		System.out.print("Pay From");
		System.out.println("Select your A/c: ");
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("1.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
	    System.out.print("| ");
	    System.out.print("2. Cancel ");
	    System.out.println("|");
	    System.out.println("-------------");
	    int se=sc.nextInt();
		switch(se)
		{
		case 1: 
				continue3();
		break;
		case 2: recharge();
		break;
		}
	}
	public static void continue1()
	{
		System.out.println("____________________________________________________");
		System.out.println("            Mobile Prepaid Recharge                 ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| "+phoneno+"    ");
		System.out.println("|");
		System.out.print("| Service Provider.                                 ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| Recharge Plan:                                    ");
		System.out.println("|");
		System.out.print("|Rs.______________                                  ");
		System.out.println("|");
		System.out.print("|ISD Packs:                                          ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("____________________________________________________");
	}
	public static void continue2()
	{
		System.out.println("____________________________________________________");
		System.out.println("             Data Card Recharge                     ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| "+phoneno+"    ");
		System.out.println("|");
		System.out.print("| Service Provider.                                 ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| Recharge Plan:                                    ");
		System.out.println("|");
		System.out.print("|Rs.______________                                  ");
		System.out.println("|");
		System.out.print("|ISD Packs:                                          ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("____________________________________________________");
	}
	public static void continue3()
	{
		System.out.println("____________________________________________________");
		System.out.println("                  DTH Recharge                      ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| "+phoneno+"    ");
		System.out.println("|");
		System.out.print("| Service Provider.                                 ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| Recharge Plan:                                    ");
		System.out.println("|");
		System.out.print("|Rs.______________                                  ");
		System.out.println("|");
		System.out.print("|ISD Packs:                                          ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.println("____________________________________________________");
	}
}
class BillPay extends Pay
{
	
	public static void billPay()
	{
		System.out.println("=========================================================");
		System.out.println("                       Bill Pay                          ");
		System.out.println("=========================================================");
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Paying bills made easy!");
		System.out.println("Register your billers and pay all your bills");
		System.out.println("______________________________________________________________________");
		System.out.println("Step 1: Select Biller Type");
		System.out.println("2: Continue");
		System.out.println("3.Cancel");
		int SelectStep=sc.nextInt();
		switch(SelectStep)
		{
		case 1: 
				BillerType ref=new BillerType();
				ref.billerType();
		break;
		case 2:
				BillPay re=new BillPay();
				re.Continue();
		break;
		case 3: 
				pay();
		break;
		default: 
				billPay();
		break;
		}
	}
	public void Continue()
	{
		System.out.println("---------------------------------------");
		System.out.println("Simple. Online payments made easy. ");
		System.out.println("Simply place items in your shopping");
		System.out.println(" cart, enter your e-mail address, shipping address and bank details.");
		System.out.println("____________________________________________________");
		int a=sc.nextInt();
		switch(a)
		{
		default: BillPay ref=new BillerType();	//UPCASTING
		BillerType m=(BillerType) ref;	//DOWNCASTING
			m.billerType();
		break;
		}
	}
}
class BillerType extends BillPay
	{
	
	public void billerType()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("                                                                      ");
		System.out.println("Paying bills made easy!");
		System.out.println("Register your billers and pay all your bills");
		System.out.println("______________________________________________________________________");
		System.out.println("1.Mobile Postpaid");
		System.out.println("2.LandLine");
		System.out.println("3.Electricity");
		System.out.println("4.Gas");
		System.out.println("5.Water");
		System.out.println("6.Tax");
		System.out.println("7.Insurance");
		System.out.println("8.Credit Card");
		System.out.println("9.Mutual Fund");
		System.out.println("9.Loan");
		System.out.println("10.FASTag");
		System.out.println("11.Cable TV");
		System.out.println("12.Hospital");
		System.out.println("13.Back");
		System.out.println("Select Your Biller Type:");
		BillPay ref2=new BillerType(); 					//UPCASTING  POLYMORPHISM
		int type=sc.nextInt();
		switch(type)
		{
		case 1: 
			MobilePostpaid();
			char cntinue=sc.next().charAt(0);
			switch(cntinue)
			{
			case 'A': case 'a':
				BillerType m=(BillerType) ref2;		  //DOWNCASTING 
				m.Continue();  				//METHOD OVERRIDING
			break;
			case 'B':case 'b':
				billerType();
			break;
			default:
	    		System.out.println("--Invalid Input--");
	    		billerType();
	    	break;
			}
		break;
		case 2: 
			LandLine();
			char cntinue1=sc.next().charAt(0);
			switch(cntinue1)
			{
				case 'A': case 'a': 
					BillerType m=(BillerType) ref2;		//DOWNCASTING
					m.Continue();  						//METHOD OVERRIDING
				break;
				case 'B':case 'b':
					billerType();
				break;
				default:
		    		System.out.println("--Invalid Input--");
		    		billerType();
		    	break;
			}
		break;
		case 3: 
			Electricity();
			char cntinue2=sc.next().charAt(0);
			switch(cntinue2)
			{
			case 'A': case 'a': 
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  							//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 4: 
			Gas();
			char cntinue3=sc.next().charAt(0);
			switch(cntinue3)
			{
			case 'A': case 'a': 
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  						//METHOD OVERRIDING
			break;
			case 'B':case 'b':
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 5: 
			Water();
			char cntinue4=sc.next().charAt(0);
			switch(cntinue4)
			{
			case 'A': case 'a': 
				BillerType m=(BillerType) ref2;		//DOWNCASTING
				m.Continue();  					//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
			
		case 6: 
			Tax();
			char cntinue5=sc.next().charAt(0);
			switch(cntinue5)
			{
			case 'A': case 'a': 
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  	  					//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 7: 
			Insurance();
			char cntinue6=sc.next().charAt(0);
			switch(cntinue6)
			{
			case 'A': case 'a': 
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  	  					//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 8: 
			CreditCard();
			char cntinue7=sc.next().charAt(0);
			switch(cntinue7)
			{
			case 'A': case 'a':
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  	  					//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 9: 
			MutualFund();
			char cntinue8=sc.next().charAt(0);
			switch(cntinue8)
			{
			case 'A': case 'a': 
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  	  					//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 10:
			Loan();
			char cntinue9=sc.next().charAt(0);
			switch(cntinue9)
			{
			case 'A': case 'a': 
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  	  					//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 11:
			FASTag();
			char cntinue10=sc.next().charAt(0);
			switch(cntinue10)
			{
			case 'A': case 'a': 
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  	  					//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 12:
			CableTv();
			char cntinue11=sc.next().charAt(0);
			switch(cntinue11)
			{
			case 'A': case 'a':
				BillerType m=(BillerType) ref2;			//DOWNCASTING
				m.Continue();  	  					//METHOD OVERRIDING
			break;
			case 'B':case 'b': 
				billerType();
			break;
			default:
    			System.out.println("--Invalid Input--");
    			billerType();
    		break;
			}
		break;
		case 13:
			billPay();
		break;
		default: System.out.println("--Invalid Input--");
				billPay();
		break;
		}
	}
	
	public void Continue()
	{
		System.out.println("---------------------------------------");
		System.out.println(" SUBCLASS METHOD");
		System.out.println("Step 3. Pay Bill");
		System.out.println("---------------------------------------");
		System.out.println("____________________________________________________");
		System.out.println("                   Pay Now                        ");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| Your bill has been presented for the ccurrent     ");
		System.out.println("|");
		System.out.print("| billing cycle.                                    ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| Amount to Pay:                                    ");
		System.out.println("|");
		System.out.print("|Rs.______________                                  ");
		System.out.println("|");
		System.out.print("|Due Date:                                          ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("|                                                   ");
		System.out.println("|");
		System.out.print("| PAY CURRENT BILL                                   ");
		System.out.println("|");
		System.out.print("| SKIP                                               ");
		System.out.println("|");
		System.out.println("____________________________________________________");
		int a=sc.nextInt();
		switch(a)
		{
		default: billerType();
		break;
		}
	}
	public  void MobilePostpaid()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Mobile Postpaid");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
	    
	}
	public void LandLine()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Land Line");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
	}
	public void Electricity()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Electricity");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
	}
	public void Gas()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Gas");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
	   
	}
	public void Water()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Water");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
	public void Tax()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Tax");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
	public void Insurance()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Insurance");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
	public void CreditCard()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Credit Card");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
	public void MutualFund()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Mutual Fund");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
	public void Loan()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Loan");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
	public void FASTag()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("FASTag");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
	public void CableTv()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Cable Tv");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
	public void Hospital()
	{
		System.out.println("---------------------------------------");
		System.out.println("Step 2. Enter Biller Information");
		System.out.println("---------------------------------------");
		System.out.println("                      ");
		System.out.println("Hospital");
		System.out.println("                      ");
		System.out.println("Please choose one");
		System.out.println("____________________________");
		System.out.println("Name this Biller");
		System.out.println("____________________________");
		System.out.println("Pay from");
		System.out.println("Savings - "+ accountno);
		System.out.println("Balance - "+ balance );
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  A.Continue ");
	    System.out.println("|");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print("  B.Back ");
	    System.out.println("|");
		
	}
 }

class Cheque extends Pay
{
	{
		this.accountno=accountno;
		this.balance=balance;
		System.out.println("=========================================================");
		System.out.println("                        Cheques                          ");
		System.out.println("=========================================================");
		System.out.println("Select Account");
		System.out.println("Savings- "+ accountno);
		System.out.println("Balance Rs."+ balance);
		System.out.println("A.View Cheque Status                  >");
		System.out.println("_______________________________________");
		System.out.println("B.Stop Cheque Payment                 >");
		System.out.println("_______________________________________");
		System.out.println("C.Get New Cheque Book                 >");
		System.out.println("_______________________________________");
	}
	
	public void Status()
	{
		System.out.println("---------------------------------------");
		System.out.println("          View Cheque Status           ");
		System.out.println("---------------------------------------");
		System.out.println("Enter Cheque Number");
		System.out.println("_______________________________________");
		System.out.println("-------------");
		System.out.print("| ");
	    System.out.print(" CONTINUE ");
	    System.out.println("|");
	    System.out.println("-------------");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print(" CANCEL ");
	    System.out.println("|");
	    System.out.println("-------------");
	}
	public void StopPayment()
	{
		System.out.println("---------------------------------------");
		System.out.println("         Stop Cheque Payment           ");
		System.out.println("---------------------------------------");
		System.out.println("Stop Payment for");
		System.out.println("Enter Cheque Number");
		System.out.println("_______________________________________");
		System.out.println("Reason");
		System.out.println("Select Reason");
		System.out.println("_______________________________________");
		System.out.println("---------------");
		System.out.print("| ");
	    System.out.print(" STOP PAYMENT ");
	    System.out.println("|");
	    System.out.println("---------------");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print(" CANCEL ");
	    System.out.println("|");
	    System.out.println("-------------");
	}
	public void GetNew()
	{
		System.out.println("Account:    Savings");
		System.out.println("            "+ accountno);
		System.out.println("            Balance"+ balance);
		System.out.print("Address:    ");
		System.out.println("2/04 NEELKANTH PARK DWARKA");
		System.out.println("            NAGARI");
		System.out.println("            PHASE NO 1 WAYALE NAGAR");
		System.out.println("            KHADAKPADA KALYAN WEST");
		System.out.println("            THANE MAHARASHTRA - 421***,");
		System.out.println("            INDIA");
		System.out.println("View Cheque Book Charges");
		System.out.println("---------------");
		System.out.print("| ");
	    System.out.print(" CONFIRM ");
	    System.out.println("|");
	    System.out.println("---------------");
	    System.out.println("-------------");
		System.out.print("| ");
	    System.out.print(" CANCEL ");
	    System.out.println("|");
	    System.out.println("-------------");
	}
}