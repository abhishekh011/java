import java.util.Scanner;
class Test{
 public static void main(String [] args){
 	Scanner sc=new Scanner (System.in);
	int a[]=new int [20];
	System.out.println("How many Elements You Wants to Entered");
	int n =sc.nextInt();
	
	System.out.println("Enter Element an Array");
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	System.out.println("actual element")                         
	for(int i=0;i<n;i++)
	System.out.println("\ta["+i+"]= "a[i]);
	for(int i=0;i<n;i++)
	{
	   for(int j=0;j<n-i-1;j++)
	   {
	       if(a[j]>a[j+1])
	        {
	         int temp=a[j+1];
	          a[j+1]=a[j];
	          a[j]=temp;
	          
	        }
	   }
	}
	System.out.println(" bubble element ");
	for (int i=0;i<n;i++)
	System.out.println("\ta["+i+"]= "+a[i]);

}
} 
