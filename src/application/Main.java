package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter the product data:");
		System.out.print("Name: ");		
		String name = sc.nextLine();
		product.setName(name);
		System.out.print("Price: ");
		double price = sc.nextDouble();
		product.setPrice(price);
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println(product.getName() + ", " + product.getPrice() + ", " + product.getQuantity());		
		
		
		
		
		sc.close();

	}

}
