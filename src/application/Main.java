package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How many rooms will be rented??");
		int rent = sc.nextInt();
		int size = 10;
		Student[] room = new Student[size];
		
		for(int i=0; i<rent; i++) {
			
			sc.nextLine();			
			System.out.println("Inform the room: ");			
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Inform name: ");
			String name = sc.nextLine();
			
			System.out.println("Inform email: ");
			String email = sc.nextLine();
			room[roomNumber] = new Student(name, email);			
		}
		
		for(int i=0; i<room.length; i++) {
			if(room[i] != null) {
				System.out.printf("Room: " + i + " " + room[i].toString());
				System.out.println();
			}
		}
		sc.close();

	}
}