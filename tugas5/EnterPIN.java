import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println("WELCOME TO THE BANK OF MITCHEL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		
		while (entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			}
			
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		
		}
	}
	
	/*
	1.How is a while loop similar to an if statement?
	answer = while and if have a expression or condition and statement, that is
	the similar to an if statement with loop.
	2.How is a while loop different from an if statement?
	answer = the different that if only does once after the condition was right while loop
	will do a repitition.
	3. Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
	answer = it is because there was already variabel global declared before with int.
	4. Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
	answer = there will be looping constantly until memory computer is full, and that happens because what is in entry never
	will be changed after all.
	5. (Put the entry = keyboard.nextInt(); back before you turn in the assignment.)
	answer = yeah.
	* /
	
