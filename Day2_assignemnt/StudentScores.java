package Class_objects;
import java.util.Scanner;
public class StudentScores {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter 3 scores separated by space: ");
		        int score1 = sc.nextInt();
		        int score2 = sc.nextInt();
		        int score3 = sc.nextInt();

		        int max = Math.max(score1, Math.max(score2, score3));
		        double avg = (score1 + score2 + score3) / 3.0;

		        System.out.println("Average: " + avg);
		        System.out.println("Maximum: " + max);

		        sc.close();
		    }
		}



