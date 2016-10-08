class SumSeries
{
	public static void main(String r[])
	{
		int i=0,sum=0;

		while(i<5)
		{
			sum+=i;
			System.out.print(i+" + ");
			i++;
		}
		System.out.println("\b\b = "+sum);
		while(i<5)
		{
			System.out.println(i+" +");
			i++;
			if(i==5)
			{
				System.out.println("\b\b = "+sum);
			}
		}
	}

}