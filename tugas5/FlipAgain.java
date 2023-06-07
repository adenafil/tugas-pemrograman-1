import java.util.Scanner;
import java.util.Random;

public class FlipAgain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 Random r = new Random();
		 String ans = "";

		 String coin = "";
		 do {
			 int number = r.nextInt(2);
			 System.out.println(number);

			 if (number == 1) {
				 coin = "TAILS";
				 } else {
					 coin = "HEADS";
					 }
					 
			 System.out.print("You flip a coin and it is... " + coin);
			 System.out.print("\nWould you like to flip again (y/n)? ");
		 ans = scanner.nextLine();
		 
			 
			 }while(ans.equals("y"));
		 
		}
	}
	
