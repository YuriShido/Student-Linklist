package ca.java.Linklistexercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;



public class Driver {
	
	
	public static void addLinkedList(LinkedList<Student> students) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your fullname");
		String fullName = input.nextLine();
		System.out.println("Please Enter your email");
		String email = input.nextLine();
		System.out.println("Please enter your ID");
		int id = input.nextInt();
		Student s4 = new Student(id, fullName, email);
		students.add(s4);
	}
	

	
	public static void removeStudent(LinkedList<Student> students) {
		Scanner input = new Scanner(System.in);
		Iterator<Student> iterator = students.iterator();
		System.out.println("\nPlease enter the ID that you want to remove.");
		int answerId = input.nextInt();
		while (iterator.hasNext()) {
			Student s = iterator.next();
			if (s.getId() == answerId) {
				System.out.println("Removed: " + s + "\n");
				iterator.remove(); 
			}			
//		Student finds;
//			finds = (Student) iterator.next();
//			if(finds.getId() == answerId) {
//				iterator.remove();
//			}
//			Student finds = iterator.next();
//			if(finds.getId() == answerId) {
//				iterator.remove();
//			}
		}
		for (Student s : students) {
			System.out.println(s);
		}
	}
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		LinkedList<Student> students = new LinkedList<Student>();
		Student s1 = new Student(1000, "John Mirror", "jm@gmail.com");
		Student s2 = new Student(1001, "Yuna Smith", "ys@gmail.com");
		Student s3 = new Student(1002, "Brad Pitt", "bt@gmail.com");
				
		students.add(s1);
		students.add(s2);
		students.add(s3);
		addLinkedList(students);
		
		//display the students list using Iterator
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		removeStudent(students);
	
	}
	
	

}
