package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;




public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Informe os dados do estudante: ");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Nota 1:");
		int nota = sc.nextInt();
		
		student.setName(name);
		student.setNota1(nota);
		
		System.out.println("Nota 2:");
		nota = sc.nextInt();
		student.setNota2(nota);
		
		System.out.println("Nota 3:");
		nota = sc.nextInt();
		student.setNota3(nota);
		
		System.out.printf("Nota final = %.2f%n", student.notaFinal());
		if(student.notaFinal() < 60) {
			System.out.printf("Reprovado! Falta: %.2f%n", student.faltaPontos());
		}
		else {
			System.out.println("Aprovado!");
		}
		
			
		sc.close();

	}

}
