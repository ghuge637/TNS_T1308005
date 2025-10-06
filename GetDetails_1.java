package assignment;

import java.util.Scanner;

public class GetDetails_1 {
	public static void main(String[] args) {
		String name;
		int rollno;
		String grade;
		float percentage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		name = sc.next();
		
		System.out.println("Enter the rollno: ");
		rollno = sc.nextInt();
		
		System.out.println("Enter the grade: ");
		grade = sc.next();
		
		System.out.println("Enter the percentage: ");
		percentage = sc.nextFloat();
		
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(grade);
		System.out.println(percentage);
	}
}
