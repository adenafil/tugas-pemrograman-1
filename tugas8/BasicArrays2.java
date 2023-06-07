import java.util.Random;

public class BasicArrays2 {
	public static void main(String[] args) {
		Random r = new Random();
		int random = r.nextInt(100);
		int[] arr = new int [10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random;
			System.out.println("Slot " + i + " contains a " + arr[i]);
			random = r.nextInt(100);
			
			
			
			}
		
		
		
		
		}
	
	
	}
