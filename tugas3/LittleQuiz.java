import java.util.Scanner;

public class LittleQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int point = 0;
		
		System.out.print("Are you ready for a quiz? ");
		char n = scanner.next().charAt(0);
		System.out.println("Okay, here it comes!\n");
		
		System.out.print("Q1) What is the capital of Alaska? \n");
		System.out.print("\t1) Melbourne\n\t2) Anchorage\n\t3) Juneau\n\n> ");
		int answer = scanner.nextInt();
		
		if (answer == 3) {
			System.out.println("\nThat is right!\n");
			point++;
			} else {
				System.out.println("\nOopss, you are wrong!\n");
				}
		System.out.print("Q2) Can you store the value \"cat\" in a variable of type int\n\t1) yes\n\t2) no\n> ");
		answer = scanner.nextInt();
		if (answer == 2) {
			System.out.print("\nThat is correct\n");
			point++;
			} else {
				System.out.print("\nSorry, \"cat\" is a string. ints can only store numbers.\n");
				}
		
		System.out.print("Q3) What is the result of 9+6/3? \n\t1) 5\n\t2) 11\n\t3) 15/3 \n> ");
		answer = scanner.nextInt();
		
		if(answer == 2) {
			System.out.println("\nThat's correct!\n");
			point++;
			} else if(answer == 1 || answer == 3) {
				System.out.println("\nThat's wrong!\n");
				} else {
					System.out.println("\nYang benerrr ? 😒\n");
					}
					
		System.out.print("\nOverall, you got " + point + " out of 3 correct\nThanks for playing!" );
		
		
		
		}
	}
