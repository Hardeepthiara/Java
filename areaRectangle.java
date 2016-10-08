// calling constructor from to constructor with using this operator
// this operator is using in two ways;
// 1. using with attribute of data_types : Attributes means varibale of the data_types
// 2. using in constructor as this() function

class rectangle
{
	int a,b,c; // a and b are attributes of the rectangle class
	
	rectangle()
	{
		//a=0;
		//b=0;
		c=100;
	}
	
	rectangle(int a, int b)
	{
		this(); // calling default constructor attributes
		this.a=a; 	// using this operator with attribute or varibale
		this.b=b;
	}
	rectangle(int a, int b, int r)
	{
		this(a,b); // using this()function
		c=r;
	}
	
	rectangle(rectangle objt) // this is copy constructor where ahsish is object varibale of rectangle class
	{
		a = objt.a;
		b = objt.b;
	}
	void display()
	{
		System.out.println("\n\n\t a = "+a);
		System.out.println("\n\n\t b = "+b);
		System.out.println("\n\n\t c = "+c);
		
	}
}


class areaRectangle
{
	public static void main(String arg[])
	{
		rectangle ob = new rectangle(56,7);
		ob.display();
		System.out.println("\n\n copy constructor calling \n\n");
		rectangle ob1 = new rectangle(ob);
		ob1.display();
	}
}
