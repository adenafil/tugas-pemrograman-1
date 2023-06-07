import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int i = 1 + r.nextInt(10);
		int tries = 0;
		
		System.out.print("I have chosen a number between 1 and 10. Try to guess it\n");
		System.out.print("Your guess: ");
		int ans = scanner.nextInt();
		tries++;
		
		
		
		do {
		

		
		if (ans != i) {
			System.out.print("That is incorrect. Guess again\n");
			}
		System.out.print("Your guess: ");
		ans = scanner.nextInt();
		tries++;
			} while (i != ans );
			
			
		System.out.print("\nIt only took you " +tries+ " tries");
		}
	}
