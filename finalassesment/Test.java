package com.dv.finalassesment;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static boolean exit(int x) {
		boolean a = (x == 0) ? false : true;
		return a;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Student student1 = new Student(1, "Divya", "ComputerScience", 99f);
		Student student2 = new Student(2, "Arthi", "Maths", 100f);
		Student student3 = new Student(3, "Anitha", "Science", 97f);
		Student student4 = new Student(4, "Abisekha", "Physics", 99f);
		Student student5 = new Student(5, "Sowndarya", "Chemistry", 98f);
		Student student6 = new Student(6, "Shalini", "Biology", 97f);
		Student student7 = new Student(7, "Manju", "Zoology", 98f);
		ArrayList<Student> al = new ArrayList<>();
		al.add(student2);
		al.add(student6);
		al.add(student5);
		al.add(student3);
		al.add(student4);
		al.add(student7);
		al.add(student1);
		// System.out.println(al);
		Student obj = new Student();

		boolean exit = true;
		System.out.println(
				"1.Add Student,2.Edit Student,3.Delete Student,4.List of Student,5.Get Student,6.Sort,Any other number exit");
		while (exit) {
			System.out.println("Press A Number:");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				obj.addStudent(al);
				System.out.println("After adding new student:");
				for (Student std : al) {
					System.out.println(std);
				}
				break;
			case 2:
				System.out.println("Enter a rollno that you want to edit...");
				int id = s.nextInt();
				obj.edit(id, al);
				System.out.println("After editing student:");
				for (Student std : al) {
					System.out.println(std);
				}
				break;
			case 3:
				System.out.println("Enter a rollno that you want to delete...");
				int id1 = s.nextInt();
				obj.delete(id1, al);
				System.out.println("After deleting student:");
				for (Student std : al) {
					System.out.println(std);
				}
				break;
			case 4:
				System.out.println("The list of students...");
				obj.ListOfStudents(al);
				break;
			case 5:
				System.out.println("Enter a rollno of a student...");
				int id2 = s.nextInt();
				obj.getStudent(id2, al);
				break;

			case 6:
				obj.sort(al);
				break;
			default:
				exit = Test.exit(0);

			}

		}

	}

}
