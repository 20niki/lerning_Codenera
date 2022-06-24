class SumSquare
	{
		public static void main(String[] args)
		{
			int i=1,s=0;
			System.out.println("Enter number\t Square");

			while(i<=10)
			{
				System.out.println(i+ "\t\t" +i*i);
				i++;
				s=s+(i*i);
			}
			System.out.print("Total Value:");
			System.out.println(s);
		}
	}