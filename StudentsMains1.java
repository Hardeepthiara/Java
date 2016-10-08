import java.io.*;
import java.lang.*;

class Student
{
	int roll;
	String nm;

	void getdata()throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);

		System.out.print("\n\tEnter student name = ");
		nm=in.readLine();
		
		System.out.print("\n\tEnter student roll no = ");
		roll=Integer.parseInt(in.readLine());
		
	}
	void display()
	{
		System.out.println("\n\n\tName\t: "+nm);
		System.out.println("\n\tRoll No\t: "+roll);
	}

}
class StudentsMains1
{
	public static void main(String ar[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		int i;
		Student[] s1= new Student[3];
		
		try{
			for(i=0; i<=3; i++)
			{
				s1[i]=new Student();
				s1[i].getdata();
				System.out.println("\n\tEntered record number = "+(i+1));
				System.out.print("\n________________________________________________\n");
			
			}
		}catch(Exception e)
			{	
				System.out.println("\n\t!!!!!!!!! warning\n\n");
			}

		for(i=0; i<=3; i++)
		{
			s1[i].display();
			System.out.print("\n_________________________________________________\n");
			
		}
		
	}
}


