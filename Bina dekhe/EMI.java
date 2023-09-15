import java.util.Scanner;
class Emi
{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int p = sc.nextInt();
       int r= sc.nextInt();
       int n = sc.nextInt();
       int i=1;
       float a=0,b=0;
     while(i<=n) 
     {
       a =p*n;
      
      i++;
            
      }
       b=a+r; 
       System.out.println(b);
       
    
    
    
    }



}
