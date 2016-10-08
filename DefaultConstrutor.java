import java.io.*;
import java.lang.*;

class Student
{
	int roll;
	String nm;

	Student(int r, String n)
	{
		roll=r;
		nm=n;
		
	}
	void display()
	{
		System.out.println("\n\n\tName\t: "+nm);
		System.out.println("\n\tRoll No\t: "+roll);
	}

}
class DefaultConstrutor
{
	public static void main(String ar[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		
		Student s = new Student(123,"Chandni Rasotra");  // object create
		s.display();
	}
}
