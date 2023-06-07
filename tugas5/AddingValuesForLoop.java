import java.util.Scanner;

public class AddingValuesForLoop{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number: ");
		int n = scanner.nextInt();
		System.out.println();
		int counter = 0;
		
		for (int i = 1 ; i <= n; i++) {
			System.out.print(i + " ");
			counter = counter + i;
			
			}
			
			System.out.print("\nThe sum is " + counter);
		
		
		}
	
	
	}
