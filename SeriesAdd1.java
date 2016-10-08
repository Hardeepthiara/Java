class SeriesAdd1
{
		public static void main(String ar[])
		{
	
			int i,t=0;
			i=1;
			
			while(i<=6)
			{
				t=t+i;
				
				System.out.print(i+" + ");
				i++;
			}
			System.out.print("\b\b\b = "+t);
		}
}