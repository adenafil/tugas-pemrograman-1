public class EvennessFunction {
	
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) {
			if (isEven(i) == true ) System.out.println(i + " <");
			if (isDivisibleBy3(i) ==  true) System.out.println(i + " =");
			if (isEven(i) == false && isDivisibleBy3(i) == false) System.out.println(i);
			
			} 
			
		
		}
	
	
	public static boolean isEven( int n ) {
		if (n % 2 == 0)  {
			
			return true;
			
			
			}
		return false;
		
		}
		
	public static boolean isDivisibleBy3( int n ) {
		if (n % 3 == 0) {
			
			return true;
			
			
			}
			
			return false;
		
		
		
		}
	

	
	
	}
