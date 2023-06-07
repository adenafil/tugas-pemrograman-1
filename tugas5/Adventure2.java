import java.util.Scanner;

public class Adventure2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("MITCHELL'S TINY ADVENTURE 2!");
		
		int nextroom = 1;
		String choice = "";
		
		while (nextroom != 0) {
			
			if (nextroom == 1) {
				System.out.println("\nYou are in a creepy house! WOuld you like to go \"upstairs\" or into the\n \"kitchen\"?");
				System.out.print("> ");
				choice = scanner.next();
				
				if (choice.equals("kitchen")) {
					nextroom = 2;
					
					} else if (choice.equals("upstairs")) {
						nextroom = 3;
						
						} else {
							
							System.out.println(choice + " wasn't one of the options. Try again.");
							}
							
				} if (nextroom == 2) {
					System.out.println("\nthere is long countertop with dirty dishes everywhere. off to one side\nthere is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\nor go \"back\".");
									System.out.print("> ");
					choice = scanner.next();
					
					if (choice.equals("refrigerator")) {
						nextroom = 4;
						
						} else if (choice.equals("back")) {
							nextroom = 1;
							
							} else {
								System.out.println( choice + " wasn't one of the options. Try again.");
								
								}
					
					
				} if (nextroom == 3) {
					
					System.out.println("\nUpstairs you see a hallway. At the end of the hallway is the master\n\"bedroom\". There is also a\"bathroom\" off the hallway. Or, you can\ngo back \"downstairs\". Where would you like to go?\n");
									System.out.print("> ");
					choice = scanner.next();
					
					if (choice.equals("bedroom")) {
						nextroom = 5;
						
						
						} else if (choice.equals("bathroom")) {
							nextroom = 6;
							
							
							} else if (choice.equals("downstairs")) {
								nextroom = 1;
								
								
								} 
							
							else {
								
								System.out.println( choice + " wasn't one of the options. Try again.");
								
								}
					
					
				} if (nextroom ==4) {
					
					System.out.println("\nInside the refrigerator you see food and stuff. It looks pretty nasty.\nWOuld you like to eat some of the food? (\"yes\" or \"no\")");
									System.out.print("> ");
					choice = scanner.next();
					
					
					if (choice.equals("yes")) {
						System.out.print("The food is slimy and foul, but you manage to choke it down. Your stomach\nstarts jumping like a frog in hot water. You feel faint. SLiding to the floor, the darkness closes in.\n\nYou have died");
						nextroom = 0;
						
						} else if (choice.equals("no")) {
							System.out.print("good, you dont eat that food.\n\nYou are still alive.");
							nextroom = 0;				
							
							} else {
								
								System.out.println( choice +  " wasn't one of the options. Try again.");
								
								}
					
					
				} if (nextroom == 5) {
					
					System.out.println("\nYou are in a bedroom, woould yo go to sleep ? (\"yes\" or \"no\").");
									System.out.print("> ");
					choice = scanner.next();
					
					if (choice.equals("yes")) {
						System.out.print("When you sleep, there is a person or monster that will go to kill you.\n\nYou have died.");
												nextroom = 0;
						
						
						} else if (choice.equals("no")) {
						System.out.print("Good you dont sleep, there is a person or monster that will go to kill you, if you sleep.\n\nYou are alive .");							
													nextroom = 0;
							
							} else {
								
								System.out.println( choice + " wasn't one of the options. Try again.");
								
								}
					
					
				} if (nextroom == 6) {
					
					System.out.print("\nYou are in the bathroom, would you take bath ? (\"yes\" or \"no\")");
									System.out.print("> ");
					choice = scanner.next();
					
					if (choice.equals("yes")) {
						System.out.print("you died, because the water have been poisend by the monster");
												nextroom = 0;
						
						} else if (choice.equals("no")) {
							System.out.print("good, you are alive, you dont get poisonde by the monster.");
													nextroom = 0;
							
							} else {
								
								System.out.println( choice +" wasn't one of the options. Try again.");
								
								}
					
					
					
				}
			
			}
			
			
			
			
			
			
			System.out.println( "\nThe game is over. The next episode can be downloaded for only 800 Microsoft points!" );
			
			
		
		}
	
	}
