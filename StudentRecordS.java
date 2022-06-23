import java.util.*;
class StudentRecordS	
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
 			System.out.println("Enter marks Optain in subject ");
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
		   	double sum,avrg,perc;
			sum=a+ b + c + d + e;
	                avrg=(sum/0.5);
	                perc=avrg*100;
	                System.out.println("perc Student "+perc);
		
			
			
				if(perc>=90)
					{		
					System.out.println("First Gread A");
					}
				else if(perc<=80)
					{		
					System.out.println("secound Division");
					}
				else if(perc<=70)
					{		
					System.out.println("Thired Division");
					}
				else if(perc<=60)
					{		
					System.out.println("Thired Division");
					}
			
				else if(perc<=50)
					{		
					System.out.println("Thired Division");
					}
				else if(perc<40)
					{		
					System.out.println("Fail");
					}
	

		}	
	}