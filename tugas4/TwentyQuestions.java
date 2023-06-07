import java.util.Scanner;

public class TwentyQuestions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String result = "";
		
		System.out.print("TWO QUESTION!\nThink of an object, and I'll try to guess it.\n");
		System.out.print("\nQuestion 1) Is it animal, Vegetable, or mineral?\n> ");
		String answer1 = scanner.next();
		System.out.print("\nQuestion 2) Is it bigger than a breadbox?\n> ");
		String answer2 = scanner.next();
		
		if (answer2.equals("yes")) {
			if(answer1.equals("animal")) {
				result = "moose";
				} else if (answer1.equals("vegetable")) {
					result = "watermelon";
					} else if (answer1.equals("mineral")) {
						result = "Camaro";
						}
			} else if (answer2.equals("no")) {
				if (answer1.equals("animal")) {
					result = "squirrel";
					} else if (answer1.equals("vegetable")) {
						result = "carrot";
						} else if (answer1.equals("mineral")) {
							result = "paper clip";
							}
				}
		
		System.out.print("\nMy Guess is that you are thinking of a " +result + ".\n"  );
		System.out.print("I would ask you if I'm right, but i don't actually care yo");
		}
	}
