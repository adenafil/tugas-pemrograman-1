import java.util.*;


public class HowManyTimes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = {45, 39, 32, 12, 44, 50, 26, 42, 16, 20,24, 24, 24 };
		System.out.println("Array: " + Arrays.toString(arr));

		System.out.print("Value to find: ");
		int ans = scanner.nextInt();
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == ans) count++;
				
			if (count != 0 && i == arr.length - 1) System.out.print("\n" + ans + " was found " + count + " times."); 	
			if (count == 0 && i == arr.length - 1) System.out.print("\n" + ans + " was found 0 times."); 	

			
			}
		
		
		
		}
	
	
	
	}
