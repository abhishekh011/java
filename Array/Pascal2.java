import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[100];
    int i,j,k;
    
    System.out.print("Enter how many element in array : ");
    int n=sc.nextInt();
 
    for(k=0,i=0;i<=n;i++)
    {
      int x=1;
      for(j=1;j<=i;j++,k++)
      {
        a[k]=x;
        x=x*(i-j)/j;
      }
    }
    for(i=1,k=0;i<=n;i++)
    {
      for(int r=0;r<=n-i;r++)
      { 
        System.out.print("   ");     
      }
      for(j=0;j<i;j++,k++)
      {
        System.out.print("   "+a[k]+"   ");
      }
      System.out.println();
    }
 
 
 
 
  }
}
