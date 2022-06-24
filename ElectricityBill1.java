import java.util.Scanner;

class ElectricityBill1 {
	 
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		int Units;
		double Amount, Sur_Charge, Total_Amount;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = sc.nextInt();
  
	  	if (Units < 50)
	  	{
	        Amount = Units * 2.60;
	  		Sur_Charge = 25;  	
	  	} 
	  	else if (Units <= 100)
	  	{
	  		
	  		Amount = 130 + ((Units - 50 ) * 3.25);
	  		Sur_Charge = 35; 	
	  	}
	  	else if (Units <= 200)
	  	{
	  		
	  		Amount = 130 + 162.50 + ((Units - 100 ) * 5.26);
	  		Sur_Charge = 45; 	
	  	}
	  	else
	  	{
		   	Amount = 130 + 162.50 + 526 + ((Units - 200 ) * 7.75); 
		   	Sur_Charge = 55; 
		}
		
		Total_Amount = Amount + Sur_Charge;
		System.out.println("\n Electricity Bill  =  " + Total_Amount);
	}

}