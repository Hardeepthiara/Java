class ArrayWithLoop
{
   public static void main(String ar[])
   {
   int i,sum;
   int a[]= new int[6];
   sum = 0;
   a[0]= 23;
   a[1]=56;
   a[2]=22;
   a[3]=38;
   a[4]=34;
   a[5]=89;
		System.out.println("\nValues of arry \n");
   
		for(i=0;i<a.length;i++)
		{
			
			//System.out.print(" a["+i+"] = "+a[i]);
			System.out.print(a[i]+" + ");
				sum=sum+a[i];
				
			
   
		}
		 System.out.println("\b\b= "+sum);
   
   
   }

} 