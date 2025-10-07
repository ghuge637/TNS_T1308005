package assignment;

import java.util.Scanner;

class Student {
    // Default constructor
    Student() {
        System.out.println("Student object is created");
    }
}

public class Ass_2 {
	String name;
    String address;
    String phone;
    double salesAmount;
    double commission;

    // Method to accept employee details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    // Method to calculate commission
    void calculateCommission() {
        if (salesAmount >= 100000)
            commission = salesAmount * 0.10;
        else if (salesAmount >= 50000)
            commission = salesAmount * 0.05;
        else if (salesAmount >= 30000)
            commission = salesAmount * 0.03;
        else
            commission = 0;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }



    public static void main(String[] args) {
        Student s1 = new Student();

        Ass_2 emp = new Ass_2();
        emp.acceptDetails();
        emp.calculateCommission();
        emp.displayDetails();
    

}

}