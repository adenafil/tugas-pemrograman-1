import java.util.Scanner;

public class BabyNim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 3, b = 3, c = 3, remove;
		String pile;
		
		System.out.print("A: " + a + "\tB: " + b + "\tC: " + c);
		
		while (!(a == 0 && b == 0 && c == 0)) {
			System.out.print("\n\nChoose a pile : ");
			pile = scanner.next();
			System.out.print("How many to remove from pile " + pile + ": ");
			remove = scanner.nextInt();
			
			if (pile.equals("A")) {
				a = a - remove;
				
				} else if (pile.equals("B")) {
					b = b - remove;
					
					} else if (pile.equals("C")) {
						c = c - remove;
						
						} else {
							// just empty
							
						}
			System.out.print("\nA: " + a + "\tB: " + b + "\tC: " + c + "\n");		
			
			}
			
			System.out.print("\nAll piles are empty. Good Job!");
			
		}
	
	}
