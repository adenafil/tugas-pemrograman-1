import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("SQUARE ROOT!");
		System.out.print("\nEnter a number : ");
		int ans = scanner.nextInt();
		
		while (ans < 0) {
			if (ans < 0) {
				System.out.print("You can't take the square root of negative number, silly.");
			}
			
			System.out.print("\nEnter a number : ");
			ans = scanner.nextInt();
		}
		
		
		System.out.print("\nThe square root of " + ans + " is " +  Math.sqrt(ans));
	}
}
