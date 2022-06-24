import java.util.*;
class SumEO
	{	
		public static void main(String[]args)
		{
		
		int r;	
		int i=34567834;
		int sum1=0;
		int sum2=0;
		while(i!=0)
		{
			r=i%10;
		if(r%2==0)
		sum1=sum1+r;
		else
		sum2=sum2+r;
		i=i/10;
		}
		System.out.println("The Even is"+sum1);
		System.out.println("The Odd is"+sum2);
		
		
		
		
        	
		} 
	}