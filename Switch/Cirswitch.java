import java.util.Scanner;
import java.lang.String;
class Cirswitch
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    double a,b,res;
      System.out.println("Your choices are");
      System.out.println("1 for Area of Circle\n2 for circumperence of circle");
      System.out.println("3 for diameter\n4 for Radias"); 
      System.out.println("5 for Area of rectangle\n6 Area of Sphere");
      System.out.println("Enter your choice");  
        int ch = sc.nextInt();
      switch(ch)
         {
            case 1:
            System.out.println("Enter Radius");
               a = sc.nextDouble();
               b = a*a;
               res = 3.14*b;
            System.out.println(" Area of Circle = "+res);
            break;  
           case 2:              
            System.out.println("Enter Radius");
               a = sc.nextDouble();
               b = 3.14*a;
               res = 2*b;
            System.out.println("circumperence of circle = "+res);
            break;  
         case 3:
            System.out.println("Enter Radius");
              a = sc.nextDouble();
              b = 2*a;
             // double res = a*b;
            System.out.println("Diameter of circle = "+b);
            break;    
         case 4:
            System.out.println("Enter Diameter");
              a = sc.nextDouble();
              b = a/2;
              //double res = a/b;
            System.out.println("Radius of circle = "+b);
            break;  
         case 5:
            System.out.println("Enter Lenth and width");
               a = sc.nextDouble();
               b = sc.nextDouble();
               res = a*b;
            System.out.println("Area of Rectangle = "+res);
            break;   
         case 6:
            System.out.println("Enter Radius");
              a = sc.nextDouble();
              b = 3.14*a*a;
              res = 4*b;
            System.out.println("Area of Rectangle = "+res);
            break;  
         }  
   }   
      
}      
