import java.util.Scanner;
import java.lang.*;

public class LetterAtATime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is yout message? ");
		String ans = scanner.nextLine();
		
		System.out.print("\nYour message is " + ans.length() + " character long.");
		System.out.print("\nThe first character is at postiton " + (ans.length() - ans.length()) + " and is " + ans.charAt(ans.length() - ans.length()));
		System.out.print("\nThe last character is at postiton " + (ans.length()) + " and is " + ans.charAt(ans.length() - 1) + "\n" );
		
		
		System.out.print("\nHere are all the characters, one at a time\n");
		int a = 0;
		
		
		for (int i = 0; i < ans.length(); i++) {
			System.out.println(i + " - '" + ans.charAt(i) + "'" );
			//System.out.println(ans.charAt(i).equals('a'));
			if (ans.charAt(i) == 'a') {
				a++;
				}

			
			}
			
			System.out.print("\nYour message contains the letter 'a' " + (a) + " times. Isn't that interesting?");

		}
	
	
	}
