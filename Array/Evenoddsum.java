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
     int b=0,c=0,esum=0,osum=0;
     for(int i=0;i<n;i++)
     {      
           if(a[i]%2==0)
             {
              esum=esum+a[i];
                 c++;
             }
           else
             {
              osum=osum+a[i];
                  b++;                
             }
      }
       System.out.println("Even =  "+c);
       System.out.println("Odd = "+b); 
       System.out.println("Even esum =  "+esum);
       System.out.println("Odd osum = "+osum); 
    }
}
