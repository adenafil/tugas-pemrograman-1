import java.util.Scanner;

public class AlphabeticalOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (i < 5) {
		System.out.print("What's your last name ? ");
		
		
		String lname = scanner.next();
		
		if (lname.compareTo("Carswell") <= 0) {
			System.out.print("You don't have to wait long");
			} else if (lname.compareTo("Jones") <= 0) {
				System.out.print("That's not bad");
				} else if (lname.compareTo("Smith") <= 0) {
					System.out.print("looks like a bit of a wait");
					} else if (lname.compareTo("Young") <= 0) {
						System.out.print("it's gonna be a while");
						} else if (lname.compareTo("Young") >= 0) {
							System.out.print("not going anywhere for a while?");
							} else {
								System.out.print("wrong or error");
								}
								
		System.out.print(" " + lname + ".");
		i++;
		
		System.out.print("\n\n\n\r\r\r\r=====================================\n\n\r\r");
	}
		}
	}
