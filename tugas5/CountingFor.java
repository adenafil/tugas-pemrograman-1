import java.util.Scanner;

public class CountingFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type in a message, and i'll display it five times.");
		System.out.print("Message: ");
		String message = scanner.nextLine();
		
		for (int i = 2; i <= 10; i = i+ 2) {
			System.out.println(i + ". " + message);
			
			
			}
		
		
		}
	
	}
	
	
	//1. like the code before.
//2. it is used for counter
//3. just change like (int i = 1; i <= 10; i++);
//4. aight

