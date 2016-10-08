// hardeepkaur.bca@gmail.com

import java.util.*;
class SwitchProgram
{
	public static void main(String aer[])
	{
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("1. Arithmetic Operation");
		System.out.println("2. Logical Operation");
		System.out.println("3. If- else Statements Operation");
		System.out.println("4. Looping Statements Operation");
		System.out.println("5. Area  Operation");
		System.out.print("\nEnter above option = ");
		n=in.nextInt();

		switch(n)
		{
			case 1:		System.out.println("1. Arithmetic Operation");
					int a1,a2,a3;
					System.out.println("1. Add Operation");
					System.out.println("2. Sub Operation");
					System.out.println("3. Multi Operation");
					System.out.println("4. Div Operation");
					System.out.println("5. Mod Operation");	
					System.out.print("\nEnter above option = ");
					n=in.nextInt();
					switch()
					{
						
						case 1: 	System.out.println("1. Add Operation");
							
							System.out.print("\nEnter A value = ");
							a1=in.nextInt();
							System.out.print("\nEnter B value = ");
							a2=in.nextInt();

							a3=a1+a2;

							System.out.print("\n\tA value\t= ");
							System.out.print("\n\tB value\t= ");
							System.out.print("\n\tSum\t= ");
							break;
		
						case 2:	System.out.println("2. Sub Operation");
							System.out.print("\nEnter A value = ");
							a1=in.nextInt();
							System.out.print("\nEnter B value = ");
							a2=in.nextInt();

							a3=a1-a2;

							System.out.print("\n\tA value\t= ");
							System.out.print("\n\tB value\t= ");
							System.out.print("\n\tSum\t= ");
							break;
						case 3:
							System.out.println("3. Multi Operation");
							System.out.print("\nEnter A value = ");
							a1=in.nextInt();
							System.out.print("\nEnter B value = ");
							a2=in.nextInt();

							a3=a1*a2;

							System.out.print("\n\tA value\t= ");
							System.out.print("\n\tB value\t= ");
							System.out.print("\n\tSum\t= ");
							break;
						case 4:
					
							System.out.println("4. Div Operation");
							System.out.print("\nEnter A value = ");
							a1=in.nextInt();
							System.out.print("\nEnter B value = ");
							a2=in.nextInt();

							a3=a1/a2;

							System.out.print("\n\tA value\t= ");
							System.out.print("\n\tB value\t= ");
							System.out.print("\n\tSum\t= ");
							break;
						case 5: 
							System.out.println("5. Mod Operation");	
							System.out.print("\nEnter A value = ");
							a1=in.nextInt();
							System.out.print("\nEnter B value = ");
							a2=in.nextInt();

							a3=a1%a2;

							System.out.print("\n\tA value\t= ");
							System.out.print("\n\tB value\t= ");
							System.out.print("\n\tSum\t= ");		
							break;
						default:
							System.out.println("\nEntered the wrong option ...!!!!!!!\n\n");	

					}
			
					break;
			case 2:
					System.out.println("2. Logical Operation");

					int b1,b2,b3;
					char ch;
					System.out.println("1. And Operation");
					System.out.println("2. Or Operation");
					System.out.println("3. Not Operation");
					System.out.print("\nEnter above option = ");
					n=in.nextInt();
					swtich(n)
					{
						case 1:
			
							System.out.println("1. And Operation");
							
							do{
								System.out.print("\nEnter a number between(0 to 40 = ");
								b1=in.nextInt();
								

							}while(!((b1>=0)&&(b1<=40)));
							break;
						case 2:

							System.out.println("2. Or Operation");
							do{
								System.out.print("\nEnter a number between(0 to 40 = ");
								ch=(char)in.next().charAt(0);
								

							}while((ch=='y')||(ch=='Y'));
							break;
						case 3:
							System.out.println("3. Not Operation");
							System.out.print("\nEnter A value = ");
							b1=in.nextInt();
							System.out.print("\nEnter B value = ");
							b2=in.nextInt();

							
							System.out.print("\n\tA\t= ");
							System.out.print("\n\tB\t= ");
							System.out.print("\n\t(a<b)\t= "(a<b));
							System.out.print("\n\t!(a<b)\t= "(!(a<b)));
							
							break;
						default:
							System.out.println("\nEntered the wrong option ...!!!!!!!\n\n");	

					}
					

					
					break;
			case 3:
					System.out.println("3. If- else Statements Operation");
					break;
			case 4:
					System.out.println("4. Looping Statements Operation");
					break;
			case 5:
					System.out.println("5. Area  Operation");
					break;

			default:
					System.out.println("\nEntered the wrong option ...!!!!!!!\n\n");	

		}
				
										
	}
}