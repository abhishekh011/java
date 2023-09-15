class Test
{
  public static void main(String[]args)
  {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("how many element you want to Enter");
     int n =sc.nextInt();
     int a[]=new int[20];
     int i;
     for( i=0;i<n;i++)
     {
       System.out.print("a["+i+"] = ");
       a[i]=sc.nextInt();
     }
     System.out.println("Enter index in array");
     int ind=sc.nextInt();
     System.out.println("Enter value you want to increase");
     int inc=sc.nextInt();
     for( i=ind;i>=ind;i--)
     {           
        a[i]=a[i]+inc;             
     }
       for( i=0;i<n;i++)
       {
        //a[i]=sc.nextInt();
        
         System.out.println("\ta["+i+"]="+a[i]);
       }
   }                                                                                                                                                     
}

