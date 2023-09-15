import java.util.Scanner;
class N
{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int n = sc.nextInt();
       int a,b;
       int i,m=0;
       int sum=0;                            
     
     for(i=100;i<=n;i++)
     {
        while(i>0)
       {
         a =i%10;
       //  b= a/10;
        // c =a%10;
        b =a*a*a;
        sum=sum+b;
                
         i =i/10;
          m=i;       
        }
        
        if(m==sum)
            System.out.println("armstom"+sum);
       }
    }
    
    
    }



