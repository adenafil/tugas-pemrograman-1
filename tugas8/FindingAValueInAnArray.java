import java.util.Scanner;
import java.util.Random;

public class FindingAValueInAnArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int rui = r.nextInt(90) + 10;
		int arr[] = new int[10];
		System.out.print("Array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rui;
			rui = r.nextInt(90) + 10;
			System.out.print(" " + arr[i]);
			
			
			}
		
		System.out.print("\nValue to find: ");
		int ans = scanner.nextInt();
		
		for (int j = 0; j < arr.length; j++) {
			if (ans == arr[j] ) {
				System.out.print("\n" + arr[j] + " in in the array");
				
				
				}
			
			
			}
		
		
		
		}
	
	
	
	
	
	}
