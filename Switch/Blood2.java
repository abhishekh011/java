import java.util.Scanner;
import java.lang.String;
class Blood2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    int a,b,c,d;
      System.out.println("Your choices are");
      System.out.println("1 for 'A+'\n2 for 'o+'");
      System.out.println("3 for 'B+'\n4 for 'AB+'"); 
      System.out.println("5 for 'A-'\n6 for 'B-'");
       System.out.println("7 for 'O-'\n8 for 'AB-'");
      System.out.println("Enter your choice");  
        int ch = sc.nextInt();
        
        
      switch(ch)
      {
            case 1:
             System.out.println("Enter your requirement in ml ");
                  b = sc.nextInt();
                  c = b*10;
             System.out.println("totel payment is: "+c );    
              System.out.println("Enter Payment");
                  d = sc.nextInt();
                
            if(d<c)
            {
                   int e = d/10;
                 System.out.println("This payment onli"+e+"ml blood" );
                 }
                 else if (d>c){
                      int x = d-c;
                       System.out.println("your payment is  "+x+" over"); 
                       }
                       else                        
                       System.out.println("done your payment");
                    break;
            case 2:
                
             System.out.println("Enter your requirement in ml ");
                 b = sc.nextInt();
                 c = b*8;
             System.out.println("totel payment is: "+c );    
              System.out.println("Enter Payment");
                 d = sc.nextInt();
                 if(d<c)
            {
                   int e = d/8;
                 System.out.println("This payment onli"+e+"ml blood" );
                 }
                 else if (d>c){
                      int x = d-c;
                       System.out.println("your payment is  "+x+" over"); 
                       }
                       else                        
                       System.out.println("done your payment");
                    break;
             case 3:
      
             System.out.println("Enter your requirement in ml ");
                 b = sc.nextInt();
                 c = b*6;
             System.out.println("totel payment is: "+c );    
              System.out.println("Enter Payment");
                 d = sc.nextInt();
                  if(d<c)
            {
                   int e = d/6;
                 System.out.println("This payment onli"+e+"ml blood" );
                 }
                 else if (d>c){
                      int x = d-c;
                       System.out.println("your payment is  "+x+" over"); 
                       }
                       else                        
                       System.out.println("done your payment");
                    break;
             case 4:
                
             System.out.println("Enter your requirement in ml ");
                  b = sc.nextInt();
                  c = b*9;
             System.out.println("totel payment is: "+c );    
              System.out.println("Enter Payment");
                  d = sc.nextInt();
                 if(d<c)
            {
                   int e = d/9;
                 System.out.println("This payment onli"+e+"ml blood" );
                 }
                 else if (d>c){
                      int x = d-c;
                       System.out.println("your payment is  "+x+" over"); 
                       }
                       else                        
                       System.out.println("done your payment");
                    break;
               case 5:
      
             System.out.println("Enter your requirement in ml ");
                 b = sc.nextInt();
                 c = b*12;
             System.out.println("totel payment is: "+c );    
              System.out.println("Enter Payment");
                 d = sc.nextInt();
                
            if(d<c)
                 System.out.println("invalid payment" );
                 else 
                    System.out.println("done your payment");
                    break;
              case 6:
                
             System.out.println("Enter your requirement in ml ");
                  b = sc.nextInt();
                  c = b*15;
             System.out.println("totel payment is: "+c );    
              System.out.println("Enter Payment");
                  d = sc.nextInt();
                
            if(d<c)
                 System.out.println("invalid payment" );
                 else 
                    System.out.println("done your payment");
                    break;
               case 7:              
      
             System.out.println("Enter your requirement in ml ");
                  b = sc.nextInt();
                  c = b*20;
             System.out.println("totel payment is: "+c );    
              System.out.println("Enter Payment");
                  d = sc.nextInt();
                
            if(d<c)
                 System.out.println("invalid payment" );
                 else 
                    System.out.println("done your payment");
               break;                    
               case 8:
                
             System.out.println("Enter your requirement in ml ");
                  b = sc.nextInt();
                  c = b*11;
             System.out.println("totel payment is: "+c );    
              System.out.println("Enter Payment");
                  d = sc.nextInt();
                
            if(d<c)
                 System.out.println("invalid payment" );
                 else 
                    System.out.println("done your payment");
              break ; 
              }    
   }   
      
}      
