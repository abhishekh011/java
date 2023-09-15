import java.util.Scanner;
class Prime
{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int n = sc.nextInt();
       int i =1,count=0;                            
       
        while(i<=n)
       {
           if(n%i==0)
                 count++; 
              i++;        
        } 
        if(count==2)
            System.out.println("prime");
          else
             System.out.println("not prime");     
       }
    
    
    
    }




