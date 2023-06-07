import java.util.Random;

public class CopyingArrays {
	public static void main(String[] args) {
		Random num = new Random();
		int r = num.nextInt(100);
		int[] arr1 = new int [10];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = r;
			
			if (i == 0) System.out.print("Array 1 : " + arr1[i]);
			if (i != 0) System.out.print(" " + arr1[i]);
			r = num.nextInt(100);
			
			}
			
			
			System.out.print("\nArray 2 : ");
		int arr2[] = new int[10];
		for (int j = 0; j < arr2.length; j++) {
			
			if (j == 9) arr2[j] = 50 ;
			if (j != 9) arr2[j] = arr1[j];
			System.out.print(arr2[j] + " ");
			
			
			}	
		
		
		
		
		}
	
	
	
	
	}
