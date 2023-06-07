import java.util.Scanner;
import java.util.Random;

public class ShorterDoubleDice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("HERE COME THE DICE!");
		Random r = new Random();

		int x = 1 + r.nextInt(6);
		int y = 1 + r.nextInt(6);
		
		do {
			x = r.nextInt(6);
			y = r.nextInt(6);
			System.out.print("Roll #1: " + x +  "\n");
			System.out.print("Roll #2: " + y + "\n");
			System.out.print("The total is " + (x + y) + "\n");
			} while(x != y);
		
		}
	}
