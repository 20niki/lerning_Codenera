class EnO
{

public static void main(String[] args)
{

        int n=201;
        int Sum=0;
        int ct=0;
        int s1=0;
        int ct1=0;

          while(n<=400)
          {
            if(n%2==0)
             {
            Sum=n + Sum;
            ct++;
              } 
          else
             {
             s1=n+s1;
              ct1++;
             }

               n++;
             }
               System.out.println("Total EvenNumber= "+Sum);

               System.out.println("Total OddNumber= "+s1); 

                  int difference=Sum-s1;
               System.out.println("difference= "+difference);
               System.out.println("TotalEvennumber = "+ct);
               System.out.println("Total oddnumber = "+ct1);
}
}


