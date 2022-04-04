package com.dv.finalassesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
	int rollno;
	String name;
	String course;
	float marks;
	static boolean ans;

	public Student() {

	}

	static boolean isRollno(int rollno, ArrayList<Student> obj) {
		for (Student std : obj) {
			if (std.rollno != rollno) {
				continue;
			}
			return ans = true;
		}
		return false;

	}

	Scanner s = new Scanner(System.in);

	public Student(int rollno, String name, String course, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public void addStudent(ArrayList<Student> obj) {
		System.out.println("Enter the rollno:");
		rollno = s.nextInt();
		while (Student.isRollno(rollno, obj)) {
			System.out.println("This roll no already exist..enter a valid one");
			rollno = s.nextInt();

		}
		System.out.println("Enter the name:");
		name = s.next();
		System.out.println("Enter the course:");
		course = s.next();
		System.out.println("Enter the mark:");
		marks = s.nextFloat();
		Student l = new Student(rollno, name, course, marks);
		obj.add(l);

	}

	public void edit(int rollno, ArrayList<Student> obj) {
		if (Student.isRollno(rollno, obj)) {
			System.out.println("Editing...Press ,1:Name,2:mark,3:course,4:edit all...");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				for (Student std : obj) {
					if (std.rollno == rollno) {
						System.out.println("Enter a new name:");
						std.name = s.next();
					}
				}

				break;

			case 2:
				for (Student std : obj) {
					if (std.rollno == rollno) {
						System.out.println("Enter a new mark:");
						std.marks = s.nextFloat();

					}
				}
				break;

			case 3:
				for (Student std : obj) {
					if (std.rollno == rollno) {
						System.out.println("Enter a new course:");
						std.course = s.next();

					}
				}
				break;
			case 4:
				for (Student std : obj) {
					if (std.rollno == rollno) {
						System.out.println("Enter a new name:");
						std.name = s.next();
						System.out.println("Enter a new mark:");
						std.marks = s.nextFloat();
						System.out.println("Enter a new course:");
						std.course = s.next();

					}
				}
				break;
			default:
				System.out.println("Enter a valid choice...");
				break;

			}
		} else {
			System.out.println("The roll no does not exist.enter a valid one");
			rollno = s.nextInt();
			edit(rollno, obj);
		}
	}

	public void ListOfStudents(ArrayList<Student> al) {
		for (Student std : al) {
			System.out.println(std);
		}
	}

	public void getStudent(int rollno, ArrayList<Student> obj) {
		if (Student.isRollno(rollno, obj)) {
			for (Student std : obj) {
				if (std.rollno == rollno) {
					System.out.println("Detail of particular Student...");
					System.out.println("Rollno:" + std.rollno);
					System.out.println("Name:" + std.name);
					System.out.println("Course:" + std.course);
					System.out.println("Marks:" + std.marks);
				}
			}
		} else {
			System.out.println("The roll no does not exist.enter a valid one");
			rollno = s.nextInt();
			getStudent(rollno, obj);
		}

	}

	public void sort(ArrayList<Student> obj) {

		System.out.println("Sorting...Press ,1:Rollno,2:Name,3:Mark...");
		int choice = s.nextInt();
		switch (choice) {
		case 1: {
			Collections.sort(obj, new SortByRollno());
			for (Student std : obj) {
				System.out.println(std);
			}
			break;
		}
		case 2: {
			Collections.sort(obj, new SortByName());
			for (Student std : obj) {
				System.out.println(std);
			}
			break;

		}
		case 3: {
			Collections.sort(obj, new SortByMark());
			for (Student std : obj) {
				System.out.println(std);
			}
			break;
		}
		default: {
			System.out.println("Invalid input...");
			break;
		}
		}
	}

	public void delete(int rollno, ArrayList<Student> obj) {
		if (Student.isRollno(rollno, obj)) {
			for (Student std : obj) {
				if (std.rollno == rollno) {
					obj.remove(std);
					break;
				}
			}

		} else {
			System.out.println("The roll no does not exist.enter a valid one");
			rollno = s.nextInt();
			delete(rollno, obj);
		}
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}

}
