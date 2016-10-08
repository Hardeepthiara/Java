import java.util.*;
class basicInfostu
{
	private String name;
	private char gen;
	private int roll;
	private String branch;
	Date birth;
	
	Scanner s = new Scanner(System.in);
	
	// input of the class variables ......
	public void getdata(String nm,char gn, int rln,String br,int yy,int mm, int dd)
	{
		name=nm;
		gen=gn;
		roll=rln;
		branch=br;
		GregorianCalendar clnd = new GregorianCalendar(yy,mm-1,dd);
		birth=clnd.getTime();
		
	}
	public void input()
	{
		//Scanner s = new Scanner(System.in);
		
		System.out.print("\n\tEnter student name = ");
		name = s.nextLine();
		System.out.print("\n\tEnter student Bracnch = ");
		branch = s.nextLine();
		System.out.print("\n\tEnter student gender = ");
		gen = s.next().charAt(0);
		System.out.print("\n\tEnter student roll number = ");
		roll = s.nextInt();
		
	}
	
	String putName()
	{
		return(name);
	}
	String putBranch()
	{
		return(branch);
	}
	int putRoll()
	{
		return(roll);
	}
	char putGen()
	{
		return(gen);
	}
	public Date getBirth()
	{
		return(birth);
	}
	
	// output of the class variables......
	public void display()
	{
		System.out.println("\n\n\t Name\t\t: "+name);
		System.out.println("\n\t Gender\t\t: "+gen);
		System.out.println("\n\t Roll no\t: "+roll);
		System.out.println("\n\t Bracnch\t: "+branch);
	}
}
class basicInfostuTest
{
	public static void main(String arg[])
	{
		basicInfostu obj = new basicInfostu();  // create a object of the class
		
		obj.getdata("Ashish",'M',12345,"BCA",1995,3,7);
		/*
		obj.name="Sam";
		obj.gen='m';
		obj.roll=2358;
		obj.branch="mca";
		*/
		//obj.input();
		//obj.display();
		
		System.out.println("\n\n\t Student Name\t\t= "+obj.putName());
		System.out.println("\n\t Student Roll number\t= "+obj.putRoll());
		
		//System.out.println("\n\n\n\t Stu Name\t\t= "+obj.getBirth());
		
	}
}