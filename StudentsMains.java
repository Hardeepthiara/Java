import java.io.*;

class Student
{
	int roll;
	String nm;

	void getdata(int rl, String nnm)
	{
		roll=rl;
		nm=nnm;
		
	}
	void display()
	{
		System.out.println("\n\n\tName\t: "+nm);
		System.out.println("\n\tRoll No\t: "+roll);
	}

}
class StudentsMains
{
	public static void main(String ar[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		int r;
		String n;

		System.out.print("\n\tEnter student name = ");
		n=in.readLine();
		
		System.out.print("\n\tEnter student roll no = ");
		r=Integer.parseInt(in.readLine());

		Student[] s= new Student[5];
		
		//Student s1= new Student();
		/*s.getdata(r,n);
		s1.getdata(1234,"Rahul");
		s.display();
		s1.display();*/
		try{
		for(int i=1; i<=5; i++)
		{
			s[i]=new Student();
			s[i].getdata(r,n);
			System.out.println("\n\tEntered record number = "+i);
			
		}
		}catch(Exception e){	System.out.println("\n\t!!!!!!!!! warning\n\n");}
		for(int i=1; i<=5; i++)
		{
			s[i].display();
			
		}
		

	}
}


