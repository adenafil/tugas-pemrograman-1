public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			
			if (i == 1) {
				System.out.print("x | ");
				for (int k = 1; k <= 9; k++) {
					System.out.print(k + "\t");
					
					
					}
				for (int l = 1; l <= 69; l++) {
					if (l == 1) {
						System.out.print("\n=");
						
						} else if (i == 3) {
							System.out.print("+");
							
							
							} else {
								System.out.print("=");
								
								
								}
					
					
					}
				
				}
			
			
			for (int n = 1; n <= 12; n++) {
				
				if (n == 1) {
					System.out.print("\n" + i + " | " + i  + "\t");
					
					
					
					} else {
						System.out.print((i * n) + "\t");
						
						
						
						}
				
				
				}
			
			System.out.println();
			
			
			}
		
		
		
		
		}
	
	
	
	}
