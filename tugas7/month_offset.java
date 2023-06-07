public class MonthOffset
{
	public static int month_offset( int i )
	{
		if (i == 1 || i == 10) return  1;
		if (i == 2 || i == 3 || i  == 11) return  4;
		if (i == 4 || i == 7) return  0;
		if (i == 5) return  2;
		if (i == 6) return  5;
		if (i == 8) return  3;
		if (i == 9 || i == 12) return  6;
		
		return -1;
	}


	public static void main( String[] args )
	{
		System.out.println( "Offset for month 1: " + month_offset(1) );
		System.out.println( "Offset for month 2: " + month_offset(2) );
		System.out.println( "Offset for month 3: " + month_offset(3) );
		System.out.println( "Offset for month 4: " + month_offset(4) );
		System.out.println( "Offset for month 5: " + month_offset(5) );
		System.out.println( "Offset for month 6: " + month_offset(6) );
		System.out.println( "Offset for month 7: " + month_offset(7) );
		System.out.println( "Offset for month 8: " + month_offset(8) );
		System.out.println( "Offset for month 9: " + month_offset(9) );
		System.out.println( "Offset for month 10: " + month_offset(10) );
		System.out.println( "Offset for month 11: " + month_offset(11) );
		System.out.println( "Offset for month 12: " + month_offset(12) );
		System.out.println( "Offset for month 43: " + month_offset(43) );
	}


}
