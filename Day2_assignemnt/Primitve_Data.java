package Java_Day_2_Assignment;

import java.util.Scanner;

public class Primitve_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Height: ");
        float height = scanner.nextFloat();

        System.out.print("Enter Weight: ");
        double weight = scanner.nextDouble();

        System.out.println("\nAge: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);

        scanner.close();

	}

}
