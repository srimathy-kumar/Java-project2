package Banking;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Account{
	final double rate=0.05;
	final double rate1=0.08;
	final double limit=2000;
	final double limit1=5000;
	public void GetDeposit(int n);
	public void GetWithdrawalLimit(int n);
	public void GetInterestRate(double n);
}


/*class Customer extends Record throws IOException{

	
	File file=new File("BankingStatement.txt");
	file.createNewFile();
//FileWriter wrt=new FileWriter("BankingStatement");
	throw new IOException();

		
}
class Record{
	try {
	
	}
	catch(IOException e) {
		
	}
	finally {
		
	}
}*/
public class RBI {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************Welcome to the National Banking Systems***************");
		System.out.println("\n");
		System.out.println("Do you want to open an account:  Y/N");
		Scanner input=new Scanner(System.in);
		char inputChoice=input.next().charAt(0);
		if(inputChoice=='Y'|| inputChoice=='y') {
		//if(inputChoice=="1") {
			OpenAccount open=new OpenAccount();
			open.createAccount();
		}
		else if(inputChoice=='N'|| inputChoice=='n') {
		//else if(inputChoice=="2") {
			Bank banking=new Bank();
			banking.showMenu();
		}
		else {
			System.out.println("Invalid! Try yes or no...");
		}
	//	Customer custom=new Customer();
		
	}
}


class SBI extends Bank{
	
	public SBI() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void SavingsAccount() {
		System.out.println("Savings Account for SBI created with the following details...");
		System.out.println("\n");
	}
	public void CurrentAccount() {
		System.out.println("Current Account for SBI created with the following details...");
		System.out.println("\n");
	}
}
	

class HDFC extends Bank{
	
	
	
	public HDFC() {
		super();
		// TODO Auto-generated constructor stub
	}
			
	public void SavingsAccount() {
		System.out.println("Savings Account for HDFC created with the following details...");
		System.out.println("\n");
	}
	public void CurrentAccount() {
		System.out.println("Current Account for HDFC created with the following details...");
		System.out.println("\n");
	}
}


//class ICICI extends Bank{
class ICICI extends Bank{	
	
	public ICICI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void SavingsAccount() {
		System.out.println("Savings Account for ICICI created with the following details...");
		System.out.println("\n");
		
	}
	public void CurrentAccount() {
		System.out.println("Current Account for ICICI created with the following details...");
		System.out.println("\n");
	}
	}

class OpenAccount extends RBI{
	String Bank;
	String Name;
	String DOB;
	String AccountType;
	String AccountNumber;
	int balance;
	int amount;
	double min=0;
	double max=1000;

	public OpenAccount(String bank, String name, String dOB, String accountType, String accountNumber, int balance,
			int amount) {
		this.Bank = bank;
		this.Name = name;
		this.DOB = dOB;
		this.AccountType = accountType;
		this.AccountNumber = accountNumber;
		this.balance = balance;
		this.amount = amount;
	}
	public OpenAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	Scanner text=new Scanner(System.in);
	
	public void createAccount() {
		System.out.println("In which bank do you want to open an account: 1. SBI 2. HDFC 3. ICICI");
		char choice=text.next().charAt(0);		
		if(choice=='1') {
			Bank="SBI";
			System.out.println("Please Enter your name:");
			text.nextLine();
			Name=text.nextLine();
			//text.nextLine();
			System.out.println("Enter your Date of Birth:");
			DOB=text.nextLine();
			text.nextLine();
			System.out.println("What type of do you want to open: 1. Savings Account 2. Current Account");
			char choice1=text.next().charAt(0);
			SBI sbi=new SBI();//Savings account in SBI
			if(choice1=='1') {
				AccountType="Savings Account";
				sbi.SavingsAccount();
				miniStatementOfSaving();
			}
			else if(choice1=='2') {
				AccountType="Current Account";
				sbi.CurrentAccount();
				miniStatementOfCurrent();
			}
				
			else {
				System.out.println("Not found such Account...");
			}
		}
		else if(choice=='2') {
			Bank="HDFC";
			System.out.println("Please Enter your name:");
			text.nextLine();
			Name=text.nextLine();
			//text.nextLine();
			System.out.println("Enter your Date of Birth:");
			DOB=text.nextLine();
			text.nextLine();
			System.out.println("What type of do you want to open: 1. Savings Account 2. Current Account");
			char choice2=text.next().charAt(0);
			HDFC hdfc=new HDFC();//Savings account in SBI
			if(choice2=='1') {
				AccountType="Savings Account";
				hdfc.SavingsAccount();
				miniStatementOfSaving();
			}
			else if(choice2=='2') {
				AccountType="Savings Account";
				hdfc.CurrentAccount();
				miniStatementOfCurrent();
			}
			else {
				System.out.println("Not found such Account...");
			}
		}
		else if(choice=='3') {
			Bank="ICICI";
			System.out.println("Please Enter your name:");
			text.nextLine();
			Name=text.nextLine();
			
			System.out.println("Enter your Date of Birth:");			
			DOB=text.nextLine();
			text.nextLine();
			System.out.println("What type of do you want to open: 1. Savings Account 2. Current Account");
			char choice3=text.next().charAt(0);
			ICICI icici=new ICICI();//Savings account in SBI
			if(choice3=='1') {
				AccountType="Savings Account";
				icici.SavingsAccount();
				miniStatementOfSaving();
			}
				
			else if(choice3=='2') {
				AccountType="Savings Account";
				icici.CurrentAccount();
				miniStatementOfCurrent();
			}
		
			else {
				System.out.println("Not found such Account...");
			}
		}
		else {
			System.out.println("Invalid Bank...");
		}
	}
	
	public void miniStatementOfSaving() {
		//String AccountType="Savings Account";
		System.out.println("Bank: "+Bank);
		System.out.println("Name: "+Name);
		System.out.println("DOB: "+DOB);
		System.out.println("Account Type: "+AccountType);
		System.out.println("Account Number: "+Math.random()*(max-min+1)+min);
		Bank b=new Bank();
		b.showMenu();
	}
	public void miniStatementOfCurrent() {
	//	String AccountType="Current Account";
		System.out.println("Bank: "+Bank);
		System.out.println("Name: "+Name);
		System.out.println("DOB: "+DOB);
		System.out.println("Account Type: "+AccountType);
		System.out.println("Account Number: "+Math.random()*(max-min+1)+min);	
		Bank b=new Bank();
		b.showMenu();
	}

}


//class Bank extends OpenAccount implements Account{
class Bank extends OpenAccount implements Account{
	
		public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String bank, String name, String dOB, String accountType, String accountNumber, int balance, int amount) {
		super(bank, name, dOB, accountType, accountNumber, balance, amount);
		// TODO Auto-generated constructor stub
	}

		double prevTrans;
		Scanner inputOption=new Scanner(System.in);
	
	

	public void showMenu() {
		System.out.println("\n");
		System.out.println("Welcome to the Menu");
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit Amount");
		System.out.println("C. Withdraw Amount");
		System.out.println("D. See previous transaction");
		System.out.println("E. Calculate Interest");
		System.out.println("F. Exit");
		System.out.println("\n");
		System.out.println("**************************************************************");
		System.out.println("Enter the Option");
		System.out.println("**************************************************************");
		char Menu=inputOption.next().charAt(0);
		
		switch(Menu){
			case 'A': checkBalance(balance);
					  break;
						
			case 'B': GetDeposit(amount);
			          break;
			          
			case 'C': GetWithdrawalLimit(amount);
					  break;
					  
			case 'D': GetPreviousTransaction();
					  break;
			
			case 'E': GetInterestRate(amount); 
					  break;
					  
			case 'F': System.out.println("Exited..");
				      break;
			
			default:  System.out.println("Invalid Option!, Try A to F...");
						showMenu();
					  break;
		}
	}
	
	public void GetPreviousTransaction() {
		if(prevTrans>0) {
			System.out.println("Deposited: "+prevTrans);
		}
		else if(prevTrans<0) {
			System.out.println("Withdraw:"+Math.abs(prevTrans));
		}
		else {
			System.out.println("No transaction occured...");
		}
		showMenu();
	}
	public void checkBalance(int b){
		System.out.println("Current Balance:"+b);
		prevTrans=b;
		if(b==0) {
			showMenu();
		}
		showMenu();
	}

	@Override
	public void GetDeposit(int amunt) {
		System.out.println("Enter amount to deposit: ");
		amunt=inputOption.nextInt();
		if(amunt<0) {
			try {
				throw new IOException();
			}
			catch(IOException ae) {
				System.out.println("Invalid Amount...");
			}			
		}
		balance=balance+amunt;
		prevTrans=amunt;
		System.out.println("Amount deposited:"+balance);
		showMenu();
	}


	@Override
	public void GetInterestRate(double amt) {
		
		System.out.println("Which Interest do you want to calculate: 1. Simple Interest 2. Compound Interest");
		char a=inputOption.next().charAt(0);
		if(a=='1') {
			System.out.println("Enter the years to calculate: ");
			int t=inputOption.nextInt();
			if(AccountType=="Savings Account") {
				double SimpleInterest=balance*rate*t;//rate is already divided from 100 for 4%
				System.out.println("Simple Interest: "+ SimpleInterest);
			}
			else{
				double SimpleInterest=balance*rate1*t;//rate is already divided from 100 for 4%
				System.out.println("Simple Interest: "+ SimpleInterest);
			}
		}
		else if(a=='2') {
			System.out.println("Enter the years to calculate: ");
			int t=inputOption.nextInt();
			if(AccountType=="Savings Account") {
				double CompoundInterest=(balance*Math.pow((1+rate),t))-balance;//rate is already divided from 100 for 4%
				System.out.println("Compound Interest: "+ CompoundInterest);	
				System.out.println("Compund Interest is twiced a year: "+2*CompoundInterest);
			}
			else{
				double CompoundInterest=(balance*Math.pow((1+rate1),t))-balance;//rate is already divided from 100 for 4%
				System.out.println("Compound Interest: "+ CompoundInterest);	
				System.out.println("Compund Interest for mentioned year is twiced per year: "+2*CompoundInterest);
			}
		}
		else {
			System.out.println("Not Found Interest for this choice!, Try 1 or 2...");
			showMenu();
		}
		showMenu();
		
	}


	@Override
	public void GetWithdrawalLimit(int amut) {
		System.out.println("Your Balance: "+balance);
		System.out.println("Enter amount to withdraw: ");
		amut=inputOption.nextInt();
		if(balance<amut) {
			System.out.println("Not sufficient balance...");
		}
		
			if(amut<0) {
				try {
					throw new IOException();
				}
				catch(IOException e) {
					System.out.println("Invalid amount..");
				}
				
			}
		
		balance=balance-amut;
		System.out.println("After withdrawal: "+balance);
		prevTrans=-amut;
		if(AccountType=="Savings Account") {
			if(limit>balance) {
				System.out.println("Maintain minimum balance of 2000 for Savings Account...");
			}
		}
		else{
			if(limit1>balance) {
				System.out.println("Maintain minimum balance of 5000 for Current Account...");
			}
		}

		showMenu();
	}
	

}
