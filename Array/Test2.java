class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
       int a[]=new int[5];
     System.out.println("how many element you want to Enter");
     int n =sc.nextInt();
     System.out.println("Enter element in Array");
     for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      System.out.println("\t Array element are");
     for(int i=0;i<n;i++)
      System.out.println("\ta["+i+"]= "+a[i]);
    }
}
