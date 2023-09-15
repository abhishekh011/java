import java.util.Scanner;
class Test
{
 public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("any number");
     int x =sc.nextInt();

     for(int i=100;i<x;i++)
     {
       int y=i;
       int rev=0;
       while(y>0)
       {
          int r=y%10;
          rev=rev*10+r;
          y=y/10;
       }
         if(rev==i)
         {
           System.out.println(i);
         }
     
    }
    
    
   }

}
