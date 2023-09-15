import java.util.Scanner;
class Test 
{
      public static void main(String  args[])
      {
      int total;
      double per;
      int rollNo[]=new int[50];
      int i=0;
      String maxMarks="100",minMarks="33",obtMarks;
      Scanner sc=new Scanner(System.in);
     
      System.out.println("enter the Number");
      int n=sc.nextInt();
      //sc.nextLine();
      while(i<n)
      {
        int k=-1;
     
        while(k!=0)
        {
          System.out.println("enter Rollno");
          rollNo[i]=sc.nextInt();
            for(k=0;k<i;k++)
            {  
              if(rollNo[i]==rollNo[k])
              {
                k=0;
                System.out.println("\tRoll Number Exist\n");
                break;
              }
            }
            if(rollNo[i]!=rollNo[k])
              {
                i++;
                break;
              }
        }  
        
        System.out.println("enter the course");
        sc.nextLine();
        String course=sc.nextLine();
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your father name");
        String fname=sc.nextLine();
     
        System.out.println("enter the branch");
        String branch=sc.nextLine();
     
        System.out.println("enter your sem");
        String sem=sc.nextLine();
       
        System.out.println("enter your Mname");
        String mname=sc.nextLine();
 
        System.out.println("enter the year");
        String year=sc.nextLine();
     int p=-1,c=-1,m=-1,h=-1,e=-1;
   while(h<0||h>100||e<0||e>100||p<0||p>100||c<0||c>100||m<0||m>100)
   {
        System.out.println("Enter the marks of Hindi");
        h=sc.nextInt();
        System.out.println("Enter the marks of English");
        e=sc.nextInt();
        System.out.println("Enter the marks of Physics");
        p=sc.nextInt();
        System.out.println("Enter the marks of Chemistry");
        c=sc.nextInt();
        System.out.println("Enter the marks of Maths");
        m=sc.nextInt();
        
        if(h<0||h>100||e<0||e>100||p<0||p>100||c<0||c>100||m<0||m>100)
        {
          System.out.println("Invalid Marks");
        }
   }  
      System.out.println("\t\t\t\t\t\tDAVV-INDORE\n");
      System.out.print("\t\t\tRoll  :"+rollNo[i]);
      System.out.println("\t\t\t\t       Courses :"+course);
      System.out.print("\t\t\tName  :"+name);
      System.out.println("\t\t\t\t       Branch  :"+branch);
      System.out.print("\t\t\tFName :"+fname);
      System.out.println("\t\t\t\t       Sem     :"+sem);
      System.out.print("\t\t\tMName :"+mname);
      System.out.println("\t\t\t\t       Year    :"+year);
      System.out.println("\n\t\t\tSubCode    SubName    MaxMarks    MinMarks    ObtMarks");
      System.out.println("\t\t\tCs-501     HINDI\t"+maxMarks+"\t     "+minMarks+"\t        "+h);
      System.out.println("\t\t\tCs-502     ENGLISH\t"+maxMarks+"\t     "+minMarks+"\t        "+e);
      System.out.println("\t\t\tCs-503     PHYSICS\t"+maxMarks+"\t     "+minMarks+"\t        "+p);
      System.out.println("\t\t\tCs-504     CHEMISTRY\t"+maxMarks+"\t     "+minMarks+"\t        "+c);
      System.out.println("\t\t\tCs-505     MATH\t\t"+maxMarks+"\t     "+minMarks+"\t        "+m);
      System.out.println("\n");
     
      if(h<33 &&e<33&&p<33&&c<33&&m<33)
          System.out.println("\tFail in all Subjects");
      else if((e<33&&p<33&&c<33&&m<33)||(h<33&&p<33&&c<33&&m<33)||(h<33&&e<33&&c<33&&m<33)||(h<33&&e<33&&p<33&&m<33)||(h<33&&e<33&&p<33&&c<33))
      {
          System.out.println("\tFail in Four Subjects");
          {
          if(e<33&&p<33&&c<33&&m<33)
          {
              //System.out.println("Fail in Four Subjects");  
              System.out.println("\tFail in English Physics Chemistry Math");
          }
          else if(h<33&&p<33&&c<33&&m<33)
          {  
              System.out.println("\tFail in Hindi Physics Chemistry Math");
          }
          else if(h<33&&e<33&&c<33&&m<33)
          {
              System.out.println("\tFail in Four Subjects");  
              System.out.println("\tFail in Hindi English Chemistry Math");
          }
          else if(h<33&&e<33&&p<33&&m<33)
          {
               System.out.println("\tFail in Four Subjects");  
               System.out.println("\tFail in Hindi English Physics Math");
          }

          else if(h<33&&e<33&&p<33&&c<33)  
          {
               System.out.println("\tFail in Four Subjects");  
               System.out.println("\tFail in Hindi English Physics Chemistry");
          }        
         
        }
     
      }   //4 sub
       
      else if((h<33&&e<33&&p<33)||(h<33&&c<33&&m<33)||(e<33&&h<33&&p<33)||(e<33&&c<33&&m<33)||(p<33&&h<33&&e<33)||(p<33&&c<33&&m<33)||(c<33&&h<33&&e<33)||(c<33&&p<33&&m<33)||(m<33&&h<33&&e<33)||(m<33&&p<33&&c<33))
      {
           System.out.println("\tFail in three Subjects");
           {
              if(h<33&&e<33&&p<33)
                 System.out.println("\tFail in Hindi English Physics");
              else if(h<33&&c<33&&m<33)
                 System.out.println("\tFail in Hindi Chemistry Math");
              else if(e<33&&h<33&&p<33)
                   System.out.println("\tFail in Hindi Egglish Physics");
              else if(e<33&&c<33&&m<33)  
                    System.out.println("\tFail in English Chemistry Math");  
              else if(p<33&&h<33&&e<33)
                    System.out.println("\tFail in Hindi English Physics");
              else if(p<33&&c<33&&m<33)  
                    System.out.println("\tFail in Physics Chemistry Math");
              else if(c<33&&h<33&&e<33)
                    System.out.println("\tFail in Hindi Chemistry English");
              else if(c<33&&p<33&&m<33)
                    System.out.println("\tFail in Physics Chemistry Math");
              else if(m<33&&h<33&&e<33)
                    System.out.println("\tFail in Hindi English Math");
              else if(m<33&&p<33&&c<33)
                    System.out.println("\tFail in Physics Chemistry Math");
           }
      }  //3 sub
      else if((h<33&&e<33)||(h<33&&p<33)||(h<33&&c<33)||(h<33&&m<33)||(e<33&&p<33)||(e<33&&c<33)||(e<33&&m<33)||(p<33&&c<33)||(p<33&&m<33)||(c<33&&m<33))
      {
          System.out.println("\tFail in two Subjects");
          {
             if(h<33&&e<33)
                 System.out.println("\tFail in Hindi English");
             else if(h<33&&p<33)
                 System.out.println("\tFail in Hindi Physics");
             else if(h<33&&c<33)
                 System.out.println("\tFail in Hindi Chemistry");
             else if(h<33&&m<33)
                 System.out.println("\tFail in Hindi Math");
             else if(e<33&&p<33)
                 System.out.println("\tFail in English Physics");
             else if(e<33&&c<33)
                 System.out.println("\tFail in English Chemistry");
             else if(e<33&&m<33)
                  System.out.println("\tFail in English Math");
             else if(p<33&&c<33)
                  System.out.println("\tFail in Physics Chemistry");
             else if(p<33&&m<33)
                  System.out.println("\tFail in Physics Math");
             else if(c<33&&m<33)
                  System.out.println("\tFail in Chemistry Math");
          }
      } //2 sub
      else if(h<33||e<33||p<33||c<33||m<33)
      {
           System.out.println("\tFail in one Subjects");  
           {
               if(h<33)
                  System.out.println("\tFail in Hindi");
               else if(e<33)
                  System.out.println("\tFail in English");
               else if(p<33)
                  System.out.println("\tFail in Physics");
               else if(c<33)
                  System.out.println("\tFail in Chemistry");
               else if(m<33)
                  System.out.println("\tFail in Math");
           }
           


      }  //1sub
      else
      {
            total=h+e+p+c+m;                    
            per=total/5.0;
            System.out.print("\t\t\tTotal Marks="+total);
            System.out.println("\t\tPercentage="+per);
            if(per>=60)
               System.out.println("\t\t\tPass in First Division");
            else if(per>=45)
               System.out.println("\t\t\tPass in Second Division");
            else
               System.out.println("\t\t\tPass in third Division");
                                                       
       }   
        
        
        
        
        
        i++;
          //sc.nextLine();
       }//w
    }
}
