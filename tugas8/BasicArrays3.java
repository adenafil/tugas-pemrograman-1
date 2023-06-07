import java.util.Random;

public class BasicArrays3 {
	public static void main(String[] args) {
		Random r = new Random();
		//int rui = r.nextInt(90) + 10;
		int arr[] = new int[1000];
		int a = 19;
		
		for(int i = 0; i < arr.length; i++ ) {
		int rui = r.nextInt(90) + 10;
		arr[i] = rui;
			if (i < a) System.out.print(arr[i] + "  ");
			
			if 	(i == a) { 
				a = a + 20;
				System.out.println(arr[i] + "  ");
				
			}
			
			
			}
		
		
		}
	
	
	
	}
