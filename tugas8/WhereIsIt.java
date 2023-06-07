import java.util.Scanner;
import java.util.Arrays;

public class WhereIsIt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = {45, 39, 32, 12, 44, 50, 26, 42, 16, 20,24, 24, 24 };
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.print("Value to find: ");
		int ans = scanner.nextInt();
		boolean rui = false;
		
		for (int i =0; i < arr.length; i++) {
			if (arr[i] == ans) {
				
				System.out.print("\n" + ans + " is in slot " + i + "."); 
				rui = true;
				
				}
			if (arr[i] != ans && i == arr.length-1 && rui == false) System.out.print("\n" + ans + " is not in the array.");
			
			}
		
		
		
		}
	
	
	
	}
