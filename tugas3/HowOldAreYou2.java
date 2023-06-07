import java.util.Scanner;

public class HowOldAreYou2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hey, What's your name ? (Sorry i keep forgetting.) ");
		String name = scanner.next();
		
		System.out.print("\nOk, " + name + ", How old are you ? ");
		int age = scanner.nextInt();
		
		if (age <= 16) {
			System.out.println("\nYou can't drive, " + name + ".");
			} else if (age == 16 || age == 17) {
				System.out.println("\nYou can't drive but not vote, " + name + ".");
				} else if (age <= 18 && age >= 24 ) {
					System.out.println("\nYou can vote but not rent a car, " + name + ".");
					} else {
						System.out.println("You can do pretty much anything, " + name + ".");
						}
		
		}
	}
