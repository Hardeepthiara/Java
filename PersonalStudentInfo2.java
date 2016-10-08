import java.io.*;
class Info
{
	String nm,roll,br,batch;
	
		Info()throws IOException
		{
			DataInputStream in = new DataInputStream(System.in);
			System.out.print("\n\tEnter the name");
			nm = in.readLine();

			System.out.print("\n\t enter the roll no");
			roll = in.readLine();
		
			System.out.print("\n\t enter the branch");
			br = in.readLine();
		
			System.out.print("\n\t enter the batch");
			batch = in.readLine();


		}
	
	void display()
	{
		System.out.println("\n\t Name\t="+nm);
		System.out.println("\n\t Roll no.\t="+roll);
		System.out.println("\n\t Branch\t="+br);
		System.out.println("\n\t Batch\t="+batch);
		
	}

}

class sem1 extends Info
{
 	int m,hvpe,it ,s;
	
	sem1()throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		//super.Info();
		
		System.out.print("\n\t enter the marks of math");
		m = Integer.parseInt	(in.readLine());
		
		System.out.print("\n\t enter the marks of human value");
		hvpe = Integer.parseInt(in.readLine());
	
		System.out.print("\n\t enter the marks of info technology");
		it = Integer.parseInt(in.readLine());
	
	}

	void display1()
	{
		super.display();
		System.out.println("\n\t Marks details of sem 1");
		System.out.println("\n\t Math\t="+m);
		System.out.println("\n\t Hvpe\t="+hvpe);
		System.out.println("\n\t IT\t="+it);	
	

	}
	
	void av()
	{
		s =( m+hvpe+it)/3;
		System.out.println("\n\t Average  of sem 1=" +s );

	}
	
	void grade1()
	{
		if((s<100)&&(s>=95))
		{
		  System.out.println("\n\t grade = A+");
		} 
		else if((s<95)&&(s>=90))
		{

			System.out.println("\n\t grade = A");
		}
		else if((s<90)&&(s>=80))
		{
			System.out.println("\n\t grade = B+");
		}
		else if((s<80)&&(s>=70))
		{
			System.out.println("\n\t grade = B ");
		}
		else if ((s<70)&&(s>=60))
		{
			System.out.println("\n\t grade = C+");
		}
		else if((s<60)&&(s>=50))
		{
			System.out.println("\n\t grade = C");
		}
		else if((s<50)&&(s>=40))
		{
			System.out.println("\n\t grade = D+ ");
		}
		else 
		{
			 System.out.println("\n\t FAIL");
		}
	}
		


}

class sem2 extends sem1
{
	int acc , os,java, ss;
	 
	sem2() throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		//super.info();
		//super.sem1();
		System.out.print("\n\t enter the marks of accounts");
		acc = Integer.parseInt(in.readLine());
		
		System.out.print("\n\t enter the marks of operating system");
		os = Integer.parseInt(in.readLine());
		
		System.out.print("\n\t enter the marks of java");
		java = Integer.parseInt(in.readLine());

		
	}
	
	void display2()
	{
	     super.display1();
	  System.out.println("\n\t Accoutns\t="+acc);
	  System.out.println("\n\t Opreating System\t="+os);
	  System.out.println("\n\t Java\t="+java);	
	}
	
	void av1()	
	{
		super.av();	
		ss = (acc+os+java)/3;
		System.out.println("\n\t Average  of sem 2=" +ss );	
	}
	
	void grade()
	{
		super.grade1();
		if((s<100)&&(s>=95))
		{
		  System.out.println("\n\t grade = A+");
		} 
		else if((ss<95)&&(ss>=90))
		{

			System.out.println("\n\t grade = A");
		}
		else if((ss<90)&&(ss>=80))
		{
			System.out.println("\n\t grade = B+");
		}
		else if((ss<80)&&(ss>=70))
		{
			System.out.println("\n\t grade = B ");
		}
		else if ((ss<70)&&(ss>=60))
		{
			System.out.println("\n\t grade = C+");
		}
		else if((ss<60)&&(ss>=50))
		{
			System.out.println("\n\t grade = C");
		}
		else if((ss<50)&&(ss>=40))
		{
			System.out.println("\n\t grade = D+ ");
		}
		else 
		{
			 System.out.println("\n\t FAIL");
		}
		
		
	

	}
	

}
 
class PersonalStudentInfo2
{
	public static  void main(String r[])throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		 sem2 ob = new sem2();
		ob.display();
		ob.av1();
		ob.grade();
		

	}


}