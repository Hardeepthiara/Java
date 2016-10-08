class grossSalary
{
	public static void main(String ar[])
	{
		int bs,ma;
		double da,hra,gs;

		bs=29000;
		
		if(bs<=10000)
		{
			da=(double)bs*31/100;
			hra=(double)bs*12/100;
			ma=250;

			gs=bs+da+hra+ma;

			System.out.println("\n\n\tBasic salary\t= "+bs);
			System.out.println("\n\n\tDA 31%\t\t= "+da);
			System.out.println("\n\n\tHRA 12%\t\t= "+hra);
			System.out.println("\n\n\tMA\t\t= "+ma);
			System.out.println("\n\n\tGross salary\t= "+gs);
			
		}
		else
		{
			da=(double)bs*35/100;
			hra=(double)bs*15/100;
			ma=350;

			gs=bs+da+hra+ma;
		
			System.out.println("\n\n\tBasic salary\t= "+bs);
			System.out.println("\n\n\tDA 35%\t\t= "+da);
			System.out.println("\n\n\tHRA 15%\t\t= "+hra);
			System.out.println("\n\n\tMA\t\t= "+ma);
			System.out.println("\n\n\tGross salary\t= "+gs);

		}
		
		


	}
}