import java.util.Scanner;
class Test
{
   public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out. println("Enter any number");
       int n =sc. nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
         if((j==1&&i<=(n+1)/2)||(j==n&&i>=(n+1)/2)||(i==1&&j>=(n+1)/2)||(i==n&&j<=(n+1)/2))
           System.out.print("*");
           else
           System.out.print(" ");
        }
        System.out.println();
      }
    
    }
}
