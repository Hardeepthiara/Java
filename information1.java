import java.io.*;

class personalinfo
{
	String nm, add,bir;
	long ac;
	char g;

	void get() throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		try{
		System.out.print("\n\t enter the name = ");
		nm=in.readLine();

		System.out.print("\n\t enter the address = ");
		add=in.readLine();

		System.out.print("\n\t enter the d.o.b  = ");
		bir=in.readLine();
	
		System.out.print("\n\t enter the acc no. = ");
		ac=Long.parseLong(in.readLine());

		System.out.print("\n\t enter the gender = ");
		g=(char)in.read();
		}catch(Exception e){  System.out.println("\n\n!!!!!!    worng value     !!!!!!\n\n");  }	
	}
	
	void display()
	{
		System.out.println("\n\tNAME\t : "+nm);
		System.out.println("\n\tD O B\t : "+bir);
		System.out.println("\n\tADD\t : "+add);
		System.out.println("\n\tA/C\t : "+ac);
		System.out.println("\n\tGEN\t : "+g);
	}
}
class information1
{
	public static void main(String r[])throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		personalinfo ob = new personalinfo();
			ob.get();
			ob.display();	
	}
}