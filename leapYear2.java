class leapYear2
{
	public static void main(String r[])
	{
		int leap_year;
	                leap_year=2018;
		if(leap_year%100==0)	
		{
	 		if(leap_year%400==0)
			{
				System.out.println("\n\nIts a leap year");
			}
			
			else
			{
				System.out.println("\n\nIts not a leap year");
			}
		}
		else
		{
			if(leap_year%4==0)
			{
				System.out.println("\n\n\tIts a leap year");
			}
			else
			{
				System.out.println("\n\n\tIts not aleap year");
			}
		}
	}	
}