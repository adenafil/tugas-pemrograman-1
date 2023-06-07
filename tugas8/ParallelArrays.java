import java.util.Scanner;

public class ParallelArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] par1 = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
		double[] par2 = {99.5, 78.5, 96.5, 96.8, 87.1};
		int[] par3 = {123456, 813225, 823669, 307760, 827131};
		
		System.out.println("Values: ");
		for (int i = 0; i < par3.length; i++) {
			System.out.println("\t" + par1[i] + " " + par2[i] + " " + par3[3]);
			
			}
		System.out.print("\nID number to find: ");
		int ans = scanner.nextInt();
		
		for (int i = 0; i < par3.length; i++) {
			if (par3[i] == ans) {
				System.out.print("\nFound it in slot " + i);
				System.out.print("\n\tName: " + par1[i]);
				System.out.print("\n\tAverage: " + par2[i]);
				System.out.print("\n\tID: " + par3[i]);
				break;
				
				}
			
			
			}
		
		}
	
	
	
	}
