import java.io.*;
import java.lang.*;


class Student
{
	int roll;
	String nm;

	Student()		//Defualt consturtor
	{
		roll=0;
		nm=null;
		
	}
	Student(int r, String n)  	//With two parameters
	{
		roll=r;
		nm=n;
	}
	Student(String n1)		//with single parameters
	{
		nm=n1;
		roll=1234;
	}
	Student(int n2)		//with single parameters
	{
		nm="Rahul";
		roll=n2;
	}

	void display()
	{
		System.out.println("\n\n\tName\t: "+nm);
		System.out.println("\n\tRoll No\t: "+roll);
	}

}
class ConstrOverLoad
{
	public static void main(String ar[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		
		Student s0 = new Student(6);  // object create
		Student s1 = new Student("Sohal");
		Student s2 = new Student();
		Student s3 = new Student(420,"Rajwinder");
		s0.display();
		s1.display();
		s2.display();
		s3.display();
	}
}
