class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
   
     int a[][]={{1,2,3,4,5,6},{1,2,3,4},{9,8,7}};
   
     
      for(int  x[]:a)
      {
         for  ( int y:x)
          {
           System.out.print("  "+y);
          }
            System.out.println();
      }
   }
}
