public class ArmstrongNumbers {
	public static void main(String[] args) {
		for (int a = 1; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					//System.out.println(a + "" + b + "" + c);
					int i = a * a * a + b * b * b + c * c * c;
					int j = concat(a, b, c);
			
					if (i == j) {
						System.out.println(i);
						
						}
					}
			
			
			
				}
				

		
			
			
			
			}
		
		
		
		
		
	}
	
					static int concat(int a, int b, int c) {
			String s1 = Integer.toString(a);
			String s2 = Integer.toString(b);
			String s3 = Integer.toString(c);
			
			String s = s1 + s2 + s3;
			
			int yareyare = Integer.parseInt(s);
			
			return yareyare;
			
			}
		}
	


