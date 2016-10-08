import java.util.*;
class test
{
	int a;
	int b;
	
	public void getdata()
	{
		a=5;
		b=66;
	}
	public void getdata(int x, int y)
	{
		a=x;
		b=y;
	}
	public int sum()
	{
		int c;
		c=a+b;
		System.out.println(c);
		return(c);
	}
	public int sum(int a1,int b1)
	{
		int c;
		a=a1;
		b=b1;
		c=a+b;
		return(c);
	}
	public void display()
	{
		System.out.println("\n a = "+a);
		System.out.println("\n b = "+b);
	}
}
class testMain
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		
		test ob = new test();
		System.out.print("\n\tEnter first value = ");
		int d1 = s.nextInt();
		System.out.print("\n\tEnter second value = ");
		int d2 = s.nextInt();
		
		
		int t = ob.sum(d1,d2);
		
		ob.display();
		System.out.print("\n Sum = "+t);
	}
}