import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
  //to remove all the duplicate values from array
    
    int x,i,j;
    boolean m=false;
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("Enter the length of array");
    int n =sc.nextInt();
		
    System.out.println("Enter values in array");
    for( i=0;i<n;i++)
    //for taking input
	
	a[i]=sc.nextInt();
	int current=a[0];
			
	for(i=0,x=0;i<n;i++)
	{
	  if(a[i]!=-1)
	  {
	    for(j=i+1;j<n;j++)
	    {
		if(a[i]==a[j])
		{
		  a[j]=-1;
		}
	    }
	    a[x]=a[i];
	    x++;
	  }
       }
    System.out.println("Updated array is :");
    for( i=0;i<x;System.out.println("a["+i+"]="+a[i]),i++);
  }
}
