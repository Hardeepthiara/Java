class first
{
	int a,b;
	void getdata( int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("\n\tA = "+a);
		System.out.println("\n\tB = "+b);
	}	
}
class second extends first
{
	int x,y;
	
	void input(int x, int y, int a, int b)
	{
		super.getdata(a,b);
		this.x=x;
		this.y=y;
	}
	void output()
	{
		
		System.out.println("\n\tX = "+x);
		System.out.println("\n\tY = "+y);
		super.display();
	}

}
class firstSecondInherit1
{
	public static void main(String arg[])
	{
		second ob = new second();
		ob.input(1,2,3,4);
		ob.output();
	}
}