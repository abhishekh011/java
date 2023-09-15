import java.util.Scanner;
class Test
{
   public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any nomber" );
       int n = sc.nextInt();
       int i ,a,m=1;                            
       
        for(i=2;m<=n;i++)
       {
            int count=1;
           for(a=2;a<i;a++)
             {
                if(i%a==0)
                  count++;
                 
        }     
        if(count==1)
        {
            System.out.println(i);
            m++;
         } 
       
    }
   }
 }   

