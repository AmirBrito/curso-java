package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;




public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dollar price: ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("Amount of dollars bought: ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.converter(dollarPrice, amount);
		
		System.out.printf("Amount to be paid in reais: $ %.2f%n", result);
		
			
		sc.close();

	}

}
