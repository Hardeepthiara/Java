class stringbuffer1
{
	public static void main(String arg[])
	{
		StringBuffer s= new StringBuffer("Computer ");
		StringBuffer b= new StringBuffer("Application ");
		s.append(b);
		
		System.out.println("String is:  "+s);
	}
}