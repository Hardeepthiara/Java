class FunctionOverload
{
	int a,b,c;

	FunctionOverload(int a,int b)
	{
		this.a=a;
		this.b=b;		
	}
	void sum()
	{
		//int c;
		c=a+b;
		System.out.println("\nA = "+a);
		System.out.println("\nB = "+b);
		System.out.println("\nSum1 = "+c);
	}
	void sum(int a1,int b1)
	{
		a=a1;
		b=b1;
		int c1;
		c1=a+b;
		System.out.println("\nA = "+a);
		System.out.println("\nB = "+b);
		System.out.println("\nSum2 = "+c1 );
		
	}
	void display()
	{
		System.out.println("\nA = "+a);
		System.out.println("\nB = "+b);
	}

}

class FunctionOverloadFinal
{
	public static void main(String ar[])
	{
		FunctionOverload ob = new FunctionOverload(5,6);
		//ob.display();
		ob.sum();
		ob.sum(4,6);
		ob.sum(77,5);
		
	}
}