import java.util.Scanner;
import java.util.Random;

public class GradesInAnArrayAndAFile {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int random = r.nextInt(100);
		
		System.out.print("Name (first last): ");
		String name = scanner.nextLine();
		System.out.print("Filename: ");
		String file = scanner.next();
		System.out.print("\nHere are your randomly-selected grades (hope you pass):");
		
		int[] grade = new int[5];
		
		for (int i = 0; i <
			grade.length; i++) {
			grade[i] = random;	
			System.out.println("Grade " + (i+1) + ": " + grade[i]);
			random = r.nextInt(100);
			
			
			}
		System.out.print("\nData saved in \"ettu.txt\"");
		
		
		
		
		
		}
	
	
	}
