//chandnirasotra1996@gmail.com
class studentInformation
{
	String name;
	String roll,brnch,sem,year,inst;

	studentInformation(String name, String roll, String brnch, String sem, String year, String inst)
	{
		this.name = name;
		this.roll = roll;
		this.brnch = brnch;
		this.sem = sem;
		this.year = year;
		this.inst = inst;
	
	}

	void display()
	{

		System.out.println("\n\t Name\t\t\t\t = "+name);
		System.out.println("\n\t Roll no\t\t\t = "+roll);
		System.out.println("\n\t Branch\t\t\t\t = "+brnch);
		System.out.println("\n\t Sem\t\t\t\t = "+sem );
		System.out.println("\n\t Year\t\t\t\t = "+year);
		System.out.println("\n\t Insitute\t\t\t = "+inst);
	}


}
	
class subjects1 extends studentInformation
{
	String it,c,hvpe,cm,math1;

	subjects1(String it ,String c,String hvpe,String cm,String math1 , String name, String roll, String brnch, String sem, String year, String inst)
	{
		
		super( name ,roll,brnch,sem,year,inst);
		this.it = it;
		this.c = c;
		this.hvpe = hvpe;
		this.cm = cm;
		this.math1 = math1;
	}

	void display()
	{
		super.display();
		System.out.println("\n\t Information Technology\t\t= " +it);
		System.out.println("\n\t C programming\t\t\t = " +c);
		System.out.println("\n\t Human value\t\t\t = " +hvpe);
		System.out.println("\n\t Communication\t\t\t= " +cm);
		System.out.println("\n\t Math \t\t\t\t= " +it);		
	}
	


}

class subjects2 extends subjects1
{
	String math, cpls, evs , cse;
	
	subjects2( String math, String cpls , String evs , String cse, String it ,String c,String hvpe,String cm,String math1 , String name, String roll, String brnch,String sem, String year, String inst)
	{
		super( it,c,hvpe,cm,math,name ,roll,brnch,sem,year,inst);
		this.math = math;
		this.cpls = cpls;
		this.evs = evs ;
		this.cse = cse;
	}
		
	void display()
	{
		super.display();
		System.out.println("\n\t Math 2\t\t\t\t= " +math);
		System.out.println("\n\t C plus plus\t\t\t= "+cpls );
		System.out.println("\n\t Enviroment\t\t\t= " +evs);
		System.out.println("\n\t Computer System Architecture\t= " +cse);	

	} 



}
	
class subjects3 extends subjects2
{
	String ds,sad,acc,vb;
	
	subjects3(String ds,String sad,String acc,String vb,String math, String cpls , String evs ,  String cse, String it ,String c,String hvpe,String cm,String math1 , String name, String roll, String brnch, String sem, String year, String inst)
	{
		super( math, cpls, evs , cse, it,c,hvpe,cm,math1,name ,roll,brnch,sem,year,inst);

		this.ds = ds;
		this.sad = sad;
		this.acc = acc;
		this.vb = vb;
	}
	
	void display()
	{
	
		super.display();
		System.out.println("\n\t Data Structure\t\t\t = " +ds);
		System.out.println("\n\t SAD\t\t\t\tss = " +sad);
		System.out.println("\n\t Accounts\t\t\t= " +acc);
		System.out.println("\n\t Visual basic \t\t\t = " +vb);
	}
}



class studentRegistration1
{
	public static void main(String r[])
	{
		subjects3 ob = new subjects3("20","33","44","55","34","76","23","56","34","67","59","21","33","45","rrrr","6rrrr","ddd","tyy","uuuu");    
//String ds,String sad,String acc,String vb,String math, String cpls , String evs ,  String cse, String it ,String c,String hvpe,String cm,String math , String name, //String roll, String brnch, String sem, String year, String inst
		ob.display();
	
	}	


}