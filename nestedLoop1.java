class nestedLoop1
{
	public static void main(String ar[])
	{
		int i,j;
		int a=1;
		System.out.println("\n\n");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				
				System.out.print("\n\n[i="+i+"][j="+j+"] = "+a);
				a=a+1;
			}
			//System.out.println("\n");
		}
		System.out.println("\n\n");
	}
}