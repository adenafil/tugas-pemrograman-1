import java.util.Scanner;

public class MoreUserInputOfData{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the following information so i can sell it for a profit \n");
		
		System.out.print("First name: ");
		String firstName = scanner.next();
		System.out.print("Last name: ");
		String lastName = scanner.next();
		System.out.print("Grade (9-12): ");
		byte grade = scanner.nextByte();
		System.out.print("Student id: ");
		int studentId = scanner.nextInt();
		System.out.print("Login: ");
		String login = scanner.next();
		System.out.print("GPA (0.0-4.0): ");
		float gpa = scanner.nextFloat();
		
		System.out.print("\nYour information: \n");
		System.out.println("\tLogin: " + login);
		System.out.println("\tID: " + studentId);
		System.out.println("\tName: " + lastName + ", " + firstName);
		System.out.println("\tGPA: " + gpa);
		System.out.println("\tGrade: " + grade);
		
		}
	}
