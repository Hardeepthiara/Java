import java.util.*;
class checkString
{
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		char a[]= new char[20];
		String name;
		String st;
		System.out.print("\n\n\tEnter Student name = ");
		name = input.nextLine();
		
		//ar c;
			int i;
			//ar c=' ';
			boolean b,b1,b2;
			char temp;
			/*
			a[0]='c';
			a[1]='H';
			a[2]='A';
			a[3]='N';
			a[4]='D';
			a[5]='N';
			a[6]='I';
			*/
			//b=Character.isWhitespace(a[0]);
			//System.out.print("isWhiteSpace= "+b);
		//String st = new String(a);
		//System.out.println("\nString name : "+st); 	
			int len=name.length();
			for(i=0; i<len;i++)
			{ 
			//System.out.println("a["+i+"] = "+a[i]);
				a = name.toCharArray();  //string index convert into character
				b=Character.isWhitespace(a[0]);
				b1=Character.isDigit(a[0]);
				b2=Character.isLowerCase(a[0]);
				if((b==true)||(b1==true))
				{
					break;
				}
				if(b2==true)
				{
					temp=Character.toUpperCase(a[0]);
					a[0]=temp;
				}
				
			
				
			}
			st = new String(a);
			System.out.print("\tName string = "+st);
			
	}
}