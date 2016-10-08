class prog4
{
	public static void main(String r[])
		{
			int i=1, sum=0;;
			System.out.println("\n\n");
			/*
			while(i<=11)
			{
				if(i%2!=0)	
				{
					System.out.print(i+" + ");
					sum=sum+i;
					//System.out.println(" = "+sum);
				
				}
				//System.out.println();
				i++;
			}System.out.println("\b\b= "+sum);
			*/
			while(i<=11)
			{
					System.out.print(i+" + ");
					sum=sum+i;
					//System.out.println(" = "+sum);
				
				
				//System.out.println();
				i=i+2;
			}System.out.println("\b\b= "+sum);
			System.out.println("\n\n");
		}
		
}