import java.util.*;
class Ascii
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input ");
		char ch=sc.next().charAt(0);
		
		if(ch>=65 && ch<=90)  
		{
                System.out.print("Cappital char is an alphabet.");
		
		}
		if(ch>=97 && ch<=122)  
		{
                System.out.print("Small char is an alphabet.");
		
		}
		if(ch>=58 && ch<=64)  
		{
                System.out.print("char is int.");
		
		}
		if(ch>=48 && ch<=57)  
		{
                System.out.print("Special char is an alphabet.");
		
		}
		if(ch>=0 && ch<=47)  
		{
                System.out.print("Special char is an alphabet.");
		
		}

		if(ch>=58 && ch<=64)  
		{
                System.out.print("Special char is an alphabet.");
		
		}
		
		if(ch>=91 && ch<=96)  
		{
                System.out.print("Special char is an alphabet.");
		
		}
		if(ch>=123 && ch<=127)  
		{
                System.out.print("Special char is an alphabet.");
		
		}	
		
	}
   		 
}
