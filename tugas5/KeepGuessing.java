import java.util.Scanner;

public class KeepGuessing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int random = getRandom(10);
		System.out.print(random);
		System.out.print("I have chosen a number between 1 and 10. Try to guess it");
		System.out.print("\nYour guess: ");
		int ans = scanner.nextInt();
		
		while (random != ans) {
			System.out.print("That os incorrect. Guess again.\nYour guess: ");
			ans = scanner.nextInt();
			
			
			}
		
		System.out.print("That's rigrh! You're a good guesser");
		
		}
		
		public static int getRandom(int max){
       // return (int) (Math.random()*max);  //incorrect always return zero
        return (int) (Math.random()*max);
		}


	}
