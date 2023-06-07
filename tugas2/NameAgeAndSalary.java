import java.util.Scanner;

public class NameAgeAndSalary{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello. What is your name?");
		String name = scanner.next();
		
		System.out.println("\nHi, " + name + "! How old are you?");
		int age = scanner.nextInt();
		
		System.out.println("\nSo you're " + age + ", eh ? That's not old at all!");
		System.out.println("How much do you make, Dennis ?");
		
		double salary = scanner.nextDouble();
		
		System.out.println("\n" + salary + "! I hope that's per hour and not per year! LOL!");
		}
		

	}
