import java.util.Scanner;

public class CountingWhile {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in amessage, and i'll display it five times.");
		System.out.print("Message : ");
		String message = keyboard.nextLine();
		
		int n = 0;
		n++;
		System.out.print("How many times? ");
		int max = keyboard.nextInt();
		while (n <= max) {
			System.out.println((n * 10) + ". " + message);
			n++; // it is used to increase b=number
			}
		
		}
	}
