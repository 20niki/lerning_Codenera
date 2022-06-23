import java.util.*;
class ProLoss
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter selling price");
double sp=sc.nextDouble();
 System.out.println("Enter cost price");
double cp=sc.nextDouble();

if(cp-sp>0)
	{
		System.out.println("loss:"+(cp-sp));
	}
else if(cp-sp<0)
	{
		System.out.println("profit:"+(cp-sp));
	}
else
	{
	System.out.println("not profit and not loss");
	}
 }
}