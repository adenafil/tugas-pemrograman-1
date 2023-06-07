import java.util.Scanner;

public class NumberGuessingWithACounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int random = getRandom(10);
		int tries = 0;
		
		System.out.print("I have chosen a number between 1 and 10. Try to guess it.\n");
		System.out.print("Your guess : ");
		int ans = scanner.nextInt();
		tries++;

		
		while (ans != random) {
			System.out.print("That is incorrect. Guess again.\n");
			System.out.print("Your guess : ");
			ans = scanner.nextInt();
			tries++;
			}
		
		System.out.print("That's right! You're a good guesser.\n");
		System.out.print("It only took you " + tries + " tries.");
		
		}
		
		public static int getRandom(int max){
       // return (int) (Math.random()*max);  //incorrect always return zero
        return (int) (Math.random()*max);
		}
	}
