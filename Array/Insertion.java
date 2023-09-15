import java.util.Scanner;
class Test
{
    public static void main(String [] args)
    {
 	Scanner sc=new Scanner (System.in);
	int a[]=new int [20];
	System.out.println("How many Elements You Wants to Entered");
	int n =sc.nextInt();
	
	System.out.println("Enter Element an Array");
	for(int i=0;i<n;i++)
	{
	System.out.print("a["+i+"]= ");
	a[i]=sc.nextInt();
	for(int j=0;j<n;j++)
	{
	  if(a[i]<a[j])
	    {
	     int temp=a[j];
	         a[j]=a[i];
	         a[i]=temp;
	     }
	  }
	}
	for(int i=0;i<n;i++)
	System.out.println("\ta["+i+"]= "+a[i]);
    }
} 
