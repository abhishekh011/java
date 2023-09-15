import java.util.Scanner;
class Fibo
{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int n = sc.nextInt();
       int i =1,a=-1,b=1,c;
       
       while(i<=n)
       {
        // b =i;
         
          c=a+b;
          System.out.println(i+" term ="+c);
          a=b;
          b=c;
          i++;
       
       }
    
    
    
    }



}
