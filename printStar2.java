class printStar2
{
	public static void main(String ar[])
	{
		int i,j;
		System.out.println("\n");
		for(i=1; i<=5; i++)
		{
			for(j=i; j>=1; j--)
			{
				
				System.out.print(" * ");
				
			}
			System.out.println("\n");
		}
		for(i=5; i>=1; i--)
		{
			for(j=1; j<=i; j++)
			{
				
				System.out.print(" * ");
				
			}
			System.out.println("\n");
		}

	}

}