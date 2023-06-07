import java.util.Scanner;

public class AskingQuestions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age, feetTall, inches, intWeight;
		double weight;
		
		System.out.print("How old are you ? ");
		age = keyboard.nextInt();
		
		System.out.print("How many feet tall are you ? ");
		feetTall = keyboard.nextInt();
		
		System.out.print("And how many inches ? ");
		inches = keyboard.nextInt();
		
		System.out.print("How much do you weigh ? ");
		weight = keyboard.nextDouble();
		intWeight = (int) weight;
		
		System.out.println("So, you're 35 old, " + feetTall + 
		"'" + inches + "\" tall and " + intWeight + " heavy.");
		
		}
	
	}
