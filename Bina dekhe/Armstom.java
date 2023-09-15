import java.util.Scanner;
class Armstom
{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int n = sc.nextInt();
       int i =1;
       int a,b,m=n;
       int sum=0;                            
     
     {
        while(n>0)
       {
         a =n%10;
       //  b= a/10;
        // c =a%10;
        b =a*a*a;
        sum=sum+b;
                
         n =n/10;       
        }
        } 
        if(m==sum)
            System.out.println("armstom");
          else
             System.out.println("not armstom");     
       }
    
    
    
    }



