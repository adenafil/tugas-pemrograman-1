import java.util.Scanner;

public class AgeMessages3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Your name: ");
		String name = scanner.next();
		System.out.print("Your age: ");
		int age = scanner.nextInt();
		String result = "";
		
		if(age < 16) {
			result = "You can't drive, ";
			} if (age >= 16 && age <= 17) {
				result = "You can drive but not vote, ";
				} if (age >= 18 && age <= 24) {
					result = "You can vote but not rent a car, ";
					} if (age >= 25) {
						result = "You can do pretty much anything, ";
						}
						
		System.out.print(result + name + ".");
		}
	}
