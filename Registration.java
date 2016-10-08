class basicInfo
{
	String nm;
	String roll;
	String br;
	String sem;
	char gen;

	void input(String a, String b,String c,String d,char e)
	{
		nm=a;
		roll=b;
		br=c;
		sem=d;
		gen=e;
	}

	void output()
	{
		System.out.println("\n\tName\t= "+nm);
		System.out.println("\n\tRoll no\t= "+roll);
		System.out.println("\n\tBranch\t= "+br);	
		System.out.println("\n\tSem\t= "+sem);
		System.out.println("\n\tGender\t= "+gen);
			
	}

}
class Registration
{
	public static void main(String ar[])
	{
		 basicInfo brObj = new  basicInfo();  	//create object of the "basiInfo" class
		brObj.input("chandni","18","IT","5",'f');
		brObj.output();


	}
}