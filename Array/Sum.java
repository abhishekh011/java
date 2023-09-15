class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("how many number you want sum");
     int n =sc.nextInt();
     int a[]=new int[n];
     int sum=0;
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
      for(int i=0;i<n;i++)
       {
           if(i%2==0)
           sum=sum+a[i];
           else
           sum=sum-a[i];
       }
         System.out.println("sum = "+sum); 
   }
}
               
         
            
