class grossSalary2
{
	public static void main(String r[])
	{
		float bs, ma, da, hra, gs;
		bs=3000;
		
		if(bs<=10000)
		{
		da=bs*31/100;
		hra=bs*12/100;
		ma=250;
		gs=bs+da+hra+ma;
		System.out.println("\n\n\tBasis salary="+bs);
		System.out.println("\n\n\tDA31% ="+da);
		System.out.println("\n\n\tHRA12%="+hra);
		System.out.println("\n\n\tGross salary="+gs);
	
		 }	
		else
		{
		da=bs*35/100;
		hra=bs*16/100;
		ma=400;
		gs=bs+da+hra+ma;
		System.out.println("\n\n\tBasis salary="+bs);
		System.out.println("\n\n\tDA35%="+da);
		System.out.println("\n\n\tHRA16%="+hra);
		System.out.println("\n\n\tGross salary="+gs);
	
		


		}	
                      
		}
} 



