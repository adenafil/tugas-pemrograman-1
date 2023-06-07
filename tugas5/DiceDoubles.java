public class DiceDoubles {
	public static void main(String[] args) {
		System.out.println("HERE COMES THE DICE!");

		int a = getRandom(12);
		int b = getRandom(12);
		
		roll(a, b);
		
		

		}
		
		public static void roll (int a, int b) {
		System.out.print("ROLL #1 : " + a + "\n");
		System.out.print("ROLL #2 : " + b + "\n");		
		System.out.print("The total is " + (a + b)+ "!\n");	
					
		while (a != b) {
			
		 a = getRandom(12);
		 b = getRandom(12);
		
		System.out.print("ROLL #1 : " + a + "\n");
		System.out.print("ROLL #2 : " + b + "\n");
		System.out.print("The total is " + (a + b)+ "!\n");		
			}
		
		
		}
			
		public static int getRandom(int max) { 
			return (int) (Math.random()*max); 
			}

	}
