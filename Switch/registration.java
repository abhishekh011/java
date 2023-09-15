import java.lang.String;
import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  System.out.println("Name    : ");        
        String y=sc.nextLine();
  System.out.println("Email   : ");
        String x=sc.nextLine();
  System.out.println("Password:");
        int z=sc.nextInt();
 if(z==12345){     
  System.out.println("\t______________________________");      
  System.out.println("\t\tFACEBOOK                    ");
  System.out.println("\t\t LOGIN                      ");              
  System.out.println("\tName     : "+y+"\t            ");
  System.out.println("\tEmail    : "+x+"\t            ");      
  System.out.println("\tPassword : "+z+"\t            ");      
  
  System.out.println("\tyour login was Successfull    ");
  }
  else
  {
  System.out.println("\t\tInvalid passsword           ");
  }
  System.out.println("\t______________________________");   
  }   
  }
