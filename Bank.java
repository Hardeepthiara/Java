import java.util.Scanner;
class BankAccount
{
		int accno;  // data members
		float bal;
		String name;
		char ch1;
		Scanner in = new Scanner(System.in);
		
		void inputInfo(int act,String nm,char c, float bl)//Input Method
		{
			boolean b1,b2,b;
			String st;
			char a[]= new char[20];
			char temp;
			int len=nm.length();
			for(int i=0; i<len;i++)
			{ 
			
				a = nm.toCharArray();  //string index convert into character
				b=Character.isWhitespace(a[0]);
				b1=Character.isDigit(a[0]);
				b2=Character.isLowerCase(a[0]);
				if((b==true)||(b1==true))
				{
					break;
				}
				if(b2==true)
				{
					temp=Character.toUpperCase(a[0]);
					a[0]=temp;
				}
				
			
				
			}
			st = new String(a);
			//System.out.print("\tName string = "+st);
			
			accno=act;
			name=st;	// strcpy(name,nm); in c++
			bal=bl;
			ch1=c;
		}
		void deposit()//deposit balance
		{
			float amt;
			System.out.print("\n\n\t Enter deposit amount = ");
			amt=in.nextFloat();
			
			bal+=amt; // bal= bal+amt;
			System.out.println("\n\n\tDeposit amount = "+amt);
			System.out.println("\n\n After deposit balance is = "+bal);
			printAcct(); // function calling within the class
			
		}
		void withdraw()//Amount Withdraw
		{
			float amt;
			System.out.print("\n\n\t Enter withdraw amount = ");
			amt=in.nextFloat();
			if(amt>=bal)
			{
				System.out.println("\n\tInsufficent amount ur entered");
			}
			else 
			{
				bal-=amt;
				System.out.println("\n\n\tWithdraw amount = "+amt);
				System.out.println("\n\n After withdraw balance is = "+bal);
				printAcct();
			}
		}
		void printAcct()//display method
		{
			
			System.out.println("\n\n\t Account number = "+accno);
			System.out.println("\n\t Name = "+name);
			System.out.println("\n\t Gender = "+ch1);
			System.out.println("\n\t total Balance = "+bal);
		}
}



public class Bank
{ 
	
	public static void main(String args[])
	{
		
		BankAccount ob = new BankAccount();
		Scanner input = new Scanner(System.in);
		
		String acnm;
		char ch;
		int acid;
		float inbal;
		
		System.out.print("\n\n\t Enter Name  = ");
		acnm=input.nextLine();
		System.out.print("\n\n\t enter character m/f = ");
		ch=input.next().charAt(0);
		System.out.print("\n\n\t Enter Account number  = ");
		acid=input.nextInt();
		System.out.print("\n\n\t Enter initial balance  = ");
		inbal=input.nextFloat();
			
			
			ob.inputInfo(acid,acnm,ch,inbal);
			System.out.println("\n\n___________________________________________\n\n");
			ob.printAcct();
			
			System.out.println("\n\n____________________________________________\n\n");
			ob.deposit();
			/*
			System.out.println("\n\n____________________________________________\n\n");
			ob.withdraw();
			
			System.out.println("\n\n____________________________________________\n\n");
			ob.deposit();
			
			System.out.println("\n\n___________________________________________\n\n\n\n\n\n");
			
			ob.printAcct();
		*/
	}
}
