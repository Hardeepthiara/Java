class reverse1
{
	public static void main(String tt[])
	{
		int i=0,a,r=0,t=0;
		a=5487;
		while(i<4)
		{
			r=a%10;
			a=a/10;
			
			t=(t*10)+r;	
			i++;
		
		}
		System.out.print(t+" ");
		System.out.print("\n\n");
		

	}

}