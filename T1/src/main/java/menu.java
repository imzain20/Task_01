//our main

import java.util.Scanner;


public class menu extends Account {
	public static void main(String[] args)
	{
		
		int Account_No = 0001;
		System.out.println("Choose any option: \n1-Open a new account/Close an account.\n2-Login to a specific account.\n3-Perform account operations.\n4-Specify the Interest Rate.\n5-Display all account details.\n6-Display all accounts deductions along with account details.\n");
		//Account a1=new Account();
		//a1.information_new();
		
		//menu
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		switch(number) {
		  case 1:
			  System.out.println("\nEnter customer's name: ");
			  String C_name = input.next();
			  System.out.println("\nEnter customer's address: ");
			  String C_address = input.next();
			  System.out.println("\nEnter customer's phone_number: ");
			  String C_phone_no = input.next();
			  /*
			  System.out.println("\nEnter customer's account_no: ");
			  String C_account_no = input.next();
			  */
			  System.out.println("\nEnter the amount of balance you want to insert in your new account:  ");
			  int C_bal = input.nextInt();
			 			  	
		    Account a1= new Account(C_name,C_address,C_phone_no,Account_No,C_bal);
		    System.out.println(a1.getAddress() + " " + a1.getBalance() + " " + a1.getName() + " " + a1.getPhoneNo() + " " + a1.gettAccountNo() );
		    Account_No=Account_No+1;
		    break;
		  case 2:
		    // code block
		    break;
		  case 3:
			    // code block
			    break;
		  case 4:
			    // code block
			    break;
		  case 5:
			    // code block
			    break;
		  case 6:
			    // code block
			    break;
		  default:
		    // code block
		}
	}
}
