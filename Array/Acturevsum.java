import java.util.Scanner;
 class Test
 //print array element in reverse  and sum of actual array and reverse array
 {
   public static void main(String arggs [])
   {
      Scanner sc = new Scanner(System.in);
      int a[]=new int [5];
      int b[]=new int [5];
      int c[]=new int [5];
      System.out.println("How many element want to insert ");
      int n= sc.nextInt();
      System.out.println("\t Enetr element is array");
      for(int i=0;i<n;i++)
      a[i]= sc.nextInt();
      System.out.println("\t Actual Array element are :");
      for(int i=0;i<n;i++)
      System.out.println("a["+i+"]"+"="+a[i]);
      //store array in b 
      for(int i=0;i<n;i++)
      b[i]=a[i];
      for(int i=0;i<n/2;i++)
      {	    int temp=b[i];
            b[i]=b[n-(i+1)];
            b[n-(i+1)]=temp;
      }
      System.out.println("\t Revers Array element are :");
       
        for(int i=0;i<n;i++)
         System.out.println("b["+i+"]"+"="+b[i]);
        
      int i;
        //sum of actual array and revers array
       for( i=0,c[i]=0;i<n;i++)
       {
         c[i]=a[i]+b[i];
       }
       System.out.println("\t sum of Actual array and Revers Array element are :");
        for( i=0;i<n;i++)
        System.out.println("c["+i+"]"+"="+c[i]);
   }
 }
