
// single inheritance 

class StudentInfo
{
	int roll;
	String name;
	int sem;

	StudentInfo(String nm, int rl, int sm)  // consturctor
	{
		roll=rl;
		name=nm;
		sem=sm;
	}

	int disRoll()
	{
		return roll;
	}
	
	String disName()
	{
		return name;
	}
	
	int disSem()
	{
		return sem;
	}
}
/*
	void display()
	{
		System.out.println("\n\t Name\t\t= "+name);
		System.out.println("\n\t Roll number\t= "+roll);
		System.out.println("\n\t Semster\t= "+sem);

	}

}

class StudentMarks extends StudentInfo		// single Inheritance
{
	int m1;
	int m2;
	float avg;
	int total;

	StudentMarks(int m11, int m21,String nm, int rl, int sm)
	{
		super(nm, rl, sm);		// this super fuction call the base class constructor into the derived class constructor
		m1=m11;
		m2=m21;
	}
	void displayMarks()
	{
		super.display();
		System.out.println("\n\t English\t= "+m1);
		System.out.println("\n\t Math\t\t= "+m2);
		System.out.println("\n\t Total Marks\t= "+total);
		System.out.println("\n\t Average\t= "+avg);
		
	}
	void avgMarks()
	{
		total=m1+m2;
		avg=(float)total/2;
			
	}
}*/
class StudentInherit
{
	public static void main(String ar[])
	{
		/*		
		StudentMarks stm= new StudentMarks(45,67,"Hitesh",23486,4);	
				
		stm.avgMarks();
		stm.displayMarks();
		*/

		StudentInfo sti = new StudentInfo("Hitesh",334587,3);
		System.out.println("\n\tName\t\t= "+sti.disName());
		System.out.println("\n\tRoll number\t= "+sti.disRoll());
		System.out.println("\n\tSemster\t\t= "+sti.disSem());	
		
		
	}
}