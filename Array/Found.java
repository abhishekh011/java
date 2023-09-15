class Test
{
  public static void main(String[]args)
   {
   boolean b=false;
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[]=new int[20];
     System.out.println("how many number you want in array");
     int n =sc.nextInt();
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     
      System.out.println("enter the item which you want to search");
      int item=sc.nextInt();
      for(int i=0;i<n;i++)
       {
          if(a[i]==item)
          b=true;
       }
         if(b==true)
           System.out.println("item is found");
           else
           System.out.println("item not found"); 
   }
}
               
         
            
