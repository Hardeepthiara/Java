import java.util.*;
class StringCharacter
{
	public static void main(String arg[])
	{
		char ch,ch1,ch2,ch3;
		boolean bl,b1,b2,b3,b4,b5,b6,b7;
		String str,str1,str2,str3,str4;
		int n,n1,n2,n3,n4;
		Scanner in = new Scanner(System.in);
		
		System.out.print("\n\tEnter String value = ");
		str=in.nextLine();
		
		//System.out.println("\n\tString value = "+str);
		n=str.length();
		
		ch3=str.charAt(2);
		
		System.out.println("\n\tString value is\t\t"+str+"\n\tString length is\t"+n+"\n\tCharAt position is\t"+ch3);
		
		/*
		System.out.print("\n Enter character value = ");
		ch=in.next().charAt(0);
		
		System.out.println("\nCharacter value = "+ch);
		
		bl=Character.isLetter(ch);
		System.out.println("\n\nCharacter is letter = "+ch+"  is  "+bl);
		
		b1=Character.isDigit(ch);
		System.out.println("\n\nCharacter is digit = "+ch+"  is  "+b1);
		
		b2=Character.isLetterOrDigit(ch);
		System.out.println("\n\nCharacter is digit or letter = "+ch+"  is  "+b2);
		
		b3=Character.isWhitespace('^');
		System.out.println("\n\nCharacter is WhiteSpaceInfo = "+ch+"  is  "+b3);
		
		b4=Character.isUpperCase(ch);
		System.out.println("\n\nCharacter is upper letter = "+ch+"  is  "+b4);
		
		b5=Character.isLowerCase(ch);
		System.out.println("\n\nCharacter is lower letter = "+ch+"  is  "+b5);
		
		ch1=Character.toLowerCase(ch);
		System.out.println("\n\nCharacter to lower letter = "+ch+"  is  "+ch1);
		
		ch2=Character.toUpperCase(ch);
		System.out.println("\n\nCharacter to upper letter = "+ch+"  is  "+ch2);
		*/
		
		
	}
}
