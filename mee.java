import java.util.*;
class meee
{
	
	public static void main(String r[])
	{
		Scanner in = new Scanner(System.in);
		char ch ;
		boolean b;
		System.out.print("\n\tEnter the value of charcter =");
		ch = in.next().charAt(0);
		System.out.println("\n\t Character value is = "+ch);
		b = Character.isDigitorLetter(ch);
		
		System.out.println("\n\t charcter value = "+ch+"+is+"+b);
		
		
		
	
	}



}