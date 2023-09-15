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
      System.out.println("\n");
      }
     while(m!=n);
       System.out.println("Enter Metix Element");
     for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++)
          { 
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
      int i,j,k,sum=0;;
    for( i=0;i<m;i++)
      {
       
           for( k=0;k<n;k++)
           {
           if((i==0&&k<n)||(i==m-1&&k<n)||(k==0&&i<n-1)||(k==n-1&&i<m))
           {
             System.out.print("  ");
          
           }
           else
           {
           System.out.print(" "+a[i][k]);
             sum+=a[i][k];
          //  sum=sum+a[i][k];
           }
       }
       System.out.println("");
       }
       System.out.println("Digonel sum = "+sum);
   }
 }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
