package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// vetores
		
		int size = sc.nextInt();
		double[] vector = new double[size];
		
		for (int i=0; i<size; i++) {
			
			vector[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i=0; i<size; i++) {
			
			sum += vector[i];
		}
		
		double average = sum / size;
		
		System.out.println("Average height: " + average);
		
		sc.close();

	}
}