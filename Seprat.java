import java.util.*;
class Seprat 
	{	
		public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=a;
		int rem;
		while(i!=0)
		{
			rem=i%10;
			System.out.print(rem+" ");
			i=i/10;
		}
		}
	} 