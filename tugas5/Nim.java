import java.util.Scanner;
import java.util.Random;

public class Nim{
	
	

	
	
	public static void main(String[] args) {
		// global variabel of this game
		String player1, player2;
		//player1 = "";
		int i = 0, pile;
		String ans, winner, loser, stuntman;
		String[] p= new String[2];
		String val;

		
		int a = 3, b = 4, c = 5;
		int max = findMax(a, b, c);
		
		//instance

		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		
		// make random name of bot
		String[] botName = {"Abimelech", "Abagtha", "Abram", "Ahaziah", "Ahisamach",
			"Ahmik", "Amos", "Ahsger", "Ardath", "Avram", "Benjamin", "Beryl", "Brighton",
			"Barnabas", "Boaz"
			};
		int nameRandom = r.nextInt(botName.length);
		//S//ystem.out.println(nameRandom);
		String bot = botName[nameRandom];
		
		
		
		// make a random start
		System.out.println("cek who will be first player\n");
		Random ep = new Random();
		int start = ep.nextInt(2);
		//System.out.print(start);
		if (start == 0) {

			
			System.out.print("Player 1, enter your name: ");
			player1 = scanner.next();
			player2 = bot;
			System.out.println("Player 2 name is " + player2);						
			System.out.println("\n\nCongrats, Human play first");	
			//player2 = scanner.next();

			} else {
			System.out.print("Player 1, enter your name: ");
			player1 = scanner.next();
			player2 = bot;
			System.out.print("\nPlayer 2 name is " + player2);						
			System.out.println("\nCongrats, Bot play first");	
				
				
				}
				
			if (start == 0) {
			p[0] = player1;
			p[1] = player2;
			val = "human";
			} else {
				p[0] = player2;
				p[1] = player1;
				val = "bot";
				
				}
			
			//System.out.println(p[0]);
			
		


		

		

		int random = r.nextInt(findMax(a, b, c));
		//System.out.println(random);
		

		
		data(a, b, c);
			
			
		
		

			// checker permutation of bot and human being
			
		
		while (!(a == 0 && b == 0 && c == 0)) {
			
			
			
			
			if (i == 0) {
												i++;

				System.out.print("\n" + p[0] + ", choose a pile: ");

				if (val.equals("bot")) {
					ans = generatorAlphabet(a, b, c);
					System.out.print("bot have chose " + ans + " pile.\n");
					val = "bot";
					} else {ans = scanner.next();
						
						}
				
				// cheat protection
				while ( (ans.equals("A") && a == 0) || (ans.equals("B") && b == 0) || (ans.equals("C") && c == 0) ) {
					System.out.print("\nNice try, " + p[0] + ". That pile is empty. Choose again: ");
					ans = scanner.next();
					} 
				// cheat protection			
				
				System.out.print("How many to remove pile " + ans + ": ");
				if (val.equals("bot")) {
					pile = generatorAnswer(ans, max, a, b, c);
					System.out.println("bot choose pile as much as " + pile);
					val = "human";
					
					} else { val = "bot";
				pile = scanner.nextInt(); }
				
				//cheat protection
				while (pile == 0) {
					System.out.print("\nYou must choose at least 1. How many ?");
					pile = scanner.nextInt();
					}
				while ( (pile > a && ans.equals("A") ) || ( pile > b && ans.equals("B") )||( pile > c && ans.equals("C")) ) {
				System.out.print("Pile " +ans+ " doesn't have that many. Try Again: ");
				pile = scanner.nextInt();
					
					}
				while ( (pile < 0 && ans.equals("A") ) || ( pile < 0 && ans.equals("B") )||( pile < 0 && ans.equals("C")) ) {
				System.out.print("Pile " +ans+ " doesn't have that many. Try Again: ");
				pile = scanner.nextInt();
					
					}
					
				//cheat protection
				
				// the calculatiom
				if (ans.equals("A")) {
				a = a - pile;
				
				} else if (ans.equals("B")) {
					b = b - pile;
					
					} else if (ans.equals("C")) {
						c = c - pile;
						
						} else {
							//nothing;
							
							}
							//i++;

				} else if (i == 1) {
				i--;
				System.out.println("\n" + p[1] + ", choose a pile:\n");
				if (val.equals("bot")) {
					ans = generatorAlphabet(a, b, c);
					System.out.println("\n" + p[1] + " have chose " + ans + " pile.");
					
					
					} else {ans = scanner.next();}


				
				// cheat protection
				while ( (ans.equals("A") && a == 0) || (ans.equals("B") && b == 0) || (ans.equals("C") && c == 0) ) {
					System.out.print("\nNice try, " + p[1] + ". That pile is empty. Choose again: ");
					ans = scanner.next();
					} 
				// cheat protection			
				
				System.out.print("\nHow many to remove pile " + ans + ": ");
				if (val.equals("bot")) {
					pile = generatorAnswer(ans, max, a, b, c);
					System.out.println("\nbot choose pile as much as " + pile);
					val = "human";
					} else {
						val = "bot";
				pile = scanner.nextInt(); }
				//cheat protection
				while (pile == 0) {
					System.out.print("\nYou must choose at least 1. How many ?");
					pile = scanner.nextInt();
					}
				while ( (pile > a && ans.equals("A") ) || ( pile > b && ans.equals("B") )||( pile > c && ans.equals("C")) ) {
					System.out.print("Pile " +ans+ " doesn't have that many. Try Again: ");
					pile = scanner.nextInt();
					
					}
				while ( (pile < 0 && ans.equals("A") ) || ( pile < 0 && ans.equals("B") )||( pile < 0 && ans.equals("C")) ) {
				System.out.print("You must choose at least 1. How many? ");
				pile = scanner.nextInt();
					
					}
					
				//cheat protection

			//	the calculations
				if (ans.equals("A")) {
				a = a - pile;
				
				} else if (ans.equals("B")) {
					b = b - pile;
					
					} else if (ans.equals("C")) {
						c = c - pile;
						
						} else {
							//nothing;
							
							}
					
					
				} else {
						
						
						}
						/*
						
			if (val.equals("human")) {
				System.out.println("choose the display:\nA.Fancy display\nB.SO-so display\nAnswer : ");
				int ansbot = r.nextInt(2);
				if (ansbot == 0) {
					System.out.println("bot chose fancy diplay");
					printFancy(a, b, c, max);
					
					} else {
						System.out.println("bot chose so-so display");
						data(a, b, c);
						}
				
				} else if (val.equals("bot")) {
					
					
				//	data(a, b, c);
			//printFancy(a, b, c, max);
					System.out.println("choose the display:\nA.Fancy display\nB.SO-so display\nAnswer : ");
					String ansHuman = scanner.next();
					if (ansHuman.equals("A")) {
					System.out.println("humsn chose fancy diplay");
					printFancy(a, b, c, max);
					
					} else {
						System.out.println("human chose so-so display");
						data(a, b, c);
						}
					}
			*/
			
				
			//if (val.equals("human")) {
				//		chooseDisplay(a, b, c, "bot", max);
				
				//} else {
					//		chooseDisplay(a, b, c, "human", max);
				//	}
						

				printFancy(a, b, c, max);
				
				if ( (a == 0 && b == 0 && c != 0)  || (a != 0 && b == 0 && c == 0) || (a == 0 && b != 0 && c == 0)  ) {
					if (i == 0) {
						winner = p[i+1];
						loser = p[i];
						System.out.print("\n"+ loser + ", you must take the last remaining counter, so\nyou lose. " + winner + " wins");
						break;
						} else {
						winner = p[i];
						loser = p[i-1];	
						System.out.print("\n" + loser + ", you must take the last remaining counter, so\nyou lose. " + winner + " wins");
						break;
							}

					
					}
			
			}
			
			
	
			
	}	
	

//benar
	
	public static void bintang(int x) {
		while (0 < x) {
			System.out.print("*");
			x--;
			}
		
		
		}
		
		// benar
		
	public static void data(int a, int b, int c) {

		System.out.print("A = ");
		bintang(a);
		System.out.print("\nB = ");
		bintang(b);
		System.out.print("\nC = ");
		bintang(c);
		System.out.println();
		
		}
		
		// benar
		
		public static int findMax(int a, int b, int c) {
			int max = Math.max(Math.max(a,b),c);
			
			return max;
			
			}
			
			// benar
		
			public static String[] arrayMaker(int x, int max) {
						
			int empty = max - x; //misal 6 max dan bintang ada 4.
								//maka 6 - 4 = 2 // maka empty ada 2
			int bintang = max - empty; // 6 - 2 = 4 // maka ada 4 bintang
			String[] arr = new String[max];
							//System.out.println("a = " + empty + "b = " + bintang);
							

							
			for (int i = 0; i < max; i++) {
			  if (max == 1) {
            arr[i] = "*";
			  } else if (max < 6) {
			    if (i < empty) {
			      arr[i] = " ";
			      
			      
			    }
			    if (i < max && i >= empty) {
			      arr[i] = "*";
			      
			      
			    }
			    
			    
			  }
				
				}
			
					
					return arr;
				

			}
			
			public static void fancyDisplay(int a, int b, int c, int valMax, String[] binA, String[] binB, String[] binC, int max) {
		//	int max = findMax(a, b, c);
			for (int x = 0; x < max; x++) {
 			System.out.println("\t" + binA[x] + " " + binB[x] + " " + binC[x]);
 			

			
			}
			System.out.println("\tA B C");
			


			}
			
			
		public static void printFancy(int a, int b, int c,int max) {
		
		String[] binA, binB, binC;
		
		if (a != 0) {
					binA = arrayMaker(a, max); 
			} else {
				
						binA = arrayMaker(a, max); 
				}
		
		if (b != 0) {
					 binB = arrayMaker(b, max); 
			} else {
				
						 binB = arrayMaker(b, max); 
				}
				
		if (c != 0) {
					binC = arrayMaker(c, max); 
			} else {
				
						binC = arrayMaker(c, max); 
				}		
				
				
				
				
		//String[] binA = arrayMaker(a, max); 
		//String[] binB = arrayMaker(b, max); 
		//String[] binC = arrayMaker(c, max); 
		
		fancyDisplay(a, b, c, max, binA, binB, binC, max);
		}	
		
		public static int bot () {
		Random r = new Random();
		int n = r.nextInt(2);

		return n;		


		}
		
		public static void chooseDisplay(int a, int b, int c, String val, int max) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nchoose the display (a/b) : \na. fancy display\nb. so-so display\nYour answer is = ");
		int bot = bot();
		System.out.println();
	//	int max = findMax(a, b, c);
		//if (a == max) {a = a - 1;};
			//	if (b == max) {b = b - 1;}; 
				//	if (c == max) {c = c - 1;};  
		
		if (val.equals("bot")) {
			if (bot == 0) {
				System.out.println("\nBot have chosen a");
				printFancy(a, b, c, max); 
				
				} else if (bot == 1) {
				System.out.println("\nBot have chosen b");
				data(a, b, c); 
					
					}
			} else {
		
		String ans = scanner.next();
		System.out.println();
		if (ans.equals("a")) printFancy(a, b, c, max); 
		if (ans.equals("b")) data(a, b, c);
		}
		

		
		}
		
		public static int generatorAnswer(String ans, int max, int a, int b, int c) {
		//int max = findMax(a, b, c);
		Random r = new Random();
		int random = r.nextInt(max);
		int chooseAlphabet = r.nextInt(3);
		
		int aA;
		int bB;
		int cC;
		


		 
		if (chooseAlphabet == 0 && a != 0 && ans.equals("A")) {
		aA = r.nextInt(a);
		a = a - aA;
		/*if (a == max) {
			return a - 1;
			
			}*/
		return a;

		} else if (chooseAlphabet == 1 && b != 0 && ans.equals("B")) {
		bB = r.nextInt(b);
		b = b - bB;
		/*if (b == max) {
			return b - 1;
			
			}*/
		return b;

		} else if (chooseAlphabet == 2 && c != 0 && ans.equals("C")) {
		cC = r.nextInt(c);
		c = c - cC;
		/*if (c == max) {
			return c - 1;
			}*/
		return c;
		}
	



		return generatorAnswer(ans, max, a, b, c);
		}
		
		public static String generatorAlphabet(int a, int b, int c) {
		Random r = new Random();
		int random = r.nextInt(3);
		if (random == 0 && a != 0) {
		return "A";

			}
		if (random == 1 && b != 0) {
		return "B";

			}
		if (random == 2 && c != 0) {
		return "C";

			}
		return generatorAlphabet(a, b, c);
		}

			
		
	
	}
