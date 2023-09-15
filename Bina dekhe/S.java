import java.util.Scanner;
class Test
{
	public static void main(String args[])
{
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter any number");
       int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	 {
	   for (int j=0;j<i;j++)
	    { 
	      System.out.print("* ");
	      }
	      System.out.println();
	      }
	      for(int i=1;i<=n-1;i++)
	       {
	        for (int j=0;j<n-i;j++)
	         {
	          System.out.print("* ");
	           }
	        System.out.println();
	      }
	      
	      
	     }}  
	        
	      
