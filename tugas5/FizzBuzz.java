public class FizzBuzz {
	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 100; i++) {
			boolean fizz = i % 3 == 0;
			boolean buzz = i % 5 == 0;
			
			if (fizz) {
				if (buzz && fizz) {
						System.out.print("\nFizzBuzz");
						
						
						}
				
				System.out.print("\nFizz");
				
				
				} else if (buzz) {
					System.out.print("\nBuzz");
					
					
					}  else {
							System.out.print("\n" + i);
							
							}
			
			
			
			}
		
		
		
		}
	
	
	}
