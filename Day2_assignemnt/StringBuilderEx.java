package Class_objects;

import java.util.Scanner;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a sentence: ");
		        String input = sc.nextLine();

		        StringBuilder sb = new StringBuilder(input);
		        System.out.println("Reversed: " + sb.reverse());

		        sc.close();
		    }
		}




