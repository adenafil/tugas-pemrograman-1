import java.util.Scanner;

public class DumbCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your first number? ");
		float first = scanner.nextFloat();
		System.out.print("What is your second number? ");
		float second = scanner.nextFloat();
		System.out.print("What is your third number? ");
		float third = scanner.nextFloat();
		
		System.out.print("\n( " + first + " + " + second + " + " + third + " ) / 2 is... " + ((first + second + third)/2));
		}
	}
