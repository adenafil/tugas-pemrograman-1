import java.util.Scanner;

public class AddingValuesInALoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int buffer = 0;
		
		System.out.print("I will add up the numbers you give me\n");
		System.out.print("Number : ");
		int ans = scanner.nextInt();
		buffer = buffer + ans;
		System.out.print("The total so far is " + buffer + "\n");
		
		while (ans != 0) {
		System.out.print("Number : ");
		ans = scanner.nextInt();
		buffer = buffer + ans;
		System.out.print("The total so far is " + buffer + "\n");
			}
		
		System.out.print("\nThe total is " + buffer);
		
		}
	}
