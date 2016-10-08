import java.util.*;
class StringHandling
{
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);
		//String s="Sohal Saab";
			//		or
		//String str= new String(Ashish);
		String name;
		int len;
		/*
		System.out.print("\n\tEnter your name\t: ");
		name=in.nextLine();
		// 1.	Find the length of the string with using length().
		len=name.length();
		//System.out.println("\n\t Name\t\t: "+name);
		//System.out.println("\n\t Name's length\t: "+len);
		
		// 2. find out the character from the string via giving index number.
		char c=name.charAt(3);
		//System.out.println("\n\t Name\t\t: "+name);
		//System.out.println("\n\t Name's length\t: "+len);
		//System.out.println("\n\t check index character\t: "+c);
		//char c2=Character.toUpperCase(c);
		
		for(int i=0; i<len; i++)
		{
			if(i==3)
			{
					char c2=Character.toUpperCase(c);
					
			}
			System.out.println("\n\t Name\t\t: "+name);
		}
		
		
		//3. find out the index number from the given string's character
		int n1;
		n1=name.indexOf('s');
		System.out.println("\n\t Name\t\t\t\t: "+name);
		System.out.println("\n\t Name's length\t\t\t: "+len);
		System.out.println("\n\t check index character\t\t: "+c);
		System.out.println("\n\t check character's index number\t: "+n1);
		
		//4.  find findout the lastindexof 
		int n2;
		n2=name.lastIndexOf('A');
		
		System.out.println("\n\t Name\t\t\t\t: "+name);
		System.out.println("\n\t Name's length\t\t\t: "+len);
		
		System.out.println("\n\t check last index number\t: "+n2);
		
		//5. convert lower string into upper or vice verca
		String nam1,nam2,nam3,nam4;
		System.out.print("\n\tEnter your name\t: ");
		nam1=in.nextLine();
		System.out.print("\n\tEnter your name\t: ");
		nam2=in.nextLine();
		nam3=nam1.toLowerCase();
		nam4=nam2.toUpperCase();
		System.out.println("\n\n\n\t Name1\t\t: "+nam1);		
		System.out.println("\n\t Name 1 to 3\t\t: "+nam3);
		System.out.println("\n\n\n\t Name2\t\t: "+nam2);
		System.out.println("\n\t Name 2to 4\t\t: "+nam4);
		
		*/
		// 6. replace character from the string
		String ni;
		System.out.print("\n\tEnter your name\t: ");
		name=in.nextLine();
		char c=name.charAt(3);
		char c2=Character.toUpperCase(c);
		ni=name.replace(c,c2);
		System.out.println("\n\n\n\t Name1\t\t: "+name);		
		System.out.println("\n\t Name\t\t: "+ni);
		
		
		
	}
}