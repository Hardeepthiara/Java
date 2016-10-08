class factorial
{
	public static void main(String ar[])
	{
		int i,i1,t=1,n,t1=1;

		n=5;

		i=n;
		i1=n;
		while(i>=1)
		{
			System.out.print(i+" * "+t);
			t=t*i;
			
			System.out.print(" = "+t);
	 		System.out.println();
			i--;
					
		}
		 System.out.print("\n\n");	
		while(i1>=1)
		{
			
			t1=t1*i1;
			
			System.out.print(i1+" * ");
			
			i1--;
					
		}
		System.out.print(" \b\b\b= "+t1);
		System.out.print("\n\n");
	}
}