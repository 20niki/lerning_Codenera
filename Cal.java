import java.util.*;
class Cal
	{
		public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int c,Add,Mult,Sub;
		System.out.println("\tCalculator");
		System.out.println("\t==========");
		System.out.println("\t1.ADD");
		System.out.println("\t2.SUB");
		System.out.println("\t3.MULT");
		System.out.println("\t4.DIV");
		System.out.print("\t\nEnter your Choice:");
		c=sc.nextInt();
		if(c==1)
			{
			System.out.print("\t\nEnter first number:");
			int a=sc.nextInt();
			System.out.print("\t\nEnter Secound number:");
			int b=sc.nextInt();
			 Add=a+b;
		
			System.out.println("\nAddintion is :" +Add);	
			
		
			}
		if(c==2)
			{
			System.out.print("\t\nEnter first number:");
			int a=sc.nextInt();
			System.out.print("\t\nEnter Secound number:");
			int b=sc.nextInt();
			Sub=a-b;
			System.out.println("\nSubstraction is :"+Sub);		
			
			}

		if(c==3)
			{
			System.out.print("\t\nEnter first number:");
			int a=sc.nextInt();
			System.out.print("\t\nEnter Secound number:");
			int b=sc.nextInt();
				
			Mult=a*b;
			System.out.println("\n\tMutiplication is :"+Mult);	
			}
		if(c==4)
			{
			System.out.print("\t\nEnter first number:");
			int a=sc.nextInt();
			System.out.print("\t\nEnter Secound number:");
			int b=sc.nextInt();
			double Div=a/b;
			System.out.println("\t\nDivition is:"+Div);		
			
			}
		



	}
}