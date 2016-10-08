import java.io.*;
import java.lang.Math;
class birthDate
{
	public static void main(String args[])
	{ 
		DataInputStream in=new DataInputStream(System.in);
		int d1,d2,d3,m1,m2,m3,y1,y2,y3;
		long days;
		
		try
		{
	//    DATE OF BIRTH	
		System.out.println("Enter ur Date of Birth  ");
		System.out.print("\tEnter  Date  : ");
		d1=Integer.parseInt(in.readLine());
		System.out.print("\tEnter Month  : ");	
		m1=Integer.parseInt(in.readLine());
		System.out.print("\tEnter Year   : ");
		y1=Integer.parseInt(in.readLine());
	//     PRESENT DATE	
		System.out.println("\n\nEnter present Date "); 
		System.out.print("\tEnter  Date  : ");
		d2=Integer.parseInt(in.readLine());
		System.out.print("\tEnter Month  : ");	
		m2=Integer.parseInt(in.readLine());
		System.out.print("\tEnter Year   : ");
		y2=Integer.parseInt(in.readLine());
				
		d3=d2-d1;
		m3=m2-m1;
		y3=y2-y1;
		if(d3<0)
		{
			m3--;		// Borrow 1 from Month Part...
			d3=d3+30;	//Add Borrowed 1 Month(or 30 Days) to the resultant  Day
		}
		if(m3<0)
		{
			y3--;		// Borrow 1 from Year Part...
			m3=m3+12;	//Add Borrowed 1 Year(or 12 Months) to the resultant  Month
		}
		System.out.println("\n\n\t\tUr Date of Birth is : "+d1+"/"+m1+"/"+y1);
		System.out.println("\t\tPresent Date  is    : "+d2+"/"+m2+"/"+y2);	
		System.out.println("\t\t\t\t   ---------------");
		System.out.println(" Your Current Age as on    : "+d2+"/"+m2+"/"+y2+" is : "+y3+" Years, "+m3+" Months and "+d3+" Days...");
		System.out.println("\t\t\t\t   ---------------");
		days=(long) (y3*365+m3*30+d3+y3/5);
		System.out.println("\n\t\tYour Calculated Age in DAYS is : "+days+" Days...");
		
		}catch(Exception e){}
	}
}