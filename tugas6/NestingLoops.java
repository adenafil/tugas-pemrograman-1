public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++ )

		{
			for ( char c='A'; c <= 'E'; c++ )

			{
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );
			}
			// * You will add a line of code here.
			System.out.println();
		}

		System.out.println("\n");

	}
}


/*
1. n / inner loop could be more fast than outter loop , this happend because the inner loop will be excecuted till the end then the outter loop . but yeah the outter loop will get excecuted but it be more longer than inner loop. 
2. A 1
B 1
C 1
D 1
E 1
A 2
B 2
C 2
D 2
E 2
A 3
B 3
C 3
D 3
E 3
3. 1-1
1-2
1-3
2-1
2-2
2-3
3-1
3-2
3-3
4. 1-1 1-2 1-3
2-1 2-2 2-3
3-1 3-2 3-3

*/
