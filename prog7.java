class prog7
{
	public static void main(String r[])
	{
		int i,x,m;
		
		i=1;
		x=2;
		m=0;
		System.out.println("\n");
		while(i<=4)
		{
			System.out.print("(x + "+i+")"+"*"+"Math.pow(x,"+i+") + " );
			m=m+(int)((x+i)*Math.pow(x,i));
			i++;
		}
		System.out.println("\b\b= "+m);
		System.out.println("\n");
	}
}
			