package Java_Day_2_Assignment;

import java.util.Scanner;

public class EvenNumbersLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = 0; i < n * 2; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();

	}

}
