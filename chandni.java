/*
	WAP find the number between 0 to 100 which are divisible by 3 and 7.
*/

class chandni
{
	public static void main(String r[])
	{
		int i=1;
		/*
		while(i<=100)
		{
			if(i%3==0)
			{
				if(i%7==0)
				{
					System.out.println(i);
				}
			
			}
		   i++;
		}
		*/
		System.out.println("\n\n");
		while(i<=100)
		{
			if((i%3==0)&&(i%7==0))
			{
				System.out.print(i+", ");
			}
			
			
		   	i++;
		}
		//System.out.println("\b\b");
		System.out.println("\n\n");
	}
}