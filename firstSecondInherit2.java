import java.io.*;			
class first
{
	int a,b;
	void getdata()throws IOException
	{
		DataInputStream in= new DataInputStream(System.in);
		
		System.out.print("\n\t Enter the value of a = ");
		a=Integer.parseInt(in.readLine());
		
		System.out.print("\n\t Enter the value of b = " );
		b =Integer.parseInt(in.readLine());

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
	
	void input()throws IOException
	{
		DataInputStream in= new DataInputStream(System.in);
		
		super.getdata();
		System.out.print("\n\t Enter the value of x");
		x = Integer.parseInt(in.readLine());
		
		System.out.print("\n\t Enter the value of y");
		y = Integer.parseInt(in.readLine());
		
	}
	void output()
	{
		
		System.out.println("\n\tX = "+x);
		System.out.println("\n\tY = "+y);
		super.display();
	}

}
class firstSecondInherit2
{
	public static void main(String arg[])throws IOException
	{
		DataInputStream in= new DataInputStream(System.in);
		second ob = new second();
		ob.input();
		ob.output();
	}
}