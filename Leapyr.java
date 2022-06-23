import java.util.*;
class Leapyr
{
	public static void main(String[]args)
	{
	int year;
	System.out.println("Enter the year: ");
	Scanner sc=new Scanner(System.in);
	year=sc.nextInt();
 	if((year%4==0 && year%400==0)||(year%100==0))
		{
			System.out.println("This year is Leap");
		}
		else
		{
			System.out.println("This year is Not a Leap");
		}
	}
}