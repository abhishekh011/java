import java.util.Scanner;
 class Test
 {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      int a[][]=new int [5][5];
      int b[][]=new int [5][5];
      int c[][]=new int [5][5];
      int m,n,col,row,i,j;
      System.out.println("Enetr the Dimention of 1 array :");
       m= sc.nextInt();
       n= sc.nextInt();
       System.out.println("Enetr the element of the 1  metrix matrix:");
       
      for( i=0;i<m;i++)
         {
            for(j=0;j<n;j++)
             { 
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]=sc.nextInt();
             }
          }
            System.out.println("Enetr the Dimontion of 2 array :");
            row= sc.nextInt();
            col= sc.nextInt();
          if(row!=m||col!=n)
          {
            System.out.println("Please enter sem row and col");
            System.exit(0);
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
            System.out.println("Your choices are");
            System.out.println("1 for add");
            System.out.println("2 for sub");
            int ch = sc.nextInt();
     switch(ch)
     {
           case 1:
            System.out.println("Sum of A matrix and B");
           for( i=0;i<m;i++)
             {
                for(j=0;j<n;j++)
                 {
                     c[i][j]=a[i][j]+b[i][j];
                     System.out.print("\t"+c[i][j]);
                 }
                System.out.println(" ");
               }
             break;
             case 2:
                System.out.println("sub of A matrix and B");
              for( i=0;i<m;i++)
                 {
                     for(j=0;j<n;j++)
                      {
                        c[i][j]=a[i][j]-b[i][j];
                         System.out.print("\t"+c[i][j]);
                      }
                      System.out.println(" ");
                 }
               break;
               default:
               System.out.println("This program not for you");
       }   
    }
 }
