import java.util.Scanner;

public class Keychains1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		
		System.out.print("Ye Olde Keychain Shoppe");
		
		
		while (i != 5) {
			System.out.print("");
			
			System.out.print("\n\n1. Add Keychains to Order\n2. Remove Keychains from Order\n3. View Current Order\n4. Checkout");
			System.out.print("\n\nPlease enter your choice: ");
				int ans = scanner.nextInt();
							System.out.println();
				
				if (ans == 1) add_keychains();
				if (ans == 2) remove_keychains();
				if (ans == 3) view_order();
				if (ans == 4) checkout();
			
			

			}
		
		
		
		}
	
	static void add_keychains() {
		
		System.out.print("ADD KEYCHAINS");
		
		
		}
		
	static void view_order() {
		
		System.out.print("VIEW ORDER");
		
		
		}
		
	static void remove_keychains(){
		
		System.out.print("REMOVE KEYCHAINS");
		
		
		}
	
	static void checkout() {
		
		System.out.print("CHECKOUT");
		
		
		}
	
	}
