import java.io.*;
class InputValue
{
	public static void main(String r[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);

		int a[]=new int[10];
		int i;
		
		try{
		System.out.println("\nEnter any 5 values in array :- ");
		for(i=0;i<5;i++)
		{
			System.out.print("a["+i+"] = ");
			a[i]=Integer.parseInt(in.readLine());
		}
		}catch(Exception e){System.out.println("\n\n!!!!!!!! warning u entered the worng data\n\n");}
		
		System.out.println("\nOutput of an array\n");
		for(i=0;i<5;i++)
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		
	}


	

}