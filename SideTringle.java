import java.util.*;
class SideTringle
	{
		public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\nEnter Three side of Tringle: ");
		

		System.out.println("\t\nEnter side1 of Tringle: ");
		int s1=sc.nextInt();

		System.out.println("\t\nEnter side2 of Tringle: ");
		int s2=sc.nextInt();

		System.out.println("\t\nEnter side1 of Tringle: ");
		int s3=sc.nextInt();
		
		if(s1>(s2+s3))
			{
			System.out.println("It's Tringle");
			}
		
		if(s2>(s1+s3))
			{
			System.out.println("It's Tringle");
			}
		if(s3>(s1+s2))
			{
			System.out.println("It's Tringle");
			}
		else
			{
			System.out.println("Not a Tringle");
			}
		}
}
		