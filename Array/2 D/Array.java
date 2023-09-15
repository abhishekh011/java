class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[][]=new int[3][3];
     System.out.println("row");
     int m =sc.nextInt();
      System.out.println("colem");
     int n =sc.nextInt();
     
     for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
    System.out.println("actual metix");
    for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
           }
           System.out.println(); 
      }
    for(int i=0;i<m;i++)
      {
         for(int j=i+1;j<n;j++)
           {    
             int temp=a[i][j];
             a[i][j]=a[j][i];
             a[j][i]=temp;
           }
       }
        System.out.println("Transport metix");
    for(int i=0;i<m;i++)
       {
         for(int j=0;j<n;j++)
            { 
              System.out.print("\t"+a[i][j]); 
            }
           System.out.println(); 
       }
   }
 }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
