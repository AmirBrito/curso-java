package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		emp.setName(name);
		System.out.println("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		emp.setGrossSalary(grossSalary);
		System.out.println("Tax: ");
		double tax = sc.nextDouble();
		emp.setTax(tax);
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.println("Insert percentage to increase salary: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + emp);		
		sc.close();

	}

}
