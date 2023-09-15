class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("how many element you want to Enter");
     int n =sc.nextInt();
     int a[]=new int[n];
     int i,j,k;
     System.out.println("Enter element in array");
     for( i=0;i<n;i++)
     a[i]=sc.nextInt();
     int count=0,c=0;
     for( i=0;i<n;i++)
     { 
       for(count=1,j=i;j<(n-1);j++)
         for(c=0,k=(i-1);k>=0;k--)
         {
           if(a[i]==a[k])
           {
             c++;
             break;
           }
         }        
             if(c==0&&a[i]==a[j+1])
             {
               count++;
             }
       }
       if(count!=1)
       {
       System.out.println(a[i]+" = "+count+" time");
       }
      }
     }
