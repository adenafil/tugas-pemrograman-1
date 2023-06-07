import java.util.Scanner;

public class CountingMachineRevisited {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Count from: ");
		int i = scanner.nextInt();
		System.out.print("Count to : ");
		int n = scanner.nextInt();
		System.out.print("Count by : ");
		int j = scanner.nextInt();
		
		for (int y = i ; i <= n; i = i + j) {
			System.out.print(i + " ");
			
			}
		
		}
	
	}
