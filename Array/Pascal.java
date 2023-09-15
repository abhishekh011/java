class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("how many element you want to Enter");
     int n =sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter element in array");
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
     for(int i=1;i<n;i++)
     {
     for(int j=0;j<=n-i;j++)
     { 
     System.out.print(" ");     
      }
      int x=1;
      for(int k=1;k<=i;k++)
      {
      System.out.print(x+" ");
      x=x*(a[i]-k)/k;
      
      }
      System.out.println("");
     }
     }
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
