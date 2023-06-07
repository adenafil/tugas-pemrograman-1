import java.util.Scanner;

public class BMICalc {
	public static void main(String[] args) {
		System.out.println("=======this is the first sample=======");
		firstSample();
		System.out.println("\n=======this is the second sample=======");
		secondSample();
		System.out.println("\n=======this is the third sample=======");
		thirdSample();
		}
		
		public static void firstSample() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("your height in m: ");
			float height = scanner.nextFloat();
			System.out.print("Your weight in kg: ");
			float weight = scanner.nextFloat();
			
			float bmi = weight / (height * height);
			System.out.print("Your bmi is " + bmi);
			
			}
			
		public static void secondSample() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("your height in inches: ");
			float inches = scanner.nextFloat();
			System.out.print("Your weight in pounds: ");
			float pounds = scanner.nextFloat();
			
			float bmi = (703 * pounds) / (inches * inches);
			System.out.print("Your bmi is " + bmi);
			
			}
			
		public static void thirdSample() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("your height (feet only): ");
			float inches = scanner.nextFloat();
			System.out.print("Your height (inches): ");
			float height = scanner.nextFloat();
			System.out.print("Your weight in pounds: ");
			float pounds = scanner.nextFloat();
			
			double i = height + inches * 12;
			double bmi = (703 * pounds) / Math.pow(i, 2);  ;
			System.out.print("Your bmi is " + bmi);
		}

	}
