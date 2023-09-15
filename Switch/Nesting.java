import java.util.Scanner;
import java.lang.String;
class Nesting
{
  public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number");
        int a =sc.nextInt(); 
      // int  b = a++ + a++ + a++ ;
      //int b = ++a+ ++a+ ++a;
     // int b = ++a;
         int b =a++;
      System.out.println("A :"+a+"    B :"+b  );
    
    }

}
