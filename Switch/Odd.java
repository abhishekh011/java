import java.util.Scanner;
class Odd
 {
     public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Entar any  number");
     int a = sc.nextInt();
     
         switch(a%2)
          {
          case 0:  
                System.out.println("even");            
            break;
         
           case 1:
            System.out.println("odd");
        break;
        }
         
    } 
 }    
     
     
     
     
