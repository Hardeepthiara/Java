import java.lang.*;
class loop41
{
	public static void main(String r[])
	{
		int i;
		double t,t1;
		double sum=0.0;
		int x=2;
		
		for(i=1; i<=10; i=i+2)
		{
			t=Math.pow(x,i);
			t1=(double)i+3;
			sum=sum+t/t1;

			System.out.println("\n Sum = "+sum);
		}
		System.out.println("\n\nFinal Sum of series = "+sum);
		
	}
}