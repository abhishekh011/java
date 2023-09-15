class Test
{
   
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[][]=new int[5][5];
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
        
           int max = a[0][0];
	   int max2 =a[0][1]; 
	  for(int i=0; i<n; i++)
	  {
	     for(int j=0; j<m; j++)
	     {
	        if(max>a[i][j])
	        {
	          max2  = max;
	          max = a[i][j];
	        }
	        else if(max==max2||(max<a[i][j])&&(max2>a[i][j]))
	              max2 = a[i][j];
	     }
	     }
      System.out.println("Second min element of metix = "+sec);
      

   }
 }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
