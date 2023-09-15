import java.util.Scanner;

class Max
{
    public static void main(String [] args)
   { 
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the any two number");
         int a = sc.nextInt();
        int b = sc.nextInt();
    
     switch(a>b)
        {   
            case 1: 
            System.out.println("maximum"+a);
            case 2:
            defult:
            System.out.println("maximum"+b);
        }
  }
}
