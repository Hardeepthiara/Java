class baseA
{
	int i;

}
class baseB extends baseA
{
	int i,s;

	baseB(int a, int b)	// constructor
	{
		super.i=a;
		i=b;
	}
	void sum()
	{
		s=i+(super.i);
	}
			
	void display()
	{
		System.out.println("\n\n\t BaseA = "+super.i);
		System.out.println("\n\n\t BaseB = "+i);
		System.out.println("\n\n\t Sum   = "+s);
	}
	
}
class baseABInherit
{
	public static void main(String arg[])
	{
		baseB ob = new baseB(10,20);
		ob.sum();
		ob.display();
	}
}