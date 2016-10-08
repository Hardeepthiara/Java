class personalinfo
{
	String nm, add,bir;
	long ac;
	char g;

	void get(String a,String b,long c,String d,char e )
	{
		nm=a;
		add=b;
		ac=c;
		bir=d;
		g=e;
	}
	
	void display()
	{
		System.out.println("\n\tNAME\t : "+nm);
		System.out.println("\n\tD O B\t : "+bir);
		System.out.println("\n\tADD\t : "+add);
		System.out.println("\n\tA/C\t : "+ac);
		System.out.println("\n\tGEN\t : "+g);
	}
}
class information
{
	public static void main(String r[])
	{
		personalinfo ob = new personalinfo();
			ob.get("chandni","chand nagar",1234567,"13.07.1996",'f');
			ob.display();	
	}
}