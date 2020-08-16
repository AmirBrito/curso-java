package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.println("Data account");
		System.out.println("Account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Account owner: ");
		sc.nextLine();
		String accountOwner = sc.nextLine();
		
		System.out.println("Initial deposit? Y/N");
		char answer = sc.next().charAt(0);
		if(answer == 'y') {
			System.out.println("Deposit value: ");
			double initialDeposit = sc.nextDouble();			
			account = new Account(accountNumber, accountOwner, initialDeposit);
			
		}else {
			
			account = new Account(accountNumber, accountOwner);
		}
		
		System.out.println(account); 
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Update data: ");
		System.out.println(account);
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Update data: ");
		System.out.println(account);
			
		sc.close();

	}
}