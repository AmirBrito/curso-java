package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		System.out.println(rectangle.diagonal());
		
		
		sc.close();

	}

}
