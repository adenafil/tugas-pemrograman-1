public class MonthName
{
	public static String month_name( int i ) {
		
		if ( i == 1) return "January";
		if ( i == 2) return "February";
		if ( i == 3) return "March";
		if ( i == 4) return "April";
		if ( i == 5) return "May";
		if ( i == 6) return "Juny";
		if ( i == 7) return "July";
		if ( i == 8) return "August";
		if ( i == 9) return "September";
		if ( i == 10) return "October";
		if ( i == 11) return "November";
		if ( i == 12) return "December";
		
		return "404";
		
		
	}


	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );
	}
}
