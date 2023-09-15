class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("how many number you want rev");
     int n =sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
         {
           int rev=0,r=0;
           while(a[i]>0)
            {  
              r=a[i]%10;
              rev=rev*10+r;
              a[i]=a[i]/10;
             }
           System.out.println("rev = "+rev); 
         }
    }
}         
         
            
