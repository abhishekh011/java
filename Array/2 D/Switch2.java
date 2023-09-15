import java.util.Scanner;
  class A{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		
		System.out.println("press 1 for all sum " );
		System.out.println("press 2 for asc des row col");
		System.out.println("press 3 for asc col");
		System.out.println("press 4 for max element");
		System.out.println("press 5 for min element");
		System.out.println("press 6 for row asc");
		System.out.println("press 7 for Sec max element");
		System.out.println("press 8 for Sec min element");
                int ch=sc.nextInt();
	        
	        int a[][]=new int[5][5];
	        int m,n;
	        int i,j,k;
	        int sec=0,b=a[0][0];
	        switch(ch){
	        
	        case 1:
	            
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
     
     for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
     System.out.println("\tactual metix");
     for( i=0;i<m;i++)
       {
           for( j=0;j<n;j++)
            { 
             System.out.print("\t"+a[i][j]); 
            } 
             System.out.println(); 
        }
        int sum=0;
      for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
               sum+=a[i][j];
          }
      }
      System.out.println("sum  element of metix = "+sum);
      
      break;
   
   
	        
	        case 2:
	         
      
      System.out.println("Enter The Row And Colem");
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
      System.out.println("\n");
    
      System.out.println("Enter Metix Element");
       for( i=0;i<m;i++)
        {
          for( j=0;j<n;j++)
           { 
              System.out.print("a["+i+"]["+j+"] = ");
             a[i][j]=sc.nextInt(); 
           }
        }
    
         System.out.println("actual metix");
        for( i=0;i<m;i++)
        {
           for( j=0;j<n;j++)
           { 
             System.out.print("\t"+a[i][j]); 
           }
           System.out.println(); 
        }
       
    for( i=0;i<n;i++)
      {
         for( j=0;j<(m-1);j++)
         {  
           for(k=0;k<(m-1);k++)
           {
           if(a[k][i]<a[k+1][i]) 
             {
               int temp=a[k+1][i];
               a[k+1][i]=a[k][i];
               a[k][i]=temp; 
             }
           }
         } 
       System.out.println("");
       }
      for( i=0;i<(m);i++)
       {
           for( j=0;j<(n-1);j++)
           {  
             for(k=0;k<(n-1);k++)
             {
              if(a[i][k]>a[i][k+1]) 
              {
               int temp=a[i][k+1];
               a[i][k+1]=a[i][k];
               a[i][k]=temp; 
             }
           }
         } 
       System.out.println("");
       }
        for( i=0;i<m;i++)
     {
         for( j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
          
           }
           System.out.println(); 
      }
   
      break;
	        
	        case 3:
	         
      
      System.out.println("Enter The Row And Colem");
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
      System.out.println("\n");
     
       System.out.println("Enter Metix Element");
     for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
    System.out.println("actual metix");
  
    for( i=0;i<m;i++)
     {
         for( j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
          
           }
           System.out.println(); 
      }
       
    for( i=0;i<n;i++)
      {
         for( j=0;j<(m-1);j++)
         {  
           for(k=0;k<(m-1);k++)
           {
           if(a[k][i]>a[k+1][i]) 
             {
               int temp=a[k+1][i];
               a[k+1][i]=a[k][i];
               a[k][i]=temp; 
             }
           }
         } 
       System.out.println("");
       }
        for( i=0;i<m;i++)
     {
         for( j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
          
           }
           System.out.println(); 
      }
      break;
	        
	        case 4:
	         
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
     
     for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
     System.out.println("actual metix");
     for( i=0;i<m;i++)
       {
           for( j=0;j<n;j++)
            { 
             System.out.print("\t"+a[i][j]); 
            } 
             System.out.println(); 
        }
      for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
             if(a[i][j]>a[0][0])
                  a[0][0]=a[i][j];
          }
      }
      System.out.println("max element of metix = "+a[0][0]);
      break;
	        
	        case 5:
	            
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
     
     for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
     System.out.println("actual metix");
     for( i=0;i<m;i++)
       {
           for( j=0;j<n;j++)
            { 
             System.out.print("\t"+a[i][j]); 
            } 
             System.out.println(); 
        }
      for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
             if(a[i][j]<a[0][0])
                  a[0][0]=a[i][j];
          }
      }
      System.out.println("Min element of metix = "+a[0][0]);
      break;

	        
	        case 6:
	           
      
      System.out.println("Enter The Same Row And Colem");
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
      System.out.println("\n");
       System.out.println("Enter Metix Element");
     for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
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
       
    for( i=0;i<(m);i++)
      {
         for( j=0;j<(n-1);j++)
         {  
           for( k=0;k<(n-1);k++)
           {
           
             if(a[i][k]>a[i][k+1]) 
             {
               int temp=a[i][k+1];
               a[i][k+1]=a[i][k];
               a[i][k]=temp; 
             }
           }
         } 
       System.out.println("");
       }
        for( i=0;i<m;i++)
     {
         for( j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
          
           }
           System.out.println(); 
      }
       break;
       	        
	        case 7:
	         
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
     
     for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
     System.out.println("actual metix");
     for( i=0;i<m;i++)
       {
           for( j=0;j<n;j++)
            { 
             System.out.print("\t"+a[i][j]); 
            } 
             System.out.println(); 
        }
 
      for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
                if(b<a[i][j])
             {
                sec=b;
                b=a[i][j];
              }
              else if(a[i][j]<sec&&a[i][j]>b)
                  {
                      sec=a[i][j];
                  }
          }
      }
      System.out.println("Second max element of metix = "+sec);
      break;
	        
	        case 8:
      System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
     
     for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
     System.out.println("actual metix");
     for( i=0;i<m;i++)
       {
           for( j=0;j<n;j++)
            { 
             System.out.print("\t"+a[i][j]); 
            } 
             System.out.println(); 
        }
       
      for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
                if(b>a[i][j])
             {
                sec=b;
                b=a[i][j];
              }
              else if(a[i][j]<sec&&a[i][j]>b)
                  {
                      sec=a[i][j];
                  }
          }
      }
      System.out.println("Second max element of metix = "+sec);
      
	        
	        default:
	        System.out.println("wrong coice");
	        break;
	        }
	
	
	}	

}
