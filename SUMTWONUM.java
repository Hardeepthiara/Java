class SuTwN
{
	int a,b,sum;
	
	void getvalue(int a1,int b1)
	{
		a=a1;
		b=b1;
	}
	
	void sum()
	{
		sum=a+b;
	}
	
	void putvalue()
	{
		System.out.println("\n\tA = "+a);
		System.out.println("\n\tB = "+b);
		System.out.println("\n\tSUM = "+sum);
	}
}

class SUMTWONUM
{
	public static void main(String r[])
	{
		SuTwN ob1=new SuTwN();
			ob1.getvalue(14,18);
			ob1.sum();
			ob1.putvalue();
	}
}
