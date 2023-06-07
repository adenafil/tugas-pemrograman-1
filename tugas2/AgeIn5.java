import java.util.Scanner;

public class AgeIn5{
	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
			ageInFiveYears();
		}
		}
		
		public static void ageInFiveYears() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Hello. What is your name? ");
			String name = scanner.next();
			System.out.print("\nHi, " + name + "! How old are you? ");
			byte age = scanner.nextByte();
			System.out.print("\nDid you know that in five years you will be " + (age + 5) + " years old ?\n");
			System.out.print("And five years ago you were " + (age-5) + "! Imagine that!\n\n");
			}
	}
