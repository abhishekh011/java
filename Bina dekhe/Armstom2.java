import java.util.Scanner;
class Armstom2
{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int n = sc.nextInt();
       int m=n;
       int count=0;
     
     
        while(n>0)
       {
         count++;
         n=n/10;
        }
        
        
        n=m;
      int  sum=0;
        while(n>0)
        {
         int r = n%10;
         int i =1,pow=1;
         while(i<=count)
         {
           pow = pow*r;
           i++;
           
         }
        sum=sum+pow;
        n=n/10;
        }
        
        if(m==sum)
            System.out.println("armstom");
          else
             System.out.println("not armstom");     
       }
    
    
    
    }



