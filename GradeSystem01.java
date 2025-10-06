package assignment;

import java.util.Scanner;

public class GradeSystem01 {
	public static void main(String[] args) {
		int mark=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks: ");
		mark = sc.nextInt();
		
		if(mark<35)
			System.out.println("Result is Fail..!");
		else if(mark>=35 && mark<=60)
			System.out.println("Result is: Class -> C");
		else if(mark>=61 && mark<=80)
			System.out.println("Result is: Class -> B");
		else if(mark>=81 && mark<=90)
			System.out.println("Result is: Class -> A");
		else
			System.out.println("Result is: Distinction..!");
		
	}
}
