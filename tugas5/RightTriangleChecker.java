import java.util.Scanner;

public class RightTriangleChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int side1, side2, side3;
		
		System.out.print("Enter three integers");
		System.out.print("\nSide 1: ");
		side1 = scanner.nextInt();
		System.out.print("Side 2: ");
		side2 = scanner.nextInt();
		
		while (side2 < side1) {
			System.out.print(side2 + " is smaller than " + side1 + ". Try again.");
			
			System.out.print("\nSide 2: ");
			side2 = scanner.nextInt();
			
			}
			
		System.out.print("Side 3: ");
		side3 = scanner.nextInt();
		
		while (side3 < side2) {
			System.out.print(side3 + " is smaller than " + side2 + ". Try again.");
			System.out.print("\nSide 3: ");
			side3 = scanner.nextInt();
			}
			
		System.out.print("\nYour three sides are " + side1 + " " +side2+ " " + side3 +  "\n");
		boolean right = (side1 * side1) + (side2 * side2) == (side3*side3);
		if (right) {
			System.out.print("These sides *do* make a right triangle. Yippy-sippy!");
			
			} else {
				System.out.print("No! These sides do not make aright triangle");
				
				}
		
		
		
		}
	}
