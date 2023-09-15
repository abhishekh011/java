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
     int b=a[0];
     for(int i=0;i<n;i++)
     {           
             if(a[i]>150&&a[i]<250)
                System.out.println("\ta["+i+"]="+a[i]);
      }
     }
     }
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
