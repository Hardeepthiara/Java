import java.util.*;
class introCharacter
{ 
	public static int max(int a1, int a2)
	{
		int mx;
		if(a1>a2)
		{
			mx=a1;
		}
		else
		{
			mx=a2;
		}
		return(mx);
	}
	public static char max(char a1, char a2)
	{
		char mx;
		if(a1>a2)
		{
			mx=a1;
		}
		else
		{
			mx=a2;
		}
		return(mx);
	}
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		char character;
		character='t';
		char a[] = new char[5];
		int n=a.length;
		boolean b;
		int n1,n2,m;
		char ch;
		n1=2;
		n2=5;
		a[0]='h';
		a[1]='e';
		a[2]='l';
		a[3]='l';
		a[4]='o';
		String st = new String(a);
		System.out.println("\n\t Character value = "+character);
		System.out.println("\n\n\t character comes into string value =  "+st);
		/*
		m=max(8,6);
		System.out.println("\n\n\tMaximaum value is "+m);
		//ch=max('8','6');
		//ch=max('A','b');
		
		System.out.println("\n\n\tchar Maximaum value is "+ch);
		
		for(int i=0; i < n; i++)
		{
			System.out.print(a[i]);
		}av
		*/
		/*
		System.out.print("\n Enter character value = ");
		ch=in.next().charAt(0);
		
		System.out.println("\nCharacter value = "+ch);
		
		b=Character.isLetter(ch);
		System.out.println("\n\nCharacter is letter = "+ch+"  is  "+b);
		
		
		System.out.print("\n Enter character value = ");
		ch=in.next().charAt(0);
		
		System.out.println("\nCharacter value = "+ch);
		
		b=Character.isDigit(ch);
		System.out.println("\n\nCharacter is digit = "+ch+"  is  "+b);
		*/
		System.out.print("\n Enter character value = ");
		ch=in.next().charAt(0);
		
		System.out.println("\nCharacter value = "+ch);
		
		b=Character.isLetterOrDigit(ch);
		System.out.println("\n\nCharacter is LetterOrDigit = "+ch+"  is  "+b);
		
	}

}
