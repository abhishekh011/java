import java.util.Scanner;
 class Test 
 {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      int a[][]=new int [5][5];
      int b[][]=new int [5][5];
      int c[][]=new int [5][5];
      int m,n,col,row,i,j,k;
      //do
      //{
      System.out.println("Enetr the Dimention of 1 array :");
       m= sc.nextInt();
       n= sc.nextInt();
      System.out.println("Enetr the Dimontion of 2 array :");
       row= sc.nextInt();
       col= sc.nextInt();
       //}
       //while(n!=row);
       if(n==row)
       {
     System.out.println("Enetr the element of the 1  metrix matrix:");
      for( i=0;i<m;i++)
         {
            for(j=0;j<n;j++)
             { 
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]=sc.nextInt();
             }
          }
         System.out.println("Enetr the element of the 2  matrix:");
       for( i=0;i<row;i++)
          {
             for(j=0;j<col;j++)
             {
               System.out.print("a["+i+"]["+j+"]= ");
               b[i][j]=sc.nextInt();
             }
          }
          System.out.println("MATRIX A  ");
       for( i=0;i<m;i++)
         {
              for(j=0;j<n;j++)
              {
               System.out.print(" "+a[i][j]);
              }
               System.out.println(" ");
          }
            System.out.println("MATRIX B ");
       for( i=0;i<row;i++)
          {
             for(j=0;j<col;j++)
              {
                System.out.print(" "+b[i][j]);
              }
                 System.out.println(" ");
            }
         for(i=0;i<m;i++)
          {
             for (j=0;j<col;j++)
             { 
               for(k=0,c[i][j]=0;k<n;k++)
               {
                  c[i][j]=c[i][j]+a[i][k]*b[k][j];
               }
             }
          }
         System.out.println("multiplication");
         for( i=0;i<m;i++)
          {
             for(j=0;j<col;j++)
              {
                System.out.print(" "+c[i][j]);
              }
                 System.out.println(" ");
            }
         }
         else
         System.out.println("multi not posible");
    }   
 }
