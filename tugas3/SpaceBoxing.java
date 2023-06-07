import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
		double result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please Enter your current earth weight: ");
		int weight = scanner.nextInt();
		
		System.out.print("\nI have information for the following planets: \n");
		System.out.print("\t1. Venus \t2. Mars \t3. Jupiter\n");
		System.out.print("\t1. Saturn \t2. Uranus \t3. Neptune\n");
		
		System.out.print("\nWhich planet are you visiting ? ");
		int choose = scanner.nextInt();
		
		if (choose == 1) {
			result = weight * 0.78;
			} else if (choose == 2) {
				result = weight * 0.39;
				} else if (choose == 3) {
					result = weight * 2.65;
					} else if (choose == 4) {
						result = weight * 1.17;
						} else if (choose == 5) {
							result = weight * 1.05;
							} else if (choose == 6) {
								result = weight * 1.23;
								} else {
									result = 0;
									}
		
		System.out.print("\nYour weight would be " + + result + " pounds on that planet.");
		
		
		
		}
	}
