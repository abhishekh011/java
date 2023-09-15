import java.util.Scanner;
import java.lang.String;
class Calswich
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    double a,b,res;
      System.out.println("Your choices are");
      System.out.println("1 for Addition\n2 for substractoin");
      System.out.println("3 for Multiplication\n4 for divison"); 
      System.out.println("5 for modulas");
      System.out.println("Enter your choice");  
        int ch = sc.nextInt();
        switch(ch)
         {
             case 1:
               System.out.println("Enter any two number");
               a = sc.nextDouble();
               b = sc.nextDouble();
               res = a+b;
               System.out.println("Addision = "+res);
               break;       
            case 2:
               System.out.println("Enter any two number");
               a = sc.nextDouble();
               b = sc.nextDouble();
               res = a-b;
               System.out.println("Substrection = "+res);   
               break;
            case 3:
               System.out.println("Enter any teo number");
               a = sc.nextDouble();
               b = sc.nextDouble();
               res = a*b;
               System.out.println("Multiplicasion = "+res);
               break;
            case 4:
               System.out.println("Enter any teo number");
               a = sc.nextDouble();
               b = sc.nextDouble();
               res = a/b;
               System.out.println("Divison = "+res);
               break;
            case 5:
               System.out.println("Enter any teo number");
               a = sc.nextDouble();
               b = sc.nextDouble();
               res = a%b;
               System.out.println("modulas = "+res);
               break;
        }      
   }   
      
}      
