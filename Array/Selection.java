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
        int min=0,pos=0;
	for(int i=0;i<n;i++)
	{
	    min=a[i];
	    pos=i;
	   for(int j=i+1;j<n;j++)
	   {
	       if(min>a[j])
	        {
	          min=a[j];
	          pos=j;
	        }
	   }
	   a[pos]=a[i];
	   a[i]=min;
	}
	for (int i=0;i<n;i++)
	System.out.println("\t"+a[i]);

}
} 
