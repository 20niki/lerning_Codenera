import java.util.*;
class Summ 
	{	
		public static void main(String[]args)
		{
		
		int r;	
		int i=34567834;
		int sum=0;
		
		while(i!=0)
		{
			r=i%10;
			sum=sum+r;
			i=i/10;
		}
		System.out.println("The Sum is"+sum);
		} 
	}