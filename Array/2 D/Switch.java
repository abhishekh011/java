import java.util.Scanner;
class Test
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     int a[][]=new int[5][5];
    System.out.println("Your Choices are");
    System.out.println("1 for right Digonal and sum");
    System.out.println("2 for Left Digonal");
    System.out.println("3 for mid Digonal");
    System.out.println("4 for all Digonal sum");
    System.out.println("\n5 squar for right Digonal");
    System.out.println("\t1  2  3  4  5 ");
    System.out.println("\t6           10  ");
    System.out.println("\t11          15"); 
    System.out.println("\t16          20  ");
    System.out.println("\t21 22 23 24 25");
    System.out.println("\n6 for Squar internal");
    System.out.println("\t            ");
    System.out.println("\t  7  8  9   "); 
    System.out.println("\t  12 13 14  ");
    System.out.println("\t  17 18 19  ");
    System.out.println("\t            ");
    System.out.println("7 for Right And Left Digonal print and sum");
    System.out.println("Enter your Choice");
    int ch=sc.nextInt();
     int m,n;
      int i,j,k,sum=0;  
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
     for( i=0;i<m;i++)
      {
         for(j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
    System.out.println("actual metix");
  
    for( i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
          
           }
           System.out.println(); 
      }
      switch(ch)
      {
     
      // ("1 for right Digonal and sum");
  case 1:
     
       for( i=0;i<m;i++)
        {
         for( j=0;j<n;j++)
            {   
              System.out.print("  ");
             if(i==j)
             {
               System.out.print(" "+a[i][j]);
               sum=sum+a[i][j];
             }
            else
             {
               System.out.print(" ");
             }
           }
            System.out.println("");
         }
         System.out.println("Digonel sum = "+sum);
         break;
        //("1 for Left Digonal and sum");
   case 2:
        
       for( i=0;i<m;i++)
      {
           for( j=0;j<n;j++)
           {
            if ((i+j)==(n-1))
            {
             System.out.print("  "+a[i][j]);
             sum=sum+a[i][j];
            }
            else
             System.out.print("  ");
       }
       System.out.println("");
       }
       System.out.println("Digonel sum = "+sum);
       break;
        //("1 for Mid Digonal and sum");
   case 3:
       
    for( i=0;i<m;i++)
      {
           for( j=0;j<n;j++)
           { 
           int x=n/2;
            if (i+j==i+x)
            {
             System.out.print("  "+a[i][j]);
             sum=sum+a[i][j];
            }
            else
             System.out.print("  ");
            
       }
       System.out.println("");
       }
       System.out.println("Digonel sum = "+sum);
       break;
         case 4:
        
       for( i=0;i<m;i++)
      {
           for( j=0;j<n;j++)
           {
                 int x=n/2;
            if ((i+j)==(n-1)||i==j||i+j==i+x)
            {
             System.out.print("  "+a[i][j]);
             sum=sum+a[i][j];
            }
            else
             System.out.print("   ");
       }
       System.out.println("");
       }
       System.out.println("Digonel sum = "+sum);
       break;
       case 5:
        for( i=0;i<m;i++)
      {
       
           for( k=0;k<n;k++)
           {
           if((i==0&&k<n)||(i==m-1&&k<n)||(k==0&&i<n-1)||(k==n-1&&i<m))
           {
           
           System.out.print(" "+a[i][k]);
           sum+=a[i][k];
           }
           else
           {
           System.out.print("  ");
           }
       }
       System.out.println("");
       }
       System.out.println("Digonel sum = "+sum);
       break;
     case 6:
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
       
           }
       }
       System.out.println("");
       }
       System.out.println("Digonel sum = "+sum);
       break;
   }
 }
 }  
   

