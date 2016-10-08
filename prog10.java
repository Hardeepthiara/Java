/*
	(x^1/(1^2)) + (x^2/(2^3)) + upto nth number.

*/

class prog10
{
	public static void main(String r[])
	{
		int i,sum,x;
		double t1,t2,t3;
		
		i=1;
		sum=0;
		x=2;
		t3=0;
		while(i<=5)
		{
			t1=Math.pow(x,i);
			t2=Math.pow(i,(i+1));
			t3=t1/t2;
			sum=sum+(int)t3;
			System.out.println("\n\t t1 = "+t1);
			System.out.println("\n\t t2 = "+t2);
			System.out.println("\n\t t3 = "+t3);
			i++;
			
		}
			System.out.println("\n\t Sum = "+sum);
	}
}
			
	