import java.util.Scanner;
public class BankAccountTest {
	
	
	
	public static void main(String[] args) {
		
		 
	double amount;
	int choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Name on the account: ");
		String fullNameEntered = input.nextLine();
		System.out.println("Amount to deposit: ");
		int amountToDeposit = input.nextInt();
		double accountNumber = Math.random() * 6 + 1000;
		System.out.println("Account Number" + accountNumber);
	
		//create a new account
		BankAccount fullName = new BankAccount(fullNameEntered, amountToDeposit, accountNumber);
		

		System.out.println("Hello, please choose a selection");
		
		do
		{
				
		System.out.println("1. Check Balance \n"
				+ "2. Deposit \n"
				+ "3. Withdraw \n"
				+ "4. Get Balance \n"
				+ "5. Show Account Info \n"
				+ "6. Log Out");
			 choice = input.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(fullName.getBalance());
				break;
			case 2: 
				System.out.println("amount to deposit?");
				amount = input.nextInt();
				fullName.Deposit(amount);
				break;
			case 3: 
				System.out.println("amount to withdrawl?");
				amount = input.nextInt();
				fullName.Withdraw(amount);
			case 4:
				System.out.println(fullName.getBalance());
			break;
			case 5:
				System.out.println(fullName.showInfo());
				break;
			case 6:
				System.out.println("You are now logged off....");
				break;
			}// end of switch
			
		}//end of do
		while(choice != 6);
	}// end of main

}
