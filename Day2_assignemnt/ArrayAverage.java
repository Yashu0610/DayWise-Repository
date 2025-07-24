package Java_Day_2_Assignment;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Average: " + (sum / 5.0));
        sc.close();

	}

}
