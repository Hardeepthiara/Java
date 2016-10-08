class printStar1
{
	public static void main(String ar[])
	{
		int i,j;
		System.out.println("\n");
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(i==j)
				{
					System.out.print(" @ ");
				}
				else
				{
				
					System.out.print(" * ");
				}
			}
			System.out.println("\n");
		}

	}

}