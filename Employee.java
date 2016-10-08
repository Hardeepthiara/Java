import java.io.*;
class chandni
{
	String nm;
	int e_id,sal,hsr,da,ts,gs;
	
	chandni(String a,int b,int c)
	{
		nm=a;
		e_id=b;
		sal=c;
		
		
	}
	void calculate()
	{
		
		hsr=(sal*15/100);
		da=(sal*10/100);
		ts=(sal*5/100);
		gs=(sal+hsr+da+ts);
	}

	
	void display()
	{
		System.out.println("\n\n\tName\t="+nm);
		System.out.println("\n\n\t EID\t="+e_id);
		System.out.println("\n\n\tSalary\t="+sal);
		System.out.println("\n\n\tH rent\t="+hsr);
		System.out.println("\n\n\tDA\t="+da);
		System.out.println("\n\n\tTS\t="+ts);
		System.out.println("\n\n\tgross sal\t="+gs);
	}
}
	class Employee
	{
		public static void main(String r[])
		{
			chandni ob = new chandni("Rahul",1234,1000);
			ob.calculate();
			ob.display();
		}
	}
		
		
	