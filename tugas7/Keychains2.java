import java.util.Scanner;

public class Keychains2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price = 10;
		int currentKeyChains = 0;
		
		int i = 0;
		
		System.out.print("Ye Olde Keychain Shoppe");
		
		
		while (i != 5) {
			System.out.print("");
			
			System.out.print("\n\n1. Add Keychains to Order\n2. Remove Keychains from Order\n3. View Current Order\n4. Checkout");
			System.out.print("\n\nPlease enter your choice: ");
				int ans = scanner.nextInt();
							System.out.println();
				
				if (ans == 1) currentKeyChains = add_keychains(currentKeyChains);
				if (ans == 2) currentKeyChains = remove_keychains(currentKeyChains);
				if (ans == 3) view_order(currentKeyChains, price);
				if (ans == 4) checkout(currentKeyChains, price);
			
			

			}
		
		
		
		}
	
	static int add_keychains(int numOfKey) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("You have " + numOfKey + " keychains. How many to Add ? ");
		int add = scanner.nextInt();
		add = numOfKey + add;
		System.out.print("You now have " + add +" keychains.");
		
		return add;
		}
		
	static void view_order(int i, int price) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("You have " + i + " keychains.\n");
		int cost = i * price;
		System.out.print("Keychains cost $" + price + " each.\n");
		System.out.print("Total cost is $" + cost + ".\n");
		
		//return cost;
		}
		
	static int remove_keychains(int i){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("You have " + i + " keychains. How many to remove ? ");	
		int remove = scanner.nextInt();
		i = i - remove;
		System.out.print("You now have " + i + " keychains.");	
		
		
		return i;
		}
	
	static void checkout(int i, int price) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name ? ");
		String name = scanner.next();
		System.out.print("You have " + i + " keychains.");
		System.out.print("Total cost $" + price + "  each.\n");
		int total = i * price;
		System.out.print("Total cost is $" + total + ".\n");
		System.out.print("Thanks for your order, " + name);
		
		
		}
	
	}
