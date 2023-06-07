import java.util.Scanner;

public class ModulusAnimation {
	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukan nama anda: ");
		String name = scanner.next();
		
		System.out.print("\nchoose the style bellow:  \n\t1) without dot\n\t2) use dot\n\n>ls");
		int answer = scanner.nextInt();
		
		if (answer == 1) {
			module1(name);
			} else if (answer == 2 ) {
				module2(name);
				}
		
		}
		
		public static void module1 (String name)throws Exception {
			for ( int i=0; i<80; i++ )
		{
            if ( i%16 == 0 )
				System.out.print(" " +name+"                 \r");
			else if ( i%16 == 1 )
				System.out.print("   "+name+"               \r");
			else if ( i%16 == 2 )
				System.out.print("     "+name+"             \r");
			else if ( i%16 == 3 )
				System.out.print("       "+name+"           \r");
			else if ( i%16 == 4 )
				System.out.print("         "+name+"         \r");
			else if ( i%16 == 5 )
				System.out.print("           "+name+"       \r");
			else if ( i%16 == 6 )
				System.out.print("             "+name+"     \r");
			else if ( i%16 == 7 )
				System.out.print("               "+name+"   \r");
			else if ( i%16 == 8 )
				System.out.print("                 "+name+" \r");
			else if ( i%16 == 9 )
				System.out.print("               "+name+"   \r");
			else if ( i%16 == 10 )
				System.out.print("             "+name+"     \r");
			else if ( i%16 == 11 )
				System.out.print("           "+name+"      \r");
			else if ( i%16 == 12 )
				System.out.print("         "+name+"         \r");
			else if ( i%16 == 13 )
				System.out.print("       "+name+"           \r");
			else if ( i%16 == 14 )
				System.out.print("     "+name+"             \r");
			else if ( i%16 == 15 )
				System.out.print("   "+name+"               \r");


			Thread.sleep(200);
			}

		

		}
		
			public static void module2 (String name)throws Exception {
			for ( int i=0; i<80; i++ )
		{
            if ( i%16 == 0 )
				System.out.print(".."+name+".................\r");
			else if ( i%16 == 1 )
				System.out.print("...."+name+"...............\r");
			else if ( i%16 == 2 )
				System.out.print("....."+name+"..............\r");
			else if ( i%16 == 3 )
				System.out.print("......"+name+".............\r");
			else if ( i%16 == 4 )
				System.out.print("........"+name+"...........\r");
			else if ( i%16 == 5 )
				System.out.print(".........."+name+".........\r");
			else if ( i%16 == 6 )
				System.out.print("............"+name+".......\r");
			else if ( i%16 == 7 )
				System.out.print(".............."+name+".....\r");
			else if ( i%16 == 8 )
				System.out.print("................."+name+"..\r");
			else if ( i%16 == 9 )
				System.out.print("..............."+name+"....\r");
			else if ( i%16 == 10 )
				System.out.print("............."+name+"......\r");
			else if ( i%16 == 11 )
				System.out.print("..........."+name+"........\r");
			else if ( i%16 == 12 )
				System.out.print("........."+name+"..........\r");
			else if ( i%16 == 13 )
				System.out.print("......."+name+"............\r");
			else if ( i%16 == 14 )
				System.out.print("....."+name+"..............\r");
			else if ( i%16 == 15 )
				System.out.print("..."+name+"................\r");


			Thread.sleep(200);
			}
		}
	}
