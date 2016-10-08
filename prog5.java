class prog5
{
	public static void main(String ar[])
	{
		int i,sum;
		i=2;
		sum=0;
		
		while(i<=12)
		{
			System.out.print(i+"+");
			sum=sum+i;
			i=i+2;
		
		}
		
		System.out.print("\b="+sum);
	}
}	