import java.util.*; 
class chand
{

	int ia, ib, ic;
	int[] an=new int[5];
	float fa, fb, fc;
	double da, db, dc;
	long la, lb, lc;int i,sum=0;
	void Sum8(){
		for(i=0;i<=an.length;i++){
			sum+=i;
			
		}
		System.out.println("Array Sum :"+sum);
                 }
	void Sum4(long a,long b){
		la=a;  lb=b;   lc=la+lb;
	}
	
	void Sum3(double a,double b)
	{
		da= a;
		db= b;
		dc = da+db;
	

	}
	void Sum5(int a,long b)
	{
		ia=a; 
		la=b;
		lc=ia+la;
	}
	void Sum6(int a,double b)
	{
		ia = a;
		db = b;
		dc = ia+db;
	}
	void Sum7(float a,double b)
	{       
		fa=a; da=b; dc=fa+da;
	
}

	
                void Sum2(float a, float b){
		fa=a;
		fb=b;
		fc=fa+fb;
		
	}
	
	void sum1(int a, int b)
	{
		ia= a;
		ib= b;
		ic = ia+ib;
	}
	
	void display()
	{
		System.out.println("sum1 = "+ic);
		System.out.println("Float Sum: "+fc);
		System.out.println("double sum :"+dc);
		System.out.println("Long sum:"+lc);
		System.out.println("Sum 5 : "+lc);
		System.out.println("Sum 6 :"+dc);
		System.out.println("Sum 7: "+dc);

	}
	
}

class functionoverloading
{
	public static void main(String r[])
	{
		chand ob = new chand();
		ob.sum1(2,4);
		
		
		ob.Sum2(45,56);
		ob.Sum3(23.3333,45.7899);
		ob.Sum4(2345566,455555);
		ob.Sum5(23,678888);
		ob.Sum6(489,56.8767);
		ob.Sum7(233,45555.66666);
		ob.Sum8();
		ob.display();
	}
}
		


	
 