import java.util.*;
class AnArrayOne
{
	public static void main(String ar[])
	{
		//int a[]={21,33,4,55,6};
		Scanner in = new Scanner(System.in);
		int i,n;
		int[] a= new int[5];
		
		/*
		a[0]=6;
		a[1]=16;
		a[2]=63;
		a[3]=62;
		a[4]=667;
		*/
		n=a.length;
		System.out.print("\nEnter An Array values:\n\n");
		for(i=0; i<n; i++)
		{
			System.out.print("\t"+"a["+i+"] = ");
			a[i]=in.nextInt(); //in.next().charAt(0);
		}
		
		System.out.print("\n\nAn Array values are following"\n\n");
		for(i=0; i<n; i++)
		{
			System.out.println("\t"+"a["+i+"] = "+a[i]);
		}
		
	}
	
}