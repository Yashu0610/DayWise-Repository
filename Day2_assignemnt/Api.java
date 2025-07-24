package Class_objects;

import java.util.Scanner;

public class Api {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter your email: ");
		        String email = sc.nextLine();

		        if (email.contains("@") && email.endsWith(".com")) {
		            System.out.println("Valid Email");
		        } else {
		            System.out.println("Invalid Email");
		        }

		        sc.close();
		    }
		}



