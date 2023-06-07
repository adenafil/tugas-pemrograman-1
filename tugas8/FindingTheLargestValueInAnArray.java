import java.util.*;

public class FindingTheLargestValueInAnArray {
	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(90) + 10;
		int[] arr = new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r;
			r = random.nextInt(90) + 10;
			
			
			}
		boolean rui = false;
		System.out.print("Array : " + Arrays.toString(arr));
		
		int a = arr[0];
		for (int j = 0; j < arr.length; j++) {
			
			if (arr[j] > a) {
				a = arr[j];
			
			}
		//	a = Math.max(arr[j]);	
			//System.out.println(a);	
		//	System.out.print(Math.max(arr[0], arr[j]));
			}
			
		System.out.print("\nThe largest value is " + a);	


		}
	
	
	
	}
