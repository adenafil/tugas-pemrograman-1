import java.util.Scanner;

public class TwoMoreQuestions{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean answer = true;
		while ( answer = true) {
			answer = false;
		System.out.print("TWO MORE QUESTION, BABY!\n");
		System.out.print("Question 1) Does it stay inside or outside or both ? ");
		String ans1 = scanner.next();
		System.out.print("Question 2) Is it a living thing ? ");
		String ans2 = scanner.next();
		
		if (ans1.equals("inside") && ans2.equals("yes")){
			System.out.print("\nYou must thinking a housplant right.");
			} if (ans1.equals("inside") && ans2.equals("no")){
			System.out.print("\nYou must thinking a shower curtain right.");
			} if (ans1.equals("outside") && ans2.equals("yes")){
			System.out.print("\nYou must thinking a bison right.");
			} if (ans1.equals("outside") && ans2.equals("no")){
			System.out.print("\nYou must thinking a billboard right.");
			} if (ans1.equals("both") && ans2.equals("yes")){
			System.out.print("\nYou must thinking a dog right.");
			} if (ans1.equals("both") && ans2.equals("no")){
			System.out.print("\nYou must thinking a cell phone right.\n\r");
			} 
			
			System.out.print("\nWant to try again ? "); 
			String ans3 = scanner.next();
			if (ans3.equals("yes")) {
					answer = true;
				} else {
					answer = false;
					break;
					}
		}
		}
	}
