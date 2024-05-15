package com.tka.account;

public class Account1 {
	private String accountHolderName;
	private String accountNumber;
	private  double balance;
	 private String phoneNumber;
	  private AdharCard adharCard;
	  private PanCard panCard;
	  
	public Account1(String accountHolderName, String accountNumber, double balance, String phoneNumber,
			AdharCard adharCard, PanCard panCard) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
		this.adharCard = adharCard;
		this.panCard = panCard;
	}
	 public String getAccountHolderName() {
			return accountHolderName;
		}
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public AdharCard getAdharCard() {
			return adharCard;
		}
		public void setAdharCard(AdharCard adharCard) {
			this.adharCard = adharCard;
		}
		public PanCard getPanCard() {
			return panCard;
		}
		public void setPanCard(PanCard panCard) {
			this.panCard = panCard;
		}

		  
		  

	
	public void deposit(double amount) {
		try {
		if(amount>0) {
			this.balance=this.balance+amount;
		}
		
		System.out.println("your account" +accountNumber +"is created with amount" +amount);
		System.out.println("total balance is" +balance);
	}
	
		catch(Exception e) {
			System.out.println("Pelase enter valid amount");
		}
	}
	 public void withdraw(double amount) {
		 try {
		 if(amount<this.balance)
		 {
		 this.balance=this.balance-amount;
		 System.out.println("your accont" +accountNumber +"is  debited with amount" +amount);
		 System.out.println("AVL Bal is " + balance);
		 }
		 
	 else {
		 System.out.println("sorry can not  process, insuffiecient balance!!!");
	 }
		 }
		 catch(Exception e) {
			System.out.println("Pelase enter valid amount");
		}
		 }
       public void checkBalance() {
	 System.out.println("your account no" +accountNumber);
	 System.out.println("avaliable balance is" +balance);
       }
       
       public void getAccountHolderInformation() {
    	   System.out.println("---------AccountHolderInformation------");
    	   System.out.println("account holder name" +this.accountHolderName);
    	   System.out.println("a/c number" +this.accountNumber);
    	   System.out.println("a/c avl bal" +this.balance);
    	   System.out.println("Account Holder Contact Phone number" +phoneNumber);
    	   System.out.println("****Adhar Card Details****");
    	   System.out.println("name" +adharCard.getMyName());
    	   System.out.println("dob"+ adharCard.getDob());
    	   System.out.println("address"+adharCard.getAddress());
    	   System.out.println("Adhar card number" +adharCard.getAddress());
    	   System.out.println("****PAN CARD NUMBER****");
    	   
    	   System.out.println("name" +panCard.getName());
    	   System.out.println("dob" +panCard.getDob());
    	   System.out.println("pan card number" +panCard.getPanNumber());    	   
    	   
       }
       @Override
   	public String toString() {
   		return "Account1 [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
   				+ balance + ", phoneNumber=" + phoneNumber + ", adharCard=" + adharCard + ", panCard=" + panCard + "]";
   	}
   	
      
	 
}
