import java.util.*;
class Vow
	{
		public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("\tEnter the charecture ");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case'a':
			{
			System.out.println("\ta is Vowel");
			break;
			}
			
			case'A':
			{
			System.out.println("\tA is Vowel");
			break;
			}
			
			case'E':
			{
			System.out.println("\tE is Vowel");
			break;
			}

			
			case'e':
			{
			System.out.println("\te is Vowel");
			break;
			}

			
			case'i':
			{
			System.out.println("\ti is Vowel");
			break;
			}
			
			case'I':
			{
			System.out.println("\tI is Vowel");
			break;
			}
			
			case'o':
			{
			System.out.println("o is Vowel");
			break;
			}
			
			case'O':
			{
			System.out.println("O is Vowel");
			break;
			}
			
			case'u':
			{
			System.out.println("u is Vowel");
			break;
			}
		
			
			case'U':
			{
			System.out.println("U is Vowel");
			break;
			}
			default:
			System.out.println("charecture is not Vowel");
		}
	}
}
