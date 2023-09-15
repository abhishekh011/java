import java.util.Scanner;
class Test

{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int n = sc.nextInt();
       int m=0;
       int k=1;
       
     for(int i=1;k<=n;i++)
     {
         m=i;
         int count=0;
        while(i>0)
       {
         count++;
         i=i/10;
        }
        i=m;
      int  sum=0;
        while(i>0)
        {
         int r = i%10;
         int a =1,pow=1;
         while(a<=count)
         {
           pow = pow*r;
           a++;
         }
        sum=sum+pow;
        i=i/10;
        }
        i=m;
        if(m==sum)
        {
            System.out.println("armstom"+m);
            k++;
         }
       }
    
     }    
    
    }



