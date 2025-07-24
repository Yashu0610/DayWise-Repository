package Java_Day_2_Assignment;

import java.util.Scanner;

public class OperatorsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Greater number: " + (num1 > num2 ? num1 : num2));
        System.out.println("Are both positive? " + (num1 > 0 && num2 > 0));
        sc.close();

	}

}
