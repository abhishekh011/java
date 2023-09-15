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
     for(int i=0;i<n;i++)
     System.out.println("\ta["+i+"]= "+a[i]);
    /* int a[]=new int[5];
     System.out.println("how many element you want to Enter");
     int n =sc.nextInt();
     System.out.println("Enter element in Array");
     for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      System.out.println("\t Array element are");
     for(int i=0;i<n;i++)
      System.out.println("\ta["+i+"]= "+a[i]);*/
     
     /* int a[]=new int [5];
       System.out.println("Enter element of array");
       for(int i=0;i<a.length;i++)
           a[i]=sc.nextInt();
         System.out.println("\t Array element are");
       for(int i=0;i<a.length;i++)
          System.out.println("\t  a["+i+"]= "+a[i]);*/
    /* int a[]=new int[5];
      a[0]=7;
      a[1]=8;
      a[2]=7;
      a[3]=6;
      a[4]=5;
         for(int i=0;i<5;i++)
          System.out.println("\ta["+i+"]= "+a[i]);*/
    //int a[]=new int[5];
    /*a[0]=9;
    a[1]=8;
    a[2]=7;
    a[3]=6;
    a[4]=5;
       System.out.println("\t"+a[0]);
       System.out.println("\t"+a[1]);
       System.out.println("\t"+a[2]);
       System.out.println("\t"+a[3]);
       System.out.println("\t"+a[4]);*/
       
   }
}
