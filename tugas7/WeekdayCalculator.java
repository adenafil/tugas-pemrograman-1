import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();
		
		String result = weekday(mm, dd, yyyy);

		// put a function call for weekday() here
		System.out.println("You were born on " + result);

	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";

		// bunch of calculations go here
		yy = yyyy - 1900;
		total = yy / 4 + yy + dd + month_offset(mm);
		
		if ((is_leap(yyyy) == true && mm == 1) || (mm == 2 && is_leap(yyyy))) {
			total = total -1;
			
			}
			
		int reminder = total % 7;
		
		

		date = weekday_name(reminder)+ ", " + month_name(mm) + " " + dd + ", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
	
		public static String weekday_name( int weekday )
	{
		String result = "";

		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if ( weekday == 7 || weekday == 0)
		{
			result = "Saturday";
		} else {
			result = "error";
			};
		
		return result;
	}
	
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

		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}
