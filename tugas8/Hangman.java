import java.util.Random;
import java.util.Arrays;

public class Hangman {
	
	public static void main(String[] args) {
		Random rui = new Random();
		int i = rui.nextInt(27);
		int ab = 0;
		char[] arr = {'l', 'e', 'v', 'i', 'a', 't', 'h', 'a', 'n'};
		char[] guess = {'-', '-', '-', '-', '-', '-', '-','-', '-'};
		String misses = "";
		//System.out.print(Arrays.toString(guess));
		while (!(Arrays.equals(arr, guess))) {
		System.out.println("ini adalah" + i);

			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("Word : " + Arrays.toString(guess));
			System.out.println("Misses : " + misses);
			char a = randomChar(i);
			for (int rui1 = 0; rui1 < arr.length; rui1++) {
				if (a == arr[rui1]) {
					guess[rui1] = a;
					
					} else if (rui1 == 7) {
						misses = misses + "" + a;
						
						}

				
				}
			i = rui.nextInt(27);
			ab++;
			if (ab == 100) {
				break;
				}

			
			}
			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("Word : " + Arrays.toString(guess));
			System.out.println("Misses : " + misses);
			System.out.println("tries of " + ab);
			


			
			
		
		
		}
	
	static char randomChar(int i) {
		if (i == 0) return 'a';
		if (i == 1) return 'b';
		if (i == 2) return 'c';
		if (i == 3) return 'd';
		if (i == 4) return 'e';
		if (i == 5) return 'f';
		if (i == 6) return 'g';
		if (i == 7) return 'h';
		if (i == 8) return 'i';
		if (i == 9) return 'j';
		if (i == 10) return 'k';
		if (i == 11) return 'l';
		if (i == 12) return 'm';
		if (i == 13) return 'n';
		if (i == 14) return 'o';
		if (i == 15) return 'p';
		if (i == 16) return 'q';
		if (i == 17) return 'r';
		if (i == 18) return 's';
		if (i == 19) return 'u';	
		if (i == 21) return 'v';
		if (i == 22) return 'w';
		if (i == 23) return 'x';
		if (i == 24) return 'y';
		if (i == 25) return 'z';
		if (i == 26) return 't';


		return 't';
}
	
	}
