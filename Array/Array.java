class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("how many element you want to Enter");
     int n =sc.nextInt();
     int a[]=new int[n];
     int i;
     System.out.println("Enter element in array");
     for( i=0;i<n;i++)
     a[i]=sc.nextInt();
     int count=0;
     for( i=0;i<n;i++)
     {           
             if(a[i]==a[0])
             {
               a[0]=a[i];
               count++;
                
             }
            
      }
       System.out.println("\ta["+i+"]="+a[0]);
                System.out.println(count);
     }
     }
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
