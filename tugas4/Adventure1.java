import java.util.Scanner;

public class Adventure1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!\n");
		
		System.out.print("You are in a creepy house! Would you like to go \"upstairs\" or into the\n \"kitchen\" ?\n>  ");
		String answer = scanner.next();
		if(answer.equals("kitchen")) {
			System.out.print("\nThere is a long countertop with dirty dishes everywhere. Off to one side\nthere is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\nor look in a \"cabinet\".\n> ");
			String answerOr = scanner.next();
			if (answerOr.equals("refrigerator")) {
				System.out.print("\nInside the refrigerator you see food and stuff. It looks pretty nasty.\nWould you like to eat some of the food? (\"yes\" or \"no\")\n> ");
				String answerEnd = scanner.next();
				if (answerEnd.equals("no")) {
					System.out.print("\nYou die of starvation... eventually.");
					} else {
						System.out.print("\nglad you open the refrigerator, come on just eat it yeah yeah");
						}
				} else if (answerOr.equals("cabinet")) {
					System.out.print("\nIn cabinet you find nothing, it's fullfilled with emptiness.\nI Suggest you to back, you better play football manager then.");
					}
			} else if (answer.equals("upstairs")) {
				System.out.print("\nUpstairs you see a halfway. At the end of hallway is the master\n\"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like\nto go?\n>  ");
				String answerOr = scanner.next();
				if (answerOr.equals("bedroom")) {
					System.out.print("\nYou are in a plush bedroom, with expensive-looking hardwood furniture. The\nbed is unmade. In the back of the room, the closet door is ajar. Would you\nlike to open the door? (\"yes\" or \"no\")\n> ");
					String answerEnd = scanner.next();
					if (answerEnd.equals("no")) {
						System.out.print("\nWell then I guess you'll never know what was in there. Thanks for playing,\nI'm tired of making nested if statements");
						} else {
							System.out.print("\nHmmm in here y'know, it's just filled by emptiness.");
							}
					} else if (answerOr.equals("bathroom")) {
						System.out.print("\nHi welcome to bathroom, do you wanna take a bath ? (\"yes\" or \"no\").");
						String answerEnd = scanner.next();
						if (answerEnd.equals("yes")) {
							System.out.print("\naight just take a bet yo");
							} else {
								System.out.print("\naight then you just go. ");
								}
						}
				
				}
			
		}
	}
