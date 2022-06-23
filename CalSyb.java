import java.util.*;
class CalSyb
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\t\t\t\t\nCalculator");
			System.out.println("\t\t\t\t\n==========");
			System.out.println("\t\t\t\t\n+");
			System.out.println("\t\t\t\t\n-");
			System.out.println("\t\t\t\t\n*");
			System.out.println("\t\t\t\t\n/");
			System.out.println("\nEnter your Choice:");
			char a=sc.next().charAt(0);
			switch(a)
			{
			case'+':
				{
					System.out.print("\tEnter 1st number:");
					int num1=sc.nextInt();
			
					System.out.print("\tEnter 2nd number:");
					int num2=sc.nextInt();
					
					int s=num1+num2;
					System.out.print("\tResult:"+s);
					break;
				}
			case'-':
				{
					System.out.print("\tEnter 1st number:");
					int num1=sc.nextInt();
			
					System.out.print("\tEnter 2nd number:");
					int num2=sc.nextInt();
					
					int s=num1-num2;
					System.out.print("\tResult:"+s);
					break;
				}

			case'*':
				{
					System.out.print("\tEnter 1st number:");
					int num1=sc.nextInt();
			
					System.out.print("\tEnter 2nd number:");
					int num2=sc.nextInt();
					
					int s=num1*num2;
					System.out.print("\tResult:"+s);
					break;
				}

			case'/':
				{
					System.out.print("\tEnter 1st number:");
					int num1=sc.nextInt();
			
					System.out.print("\tEnter 2nd number:");
					int num2=sc.nextInt();
					
					int s=num1/num2;
					System.out.print("\tResult:"+s);
					break;
				}
			default:
				System.out.println(" choice again.. ");
			}
			
		}
	}