import java.util.Scanner;

public class Keychains3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price = 10;
		int currentKeyChains = 0;
		double salesTax = 0.0825;
		int shippingCost = 5;
		int costPerKey = 1;
		
		int i = 0;
		
		System.out.print("Ye Olde Keychain Shoppe");
		
		
		while (true) {
			System.out.print("");
			
			System.out.print("\n\n1. Add Keychains to Order\n2. Remove Keychains from Order\n3. View Current Order\n4. Checkout");
			System.out.print("\n\nPlease enter your choice: ");
				int ans = scanner.nextInt();
							System.out.println();
				
				if (ans == 1) currentKeyChains = add_keychains(currentKeyChains);
				if (ans == 2) currentKeyChains = remove_keychains(currentKeyChains);
				if (ans == 3) view_order(currentKeyChains, price, salesTax, shippingCost, costPerKey);
				if (ans == 4) {
					checkout(currentKeyChains, price, salesTax, shippingCost, costPerKey);
					
					break;
				}
			
			

			}
		
		
		
		}
	
	static int add_keychains(int numOfKey) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("You have " + numOfKey + " keychains. How many to Add ? ");
		int add = scanner.nextInt();
		
		if (add < 0) {
			System.out.print("minus numbet can be turnes in.\n");
			add_keychains(numOfKey);
			}
		
		add = numOfKey + add;
		System.out.print("You now have " + add +" keychains.");
		
		return add;
		}
		
	static void view_order(int i, int price, double salesTax, int shippingCost, int costPerKey) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("You have " + i + " keychains.\n");
		int cost = (i * price) + shippingCost + (i * costPerKey);
		salesTax = salesTax *  cost;
		System.out.print("Keychains cost $" + price + " each.\n");
		System.out.print("Total cost is $" +  (cost + salesTax) + ".\n");
		
		//return cost + salesTax;
		}
		
	static int remove_keychains(int i){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("You have " + i + " keychains. How many to remove ? ");	
		int remove = scanner.nextInt();
		i = i - remove;
		System.out.print("You now have " + i + " keychains.");	
		
		
		return i;
		}
	
	static void checkout(int i, int price, double salesTax, int shippingCost, int costPerKey) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name ? ");
		String name = scanner.next();
		System.out.print("You have " + i + " keychains.");
		System.out.print("Total cost $" + price + "  each.\n");
		int cost = (i * price) + shippingCost + (i * costPerKey);
		salesTax = salesTax *  cost;
		System.out.print("Total cost is $" + (cost + salesTax) + ".\n");
		System.out.print("Thanks for your order, " + name);
		
		
		}
	
	}
