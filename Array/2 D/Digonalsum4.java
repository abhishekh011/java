class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[][]=new int[5][5];
     int m,n;
      System.out.println("Enter The Same Row And Colem");
     System.out.println("row");
      m =sc.nextInt();
      do
      {
      System.out.println("Enter colem only odd");
      n =sc.nextInt();
      System.out.println("\n");
      }
     while(n%2==0);
       System.out.println("Enter Metix Element");
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
      int i,j,sum=0;;
    for( i=0;i<m;i++)
      {
           for( j=0;j<n;j++)
           { 
           int x=n/2
            if (i+j==i+x)
            {
             System.out.print("  "+a[i][j]);
             sum=sum+a[i][j];
            }
            else
             System.out.print("  ");
          // System.out.print(" "+a[i][k]);
            
       }
       System.out.println("");
       }
       System.out.println("Digonel sum = "+sum);
   }
 }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
