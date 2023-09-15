class Test
{
  public static void main(String args[])
  {
  int i=1,j=1;
  
    for(i=1;i<=11;i++)
      {
        for(j=1;j<=11;j++)
        {
          if(j==5&&i==5||i==2&&j==4||i==3&&j==3||i==4&&j==8||i==5&&j==3)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
  }
}
