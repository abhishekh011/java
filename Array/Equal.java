import java.util.Scanner;
class Test
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
         int a[]=new int[100];
         int b[]=new int[100];
         System.out.println("Enter Nunber");
         int n=sc.nextInt();
         int sum=0,sum1=0;
         System.out.println("Enter Array 1st");
         for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
         System.out.println("Enter Array 2nd");
         for(int i=0;i<n;i++)
           b[i]=sc.nextInt();
         
         for(int i=0;i<n;i++)
         {
           sum=sum+a[i];
           sum1=sum1+b[i];
         }
          int x=sum-sum1;
          if(x==0)
          System.out.println("Array are same");
          else
          System.out.println("not same");
        
    }
    
}
