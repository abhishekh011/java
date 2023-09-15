class Test
{
  public static void main(String[]args)
  {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("how many element you want to Enter");
     int n =sc.nextInt();
     int a[]=new int[n];
     int temp;
     System.out.println("Enter element in array");
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     
     System.out.println("befor sweping");
     for(int i=0;i<n;i++)
     System.out.println("\ta["+(i)+"]="+a[i]);

     for(int i=0;i<n/2;i++)
       {
         temp=a[i];
         a[i]=a[n-i-1];
         a[n-i-1]=temp;
       }
        System.out.println("after sweping");
         for(int i=0;i<n;i++)
         System.out.println("\ta["+(i)+"]="+a[i]);
   }
}
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
