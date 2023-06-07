import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("(...a game already in progress)\n\n");
		
		//char[][] rui = new char[3][3];		
		char rui[][] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		boolean ayRui = false;
		
		for (int i = 0; i < 9; i++) {
			
			boolean a = (rui[0][0] == '0' && rui[1][1] == '0' && rui[2][2] == '0') || (rui[0][0] == 'X' && rui[1][1] == 'X' && rui[2][2] == 'X') ;
			boolean b = (rui[0][0] == 'X'  && rui[1][0] == 'X' && rui[2][0] == 'X') ||(rui[0][0] == '0'  && rui[1][0] == '0' && rui[2][0] == '0');
			boolean c = (rui[0][1] == 'X' && rui[1][1] == 'X' && rui[2][1] == 'X') || (rui[0][1] == '0' && rui[1][1] == '0' && rui[2][1] == '0');
			boolean d = (rui[0][2] == 'X' && rui[1][2] == 'X' && rui[2][2] == 'X') || (rui[0][2] == '0' && rui[1][2] == '0' && rui[2][2] == '0');
			boolean e = (rui[0][0] == 'X' && rui[0][1] == 'X' && rui[0][2] == 'X') || (rui[0][0] == '0' && rui[0][1] == '0' && rui[0][2] == '0');
			boolean f = (rui[1][0] == 'X' && rui[1][1] == 'X' && rui[1][2] == 'X') || (rui[1][0] == '0' && rui[1][1] == '0' && rui[1][2] == '0');
			boolean g = (rui[2][0] == 'X' && rui[2][1] == 'X' && rui[2][2] == 'X') || (rui[2][0] == '0' && rui[2][1] == '0' && rui[2][2] == '0');
			boolean h = (rui[0][2] == 'X' && rui[1][1] == 'X' && rui[2][0] == 'X') || (rui[0][2] == '0' && rui[1][1] == '0' && rui[2][0] == '0');


			
			if (i % 2 == 0) {
				System.out.print("\n'O', choose your location (row, column): ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			// masih salah
			while (!(x <= 2 || x <= 2)) {
				System.out.print("please input correctly");
				 x = scanner.nextInt();
				y = scanner.nextInt();
				
				}
			rui[x][y] = '0';
				} else {
				System.out.print("\n'X', choose your location (row, column): ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			// masih salah
			while (!(x <= 2 || x <= 2)) {
				System.out.print("please input correctly");
				 x = scanner.nextInt();
				y = scanner.nextInt();
				
				}
			rui[x][y] = 'X';
				
					}
			
			System.out.println("\t" + rui[0][0] + " " + rui[0][1] + " " + rui[0][2] );
			System.out.println("\t" + rui[1][0] + " " + rui[1][1] + " " + rui[1][2] );
			System.out.println("\t" + rui[2][0] + " " + rui[2][1] + " " + rui[2][2] );
			
			if (a == true || b == true || c == true || d == true || e == true || f == true || g == true || h == true) {
				 System.out.println("The game is finished"); 
				 ayRui = true;
				 break;
			 }
		
			
			
			}
			
			if (ayRui == false) System.out.print("The game is tie"); 
			

			
			
			
			
				
			
		
		}
	
	
	}
