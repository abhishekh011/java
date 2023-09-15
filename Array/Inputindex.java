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
       a[i]=sc.nextInt();
     }
     System.out.println("Enter element in array");
        int m=sc.nextInt();
     System.out.println("Enter index in array");
        int o=sc.nextInt();
     for( i=n;i>o;i--)
     {           
        a[i]=a[i-1];             
     }
        a[o]=m;
       for( i=0;i<=n;i++)
       {
        //a[i]=sc.nextInt();
        
         System.out.println("\ta["+i+"]="+a[i]);
       }
     }
     }
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
