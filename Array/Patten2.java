class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[50];
     for(int i=0;i<n;i++)
           {   
              a[i]=sc.nextInt();
            
           }
    for(int i=n;i>=0;i--)
      {
         for(int j=0;j<=i;j++)
           {   
           System.out.print("  "+a[i]);
            
           }
           System.out.println(" ");
       }
   }
 }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
