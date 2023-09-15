import java.util.Scanner;
class Z
{
   public static void main(String [] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first person age");
    int a = sc.nextInt();
   System.out.println("Enter second person age");
    int b = sc.nextInt();
    System.out.println("Enter third person age");
    int c = sc.nextInt();
    System.out.println("Enter fourth person age");
    int d = sc.nextInt();
    if(a>b)
      {
       if(a>c)
         {
           if(a>d)
            System.out.println("a is big");
           else
            System.out.println("d is big");
         
         }
       else
       { 
        if (c>b) 
               System.out.println("c is big");
              else
               System.out.println("d is big");
         }                                       
      }
      else
      {
        if (b>c)
          {
            if (b>d)
              System.out.println("b is big");
            else
               System.out.println("d is big");
               
          
          }
          else
            System.out.println("c is big");
      
      
      }
   }
 


}
