import java.io.*;
class armstrong1
{
	public static void main(String er[])throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		int n,i,r,sum=0;
		

		System.out.print("\nEnter only 3 digit number = ");
		n=Integer.parseInt(in.readLine());
		//n=121;
		int n1=n;
		
		for(i=1; i<=3; i++)
		{
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;

		}
		System.out.println("\n\n\t number = "+n);
		if(sum==n1)
		{
 			System.out.println("\n\n\tArmstrong number = "+sum);
		}
		else
		{
			System.out.println("\n\n\tNon-Armstrong number = "+sum);
		}
		
	}

}