package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;



public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// vetores com tipo class;
		
		int size = sc.nextInt();
		Product2[] vector = new Product2[size];
		
		for(int i=0; i<vector.length; i++) {
			sc.nextLine();			
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vector[i] = new Product2(name, price);			
		}
		
		double sum = 0.0;
		
		for (int i=0; i<vector.length; i++) {
			
			sum += vector[i].getPrice();
		}
		
		double average = sum / vector.length;
		
		System.out.printf("Average price = %.2f%n", average);		
		sc.close();

	}
}