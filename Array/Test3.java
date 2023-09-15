class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
      int a[]=new int [5];
       System.out.println("Enter element of array");
       for(int i=0;i<a.length;i++)
           a[i]=sc.nextInt();
         System.out.println("\t Array element are");
       for(int i=0;i<a.length;i++)
          System.out.println("\t  a["+i+"]= "+a[i]);
          }
          }
