
import java.lang.Math;
class Quadric
{
	public static void main(String ar[])
	{
		int b,a,c;
		double d,x1,x2;
		a=5;
		b=4;
		c=1;
		

		d=(double)(b*b)-(4*a*c);
		//display(d);
		if(d==0)
		{
			x1=(-b)/(2*a);
			System.out.println("\n\nDeterminant = "+d);
			System.out.println("\n\nif (d==0) X1 = "+x1);
			
		}
		else if(d>0)
		{
			System.out.println("\n\nDeterminant = "+d);
		
			x1=(((-b)+Math.sqrt(d))/(2*a));
			x2=(((-b)-Math.sqrt(d))/(2*a));
	
			System.out.println("\n\n+X1 = "+x1);
			System.out.println("\n\n-X1 = "+x2);
		}
		else
		{
			System.out.println("\n\nImaginary number");
		}

		System.exit(0);


	}


}