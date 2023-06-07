import java.util.*;
import java.lang.*;
import java.io.*;

public class CollatzSequence {
	
	 public static int[] addX(int n, int arr[], int x)
   {
       int i;
   
       // create a new array of size n+1
       int newarr[] = new int[n + 1];
   
       // insert the elements from
       // the old array into the new array
       // insert all elements till n
       // then insert x at n+1
       for (i = 0; i < n; i++)
           newarr[i] = arr[i];
   
       newarr[n] = x;
   
       return newarr;
   }
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Starting number : ");
		int n = scanner.nextInt();
		int checker = 0;
		int i = 10;
		int buffer = 10;
		int largestValue = 0;
		int nOld = n;
		int a[] = {0};
		
		//System.out.print(n + "\t");
		while (n != 1) {
		checker++;
		a = addX(checker, a, n);
			
		
			
		
								
		
		
		
		//arr[checker] = n;
		if (checker != i) {
					
					System.out.print(n + "\t");	
					
					} else if (checker == i) {
						System.out.print(n + "\t\n");	
						
						}
		
			
			if (n % 2 == 1) {
				n = 3 * n + 1;
				
				} else if (n % 2 == 0) {
					n = n / 2;
					
					}
				
				
		

			
			if (buffer == checker) {
				i = i + 10;
				buffer = i;
				//while (a <= buffer) {
					
					//}
				
				}
				
			// max value
				
		//	largestValue = Math.max(nOld, n);

			
			
			
			
					
		//	System.out.print(" (h = "+ largestValue + ") ");
			
			//nOld = n;
			
		
			
			
			}
			// bonus 1
			
			System.out.println("1\n\nTerminated after " + checker + " steps." );
			int temp;
			// bonus 2
			for (int z = 0; z < a.length; z++) {
				for (int j = z+1; j < a.length; j++) {
					if (a[z] > a[j]) {
						temp = a[z];
						a[z] = a[j];
						a[j] = temp;
						}
					
					}
				
				}
			
			System.out.println("The largest value was " + a[a.length-1]);
			
			
			
			
			
			
			
		
		}
		
	
	}
