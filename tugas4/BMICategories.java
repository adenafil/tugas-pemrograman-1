import java.util.Scanner;
import java.lang.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class BMICategories {
	
	private static final DecimalFormat df = new DecimalFormat("0.0");
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Your height in inches: ");
		float inches = scanner.nextFloat();
		System.out.print("\nYour weight in pounds: ");
		int weight = scanner.nextInt();
		
		double bmi = (weight / (inches*inches) )* 703;
		//df.setRoundingMode(RoundingMode.UP);
		String result = df.format(bmi);
		double result1 = Math.round(bmi * 100) / 100;
		String cetagory = "";
		
		if (bmi < 15.0) {
			cetagory = "very severely underweight";
			} if (bmi >= 15.0 && bmi <= 16.0) {
				cetagory = "severly underweight";
				} if (bmi >= 16.1 && bmi <= 18.4) {
					cetagory = "underweighr";
					} if (bmi >= 18.5 && bmi <= 24.9) {
						cetagory = "normal weight";
						} if (bmi >= 25.0 && bmi <= 29.9) {
							cetagory = "overweight";
							} if (bmi >= 30.0 && bmi <= 34.9) {
								cetagory = "moderately obese";
								} if (bmi >= 35.0 && bmi <= 39.9) {
									cetagory = "severly obose";
									} if (bmi >= 40) {
										cetagory = "very severy obose";
										}
									
										float f = (float) bmi;
										
		//System.out.print("\nYour BMI is " +result + " or " + result1 + " or " + df.format(f));
		System.out.print("\nYour BMI is " + result);
		System.out.print("\nBMI Cetagory: " + cetagory);
		}
	}
