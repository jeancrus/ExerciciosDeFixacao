package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		sc.nextLine();
		for (int i = 1 ; i <= a; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			set.add(new Student(id));
		}
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		for (int i = 1 ; i <= b; i++) {
			int id = sc.nextInt();
			set.add(new Student(id));
		}
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		for (int i = 1 ; i <= c; i++) {
			int id = sc.nextInt();
			set.add(new Student(id));
		}
		System.out.println("Total students: " + set.size());
		
		
		sc.close();

	}

}
