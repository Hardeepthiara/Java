class basicInfostu
{
	String name;
	char gen;
	int roll;
	String branch;
	
	// input of the class variables ......
	void getdata(String nm,char gn, int rln,String br)
	{
		name=nm;
		gen=gn;
		roll=rln;
		branch=br;
		
	}
	
	// output of the class variables......
	void display()
	{
		System.out.println("\n\n\t Name : "+name);
		System.out.println("\n\t Gender : "+gen);
		System.out.println("\n\t Roll no : "+roll);
		System.out.println("\n\t Bracnch : "+branch);
	}
}
class basicInfostuTest
{
	public static void main(String arg[])
	{
		basicInfostu obj = new basicInfostu();  // create a object of the class
		
		obj.getdata("Ashish",'M',12345,"BCA");
		obj.display();
	}
}