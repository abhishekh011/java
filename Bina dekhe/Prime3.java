import java.util.Scanner;
class Prime3
{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int n = sc.nextInt();
       int i =2; 
       int flag =1;  
       if()                         
       
        while(i<n)
       {
           if(n%i==0)
           {
              flag=0;
               break;
            }                         
              i++;        
       }
        if(flag==1)
            System.out.println("prime");
          else
             System.out.println("not prime");     
       }
    
    
    
    }
