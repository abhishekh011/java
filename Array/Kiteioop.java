 class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     for(int i=1;i<=11;i++)
     {
      for(int j=1;j<=9;j++)
      {
       if((i==4||j==5)
||(i==1&&j>3&&j<7)||(i==2&&j==3)||(i==2&&j==7)||(i==3&&j==2)||(i==3&&j==8)||(i==5&&j==1)||(i==5&&j==9)||(i==6&&j==2)||(i==6&&j==8)||(i==7&&j==3)||(i==7&&j==7)||(i==8&&j==4)||(i==8&&j==6)||(i==9&&j>3&&j<7)||(i==10&&j>3&&j<7)||(i==11&&j==3)||(i==11&&j==5)||(i==11&&j==7))
       {
        System.out.print(" *");
       }
       else
       {
        System.out.print("  ");
       }
      }
      System.out.println();
     }
  }   
   }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
