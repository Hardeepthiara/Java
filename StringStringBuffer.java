import java.util.*;
class StringStringBuffer
{
	public static void main(String[] arg)
	{
		Scanner s = new Scanner(System.in);
		//String name;
		StringBuffer name1 = new StringBuffer("Ashesh ");
		StringBuffer name2 = new StringBuffer("kumar");
		StringBuffer name3 = new StringBuffer(50);
		
		//System.out.print("\n\n\tEnter any String = ");
		//name1=s.nextLine();
		// 1. append command: it is used to concat the two string .. its join the another string end of the first string's index
		//name2.append(name1);
		
		// 2. setCharAt(): its indicate to specify the index where a character will insert within the string 
		
		//name1.setCharAt(3,'i');
		//System.out.println("\n\n\t Name  : "+name1);
		
		// 3. insert():
		//System.out.println("\n\n\t Name  : "+name2);
		//name2.insert(2,'m');
		//System.out.println("\n\t insert() : "+name2);
		
		// 4. delete():
		
		//System.out.println("\n\n\t Name  : "+name2);
		//name2.delete(2,5);
		//System.out.println("\n\t delete() : "+name2);
		
		// 5. setLength();
		/*System.out.println("\n\n\t Name  : "+name2);
		int n=name2.length();
		System.out.println("\n\t length : "+n);
		name2.setLength(40);
		n=name2.length();
		System.out.println("\n\t length : "+n);
		
		System.out.println("\n\t setlength() : "+name2);
		*/
		// 6. reverse():
		
		System.out.println("\n\n\t Name  : "+name2);
		name2.reverse();
		System.out.println("\n\t reverse() : "+name2);
		
		
		
	}
}