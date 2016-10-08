/*  	command line arguments:
 command line argument means input value declare after compilation but befor run time. And these input value display after run time when program will execute.

*/

class Arguments
{
	public static void main(String arg[])
	{
		int n,i;
		n=arg.length;
		for(i=0; i<n; i++)
		{
			System.out.println("\n\t"+arg[i]);
			//System.out.println("\n\t"+arg[1]);
			//System.out.println("\n\t"+arg[2]);
			
		}
		System.out.println("\n\t Total length of the argument = "+n);
	}


}