package Java_Day_2_Assignment;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter character to count: ");
        char ch = sc.next().charAt(0);
        long count = str.chars().filter(c -> c == ch).count();
        System.out.println("Character '" + ch + "' appears " + count + " times.");
        sc.close();

	}

}
