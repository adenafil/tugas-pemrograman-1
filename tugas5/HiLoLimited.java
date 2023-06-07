import java.util.Scanner;

public class HiLoLimited {
	public static void main(String[] args) {
		System.out.print("I'm thinking of a number between 1-100. You have 7 guesses.\n");
		Scanner scanner = new Scanner(System.in);
		int random = (int) (Math.random() * 100);
		
		int maxAns = 7;
		int counts = 1;
		System.out.print("First guess: ");
		int ans = scanner.nextInt();
		counts++;
		
		while (ans != random && counts <= maxAns) {
			
				
			    
			    if (ans < random) {
				System.out.print("Sorry you are too low.\n");
				System.out.print("Guess # " + counts + ": ");
				ans = scanner.nextInt();
				counts++;
				} else if (ans > random) {
				System.out.print("Sorry, that guess is too high.\n");
				System.out.print("Guess # " + counts + ": ");
				ans = scanner.nextInt();
				counts++;
					}
			}
			
		if (ans == random) {
			System.out.print("Your guessed it! What are the odds?!?");
			} else if (ans != random) {
				System.out.print("Sorry, you didn't guess it in " + (counts-1) + " tries. You Lose.");
				
				}
		}
	}
