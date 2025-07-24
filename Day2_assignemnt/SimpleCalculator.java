package Java_Day_2_Assignment;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': System.out.println("Result: " + (num1 + num2)); break;
            case '-': System.out.println("Result: " + (num1 - num2)); break;
            case '*': System.out.println("Result: " + (num1 * num2)); break;
            case '/': System.out.println("Result: " + (num2 != 0 ? (num1 / num2) : "Cannot divide by zero")); break;
            default: System.out.println("Invalid operation");
        }
        sc.close();

	}

}
