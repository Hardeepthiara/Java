class prog6
{
	public static void main(String ar[])
	{
		int i,sum,x=2;
		i=1;
		sum=0;
		
		System.out.println("\n");
		System.out.println("\nX = "+x+"\n\n");
		while(i<=4)
		{
			System.out.print("( x "+" + "+i+")"+ " + ");
			sum=sum+i+x;
			i++;
		
		}
		
		System.out.print("\b\b= "+sum);
		System.out.println("\n");
	}
}