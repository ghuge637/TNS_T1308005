package assignment;

import java.util.Scanner;

public class Ass_3 {
    // Data members
    double radius;
    String colour;

    // Method to accept details of the circle
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter the colour of the circle: ");
        colour = sc.nextLine();
    }

    // Method to calculate and display area
    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius: " + radius);
        System.out.println("Colour: " + colour);
        System.out.println("Area of the Circle: " + area);
    }

    public static void main(String[] args) {
        // Create Circle object
        Ass_3 c1 = new Ass_3();

        // Accept circle details
        c1.getInput();

        // Calculate and display area
        c1.calcArea();
    }
}
