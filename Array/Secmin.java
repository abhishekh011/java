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
     int b=a[0],sec=a[1];
     for(int i=0;i<n;i++)
     {      
             if(b>a[i])
             {
                sec=b;
                b=a[i];
              }
              else if(a[i]<sec&&a[i]>b)
                  {
                      sec=a[i];
                  }
              
      }
      
       System.out.println("second Min nunber");
      System.out.println(sec); 
       
     }
     }
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
