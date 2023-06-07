import java.util.Scanner;

public class GenderGame {
	public static void main(String[] args) {
		boolean j = true;
		
		while (j) {
		Scanner scanner = new Scanner(System.in);
		
		String status = "";
		
		System.out.print("What is your gender (M or F): ");
		String gender = scanner.next();
		System.out.print("First name: ");
		String fname = scanner.next();
		System.out.print("Last name: ");
		String lname = scanner.next();
		System.out.print("Age : ");
		int age = scanner.nextInt();
		
		if (age >= 20 && gender.equals("F")) {
			System.out.print("\nAre you married, " + fname + " (y or n) ? ");
			status = scanner.next();
			
			if (status.equals("y")) {
				System.out.print("\nThen I shall call you Mrs. " + lname);
				} else {
					System.out.print("\nThen I shall call you Ms. " + lname);
					}
			} else if (age < 20 && gender.equals("F")) {
				System.out.print("\nThen I shall call you " + fname + " " + lname);
				} else if (gender.equals("M") && age >= 20) {
					System.out.print("\nThen I shall call you Mr. " + lname);
					} else if (gender.equals("M") && age < 20) System.out.print("\nThen I shall call you " + fname + " " + lname);
						
				
				System.out.print("\n\nwant to try again ? (y / n) ");
				String y = scanner.next();
				
				
				System.out.println("\r\r\r\r\n\n\n\n\n===============================================");
				
				if (y.equals("n")) {
				j = false;
				break;
				}
						
				
			}	
				
		
		}
	}
