import java.util.*;
class Box{
public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 int w;
 System.out.println("Enter the Weight of Box");
 w=sc.nextInt();
	{

        if(w < 115)
	{
	System.out.println("\nFlyweight.");
	}
	else if(w >= 115 && w <= 121)
	{
	System.out.println("\nBantamweight.");
	}
	else if(w >= 122 && w <= 153)
	{
	System.out.println("\nFeatherweight.");
	}
	else if(w >= 154 && w <= 189)
        {
	System.out.println("\nMiddleweight.");
        }
	else
	{
		System.out.println("\nHeavyweight.");
	}
}
}
}