class typeCaste
{
	public static void main(String ar[])
	{
		int a,b;
		float c;
		
		a=10;
		b=3;
		// without type caste expression
		c=a/b; implicit type caste

		System.out.println("\n\n a = "+a);
		System.out.println("\n\n b = "+b);
		System.out.println("\n\n a/b = "+c);
		
		c=(float)a/b; // type caste   explicit type caste
		System.out.println("\n\n a/b = "+c);

	}

}