import java.util.Scanner;
import java.lang.Math;


public class AreaCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		

			
		System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.\n");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		while (i != 5) {
			System.out.print("1) Triangle\n2) Rectangle \n3) Square \n4) Circle \n5) Quit\nWHich shape: ");
			int ans = scanner.nextInt();
			
			if (ans == 1) {
				System.out.print("\nBase : ");
				int base = scanner.nextInt();
				System.out.print("Height : ");
				int height = scanner.nextInt();
				double d = area_triangle(base, height);
		        System.out.println(" \nThis area is " + (int) d + ".\n");
				
				
				} else if (ans == 2) {
					
					System.out.print("\nLength : ");
					int length = scanner.nextInt();
					System.out.print("Width : ");
					int width = scanner.nextInt();
					double d = area_rectangle(length, width);
					System.out.println(" \nThis area is " + (int) d + ".\n");
					
					
					} else if (ans == 3) {
					
						System.out.print("\nSide length : ");
						int length = scanner.nextInt();
						int d = area_square(length);
						System.out.println(" \nThis area is " +  d + ".\n");
					
					
					} 	 else if (ans == 4) {
					
						System.out.print("\nRadius : ");
						int radius = scanner.nextInt();
						double d = area_circle(radius);
						System.out.printf("This area is %.4f\n", d);					
					
					} else if (ans == 5) {
						System.out.print("\nGoodbye.");
						i = 5;
						}
			
			
			}
			
			

		
		
		
		}
		
		
	public static double area_circle( int radius ) {
		
		return Math.pow(radius, 2) * Math.PI;
		
		}         
	public static int area_rectangle( int length, int width )   {
		
		
		return length * width;
		}
	public static int area_square( int side ) {
		
		return (int) Math.pow(side, 2);
		
		
		} 
		              
	public static double area_triangle( int base, int height ) {
		
		
		return (int) base * height / 2;
		
		} 

	
	
	
	}
