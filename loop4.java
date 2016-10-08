import java.lang.*;
class loop4
{
	public static void main(String r[])
	{
		int a,sum,i;
		double t;
		a=4;
		t=0;
		sum=0;
		i=1;
		double x;
		x=2;
		while(i<=7 && a<=10)
		{
			t=Math.pow(2,i);
			sum=(int)t/a+sum;
			i=i+2;
			a=a+2;
			System.out.println(sum);
		}
	}
}