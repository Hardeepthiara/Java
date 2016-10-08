class printStar3
{
	public static void main(String ar[])
	{
		int i,j,k;
		System.out.println("\n");
		for(i=5; i>=1; i--)
		{
			j=0;
			for(j=i; j<=5; j++)
			{
				
				System.out.print("  ");
				
				
			}
			for(k=j; k<=5; k++)
			{
				
				System.out.print(" * ");
				
			}
			
			System.out.println("\n");
		}
		/*for(i=5; i>=1; i--)
		{
			for(j=1; j<=i; j++)
			{
				
				System.out.print(" * ");
				
			}
			System.out.println("\n");
		}
		*/
	}

}