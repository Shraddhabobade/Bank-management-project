package com.tka.account;

import java.util.Scanner;

public class Cilent1 {

	public static void main(String[] args) {
		//providing console base gui to client can use banking application
		Scanner sc = new Scanner(System.in);
		System.out.println("\t ******************welcome to  " +Bank.bankName+"***************");
		while(true) {
			System.out.println("--------------------------------------------------------------");
        	System.out.println("\t 1: create New Account");
        	System.out.println("\t 2: check balance");
        	System.out.println("\t 3: deposit");
        	System.out.println("\t 4: withdraw");
        	System.out.println("\t 5: Account HolderInformation");
        	System.out.println("\t 6: List of all accounts");
        	System.out.println("\t 7: delete bank account");
        	System.out.println("\t 8: EXIT");
        	System.out.println("--------------------------------------------------------------");
        	System.out.println();
        	
        	System.out.println("enter your choice");
        	int choice=sc.nextInt();
        	sc.nextLine();
        	
        	if(choice==1) {
        		//create new account
        		System.out.println("enter account holder name");
        		String name=sc.nextLine();
        		
        		System.out.println("enter account number");
        		String accountNumber=sc.nextLine();
        		
        		System.out.println("enter deposit");
        		double amount=sc.nextDouble();
        		sc.nextLine();
        		
        		System.out.println("enter phone number");
        		String phoneNumber=sc.nextLine();
        		
        		System.out.println("enter address");
        		String address=sc.nextLine();
        		
        		System.out.println("enter dob");
        		String dob=sc.nextLine();
        		
        		System.out.println("enter adharNumber");
        		String adharNumber=sc.nextLine();
        		
        		System.out.println("enter panNumber");
        		String panNumber=sc.nextLine();
        		
        	
        		AdharCard adharCard=new AdharCard(name,address, dob, adharNumber);
        		PanCard panCard=new PanCard(name, dob,  panNumber);
        		 
        		
        		
        		Bank.createNewAccount(name, accountNumber, amount,  phoneNumber,  adharCard, panCard );
                
        	} else if(choice==2) {
        		System.out.println("enter account number");
        		String accountNumber=sc.nextLine();
        		try {
        		
        		  Account1 account=Bank.getAccount(accountNumber);
        		  account.checkBalance();
        		}
        		catch(Exception e) {
        			System.out.println("a/c not found");
        		}
        		
        		
        		//check balance
        	}else if(choice==3) {
        		System.out.println("enter account number");
        		String accountNumber=sc.nextLine();
        		
        		System.out.println("enter amount to deposit");
        		double amount=sc.nextDouble();
        		try {
            		
          		  Account1 account=Bank.getAccount(accountNumber);
          		  account.deposit(amount);
          		}
          		catch(Exception e) {
          			System.out.println("a/c not found");
          		}
          		
        		
        		//deposit
        	}else if(choice==4) {
        		System.out.println("enter account number");
        		String accountNumber=sc.nextLine();
        		
        		System.out.println("enter amount to withdraw");
        		double amount=sc.nextDouble();
        		
        		try {
            		
          		  Account1 account=Bank.getAccount(accountNumber);
          		  account.withdraw(amount);
          		}
          		catch(Exception e) {
          			System.out.println("a/c not found");
          		}
          		
        		 
        		
        		//withdraw
        	}else if(choice==5) {
        		System.out.print("Enter Account Number: ");
				String accountNumber = sc.nextLine();
				try {
					Account1 account = Bank.getAccount(accountNumber);
					account.getAccountHolderName() ;
				} catch (Exception e) {
					System.out.println("A/c not fount");
				}
        		//delete account
        	} 
        else if(choice ==6) {
				
				try {
					Bank.getAllAccountsInformation();
				} catch (Exception e) {
					System.out.println("No record/bank A/c found in bank db");
				}
				
			}else if (choice == 7) {
				
				System.out.print("Enter Account Number: ");
				String accountNumber = sc.nextLine();
				
				Bank.removeAccount(accountNumber);
				
			} else if (choice == 8) {
				break ;
			} else {
				
			}
			
		}
		
	}

}
