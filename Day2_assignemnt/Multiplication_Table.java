package Class_objects;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a number to print its multiplication table: ");
				int number = input.nextInt();
				System.out.println("Multiplication table for " + number + ":");
				
				for (int i = 1; i <= 10; i++) {
		            int result = number * i; 
		            System.out.println(number + " x " + i + " = " + result); 
		        }
				input.close();

	}

}
