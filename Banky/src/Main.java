import java.util.Scanner;

public class Main {
	public void wlc()
	{
		Scanner sc=new Scanner(System.in);
		SignUp ref=new SignUp();
		
		System.out.println("=========*******==========");
		System.out.println("| A. Sign Up |  B. Login |");
		System.out.println("=========*******==========");
		char select=sc.next().charAt(0);
		Welcome ref1=new Welcome();
		
		if(select=='A'||select=='a') 
		{
			
			ref.signup();
			
			}
		else if(select=='B'||select=='b'){
		 
			ref.login();
			
			
		}
		else {
			System.out.println("Invalid Input");
			wlc();
		}
		
	}
	public static void main(String []args)
	{  
		Main ref=new Main();
		ref.wlc();
	}
		
}


