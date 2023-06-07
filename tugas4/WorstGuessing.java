import java.util.Scanner;

public class WorstGuessing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int theAns = 4;
		
		System.out.println("THE WORST NUMBER GESSING GAME EVER!!!!!!!!1!");
		System.out.print("I'M THINKING OF A NBR FROM 1-10. TRY GESS! ");
		int ans = scanner.nextInt();
		
		if (ans == theAns) {
			System.out.print("\nLOL!!! U GOT IT! I CANT BELIEVE U GESSED IT WAS " + theAns + "!");
			} else {
				System.out.print("WOOT! U SUX0R!!! I PWN J00!!! IT WAS " + theAns+ " !");
				}
		
		}
	
	}
