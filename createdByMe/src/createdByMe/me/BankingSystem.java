package createdByMe.me;

import java.util.Scanner;

/*
 This is a simple banking app that does usual/simple banking operation such
 as depositing, withdrawing and balance check. It also allows for account creation.
 Author: Onyancha Anthony
 Year done: 2021
 */
public class BankingSystem {
	protected static double openBalance;

	public static void main(String[] args) {
		final int Username=0000;
		final int Password=1234;
		System.out.println("*************************************************************************************************************************");
		System.out.println(">>>>>>>>>>>><><><><><><><><><><><> Welcome to XYZC Bank Kenya <><><><><><><><><><><>>>>>>>>>>>>>>>");
		System.out.println("*************************************************************************************************************************");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			
			System.out.println("                                Log in to continue :");
			int count=0;
			
			System.out.print("Username: ");
			int username = input.nextInt();

			System.out.print("Password: ");
			int password = input.nextInt();
			while (count <= 2) {
			if(username !=Username || password !=Password) {
				System.out.println("Wrong entry. Retry! ");
				System.out.print("Username: ");
				username = input.nextInt();

				System.out.print("Password: ");
				password = input.nextInt();
			}
			else {
			
				//Menu();
			
			
			int user_choice;
			do {
			System.out.println("	Select Option: ");
			System.out.println("		1. Create Account");
			System.out.println("		2. Deposit Cash");
			System.out.println("		3. Withdraw Cash");
			System.out.println("		4. Balance");
			System.out.println("		5. Exit");
			System.out.println("");
			user_choice = input.nextInt();
	        switch (user_choice) {
	            case 1: 
	            	createAccount();
	                    break;
	            case 2: 
	            	deposit();
	                    break;
	            case 5:
	            	 System.out.println("Thanks for banking with us. Goodbye!");
	                 System.exit(0); 
	                 break;
	        }
			}while(user_choice !=5);
			count++;

		    break; 
			}
			}
			
	        
			
		}
			


private static void createAccount() {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in) ;
		System.out.print("Customer name: ");
		String cn = input.nextLine();
		System.out.print("Customer ID Number: ");
		int id=input.nextInt();
		System.out.print("Opening balance: ");
		openBalance = input.nextDouble();
		int accNo = (int) (Math.random()*111111111 + 1);
		System.out.println("           Account Detail: ");
		System.out.println("Name: "+ cn + ": Customer ID: "+ id +": Account Number: "+ accNo
				+" Balance: " + openBalance);
	
    
}
private static void deposit() {
	System.out.println("Enter Amount to Deposit: ");
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
		double deposit=input.nextDouble();
		System.out.println("Amount Deposited : "+ deposit );
		//createAccount(openBalance);
	
	
}

}


