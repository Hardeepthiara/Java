import java.io.*;
class acc1
{
	String nm;
	int acc;
	double bal, amt ,dpost;

	void getdata()throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);

		System.out.print("\n\tEnter the name = ");
		nm=in.readLine();

		System.out.print("\n\tenter the account no. = ");
		acc=Integer.parseInt(in.readLine());
		
		System.out.print("\n\tenter the balance");
		bal=Double.parseDouble(in.readLine());
		
		
	}
	void deposit()throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		
		System.out.print("\n\t Enter deposit amount = ");
		amt=Double.parseDouble(in.readLine());
		bal=amt+bal;
		System.out.println("\n\n\tDeposit amount = "+amt);
		System.out.println("\n\n\tAfter deposit amount = "+bal);
		
	}
	
	void withdrawal()throws IOException
	{
		DataInputStream in = new DataInputStream(System.in);
		
		System.out.print("\n\t Enter withdraw amount = ");
		amt=Double.parseDouble(in.readLine());
	
		if(amt<=bal)
		{
			bal=bal-amt;
			System.out.println("\n\n\tWithdraw amount = "+amt);
			System.out.println("\n\n\tAfter Withdraw amount = "+bal);
		}
		
		else
		{
			System.out.println("\n\t this process is not completed due to low bal");
		}
	}
	
	void display()
	{
		System.out.println("\n\n\n\n");
		System.out.println("\n\tName\t\t=\t"+nm);
		System.out.println("\n\tAccount number\t=\t"+acc);			
		System.out.println("\n\tBalance\t\t=\t"+bal);
		
		
			
	}
}
	class bankAcc
	{
		public static void main(String r[])throws IOException
		{
			DataInputStream in = new DataInputStream(System.in);
			acc1 ob = new acc1();
			ob.getdata();
			ob.display();  // check the initial amount
			ob.deposit();
			ob.display(); // check after depoist amount
			ob.withdrawal();
			ob.display();  // check after withdraw amount
			
		}
	}		