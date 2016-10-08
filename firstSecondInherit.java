class first
{
	int a,b;
	void getdata()
	{
		a=10;
		b=20;
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
	
	void input()
	{
		super.getdata();
		x=4;
		y=6;
	}
	void output()
	{
		super.display();
		System.out.println("\n\tX = "+x);
		System.out.println("\n\tY = "+y);
	}

}
class firstSecondInherit
{
	public static void main(String arg[])
	{
		second ob = new second();
		ob.input();
		ob.output();
	}
}