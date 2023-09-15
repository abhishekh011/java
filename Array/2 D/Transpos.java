import java.util.Scanner;
class Test
{
  public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     int a[][]=new int [10][10];
     System.out.println("Enter row");
     int m=sc.nextInt();
     System.out.println("Enter col");
     int n=sc.nextInt();
     int r=0;
     for(int i=0;i<m;i++)
     {
       for(int j=0;j<n;j++)
         {
          System.out.print("a["+i+"]["+j+"]= ");
          a[i][j]=sc.nextInt();
         }
     }
      System.out.println("After Sew");
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
         {
           System.out.print(a[i][j]+"   ");
         }
         System.out.println();
      }
     if(m>n)
     {
       r=m;
     }
     else
     {
      r=n;
     }
     for(int i=0;i<m;i++)
     {
       for(int j=i;j<r;j++)
         {
             int temp=a[i][j];
             a[i][j]=a[j][i];
             a[j][i]=temp;
         }
     }
     System.out.println("Before  Sew");
     for(int i=0;i<n;i++)
     {
       for(int j=0;j<m;j++)
         {
           System.out.print(a[i][j]+"   ");
         }
         System.out.println();
     }
     }
  }
