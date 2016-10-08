import java.io.*;
class info
{
	String nm,roll,br;
	
	info()throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		
		System.out.print("\n\t Enter the name = ");
		nm = in.readLine();

		System.out.print("\n\t Enter the roll no. = ");
		roll = in.readLine();

		System.out.print("\n\t Enter the branch =" );
		br = in.readLine();
	}
	
	void display()
	{
		System.out.println("\n\t Name\t\t: "+nm );
		System.out.println("\n\t Roll no.\t: "+roll);
		System.out.println("\n\t Branch\t\t: "+br);
			
	}
}
	
class marks
{
	int m,acc,j;
	marks()throws IOException
	{
	
		DataInputStream in = new DataInputStream(System.in);
	
		System.out.print("\n\t Enter the marks in Maths = ");
		m = Integer.parseInt(in.readLine());
		System.out.print("\n\t Enter the marks in Account = ");
		acc = Integer.parseInt(in.readLine());

		System.out.print("\n\t Enter the  marks in java =");
		j = Integer.parseInt(in.readLine());
	
	}
	
	void display()
	{
		System.out.println("\n\t\t\t Getting marks ");
		System.out.println("\n\t In Math\t : "+m);
		System.out.println("\n\t In Account\t : "+acc);
		System.out.println("\n\t In Java\t : "+j);
	}	
		
	

}

class studentData
{
	public static void main(String r[])throws IOException
	{
	
		info ob = new info();
		marks ob1= new marks();
		ob.display();
	
		ob1.display();
	}
}
	
	