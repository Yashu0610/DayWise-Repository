package Class_objects;

import java.util.Scanner;

public class WelcomeMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter First Name: ");
		        String firstName = sc.nextLine();

		        System.out.print("Enter Last Name: ");
		        String lastName = sc.nextLine();

		        String welcomeMessage = "Welcome " + firstName + " " + lastName + "!";
		        System.out.println(welcomeMessage);

		        sc.close();
		 }
}

