class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[][]=new int[5][5];
     int m,n;
    
     do
     {
      System.out.println("Enter The Same Row And Colem");
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
      }
     while(m!=n);
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
      int i,j,k;
    for( i=0;i<m;i++)
      {
         for( j=0;j<i;j++)
           {   
           System.out.print("  ");
           }
           for( k=i;k==i;k++)
           {
           System.out.print(" "+a[i][k]);
       }
       System.out.println("");
       }
   }
 }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
