import java.util.Scanner;
public class Nmark
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	Scanner sj = new Scanner(System.in);
	System.out.println("Enter");
	int n = sc.nextInt();
	int i=1;
	while(i<=n)
	{
      System.out.println("Enter Roll");
     String a=sj .nextLine();
      System.out.println("Enter course");
     String b=sj .nextLine();
      System.out.println("Enter name");
     String z=sj .nextLine();
      System.out.println("Enter Branch");
     String d=sj .nextLine();
      System.out.println("Enter Fname");
     String x=sj .nextLine();
      System.out.println("Enter Year");
     String f=sj .nextLine();
      System.out.println("Enter Mname");
     String g=sj .nextLine();
      System.out.println("Enter Sem");
     String w=sj .nextLine();
    System.out.println("Physic");
	int p = sc.nextInt();
	System.out.println("Chemistry");
	int c = sc.nextInt();
	System.out.println("Maths");
	int m = sc.nextInt();
	System.out.println("English");
        int e = sc.nextInt();
        System.out.println("Hindi");
        
        int h = sc.nextInt();
        int tot = p+c+m+e+h;
              
       System.out.println("\t\t\t\t\tDavv-Indore\n");
    System.out.println("\tRoll\t:"+a+"\t\t\t\t       Course\t:"+b);
    System.out.println("\tName\t:"+z+"\t\t\t\t       Branch\t:"+d);
    System.out.println("\tFName\t:"+x+"\t\t\t\t       Year\t:"+f);
    System.out.println("\tMName\t:"+g+"\t\t\t\t       Sem:"+w); 
    System.out.println("\t--------------------------------------------------------------");
    System.out.println("\tsubcode\t subname \tmaxmarks\tminimarks\tobtmarks");
    System.out.println("\t  101  \t physics \t  100    \t  33    \t "+p );   
    System.out.println("\t  102  \tchemistry\t  100    \t  33    \t "+c );   
    System.out.println("\t  103  \t  maths  \t  100    \t  33    \t "+m );   
    System.out.println("\t  104  \t English \t  100    \t  33    \t "+e );   
    System.out.println("\t  105  \t  Hindi  \t  100    \t  33    \t "+h );   
    System.out.println("\t--------------------------------------------------------------");
    System.out.println("\t Total\t\t\t\t\t\t\t  "+tot);
        if(p<33)
        {
          if(c<33)
          {
            if(m<33)
            {
              if(e<33)
              {
                if(h<33)
                
                  System.out.println("FAIL in all Subject");
                else{
                  System.out.println("FAIL in four subject");
                  System.out.println("FAIL in phy, chem, math, eng");
                  System.out.println("pass in hindi");}
              }
              else
              {
                 if(h<33)
                   {System.out.println("FAIL in four subject");
                   System.out.println("Fail in Phy, chem, maths, hin");}
                   else{
                      System.out.println("FAIL in three subject");
                      System.out.println("Fail in Phy, Chem, math");
                      System.out.println("pass in eng hindi");}
              }
            }
            else
            {
               if(e<33)
               {
                 if(h<33)
                   System.out.println("fail in phy, chem, eng, hin");
                   else
                       System.out.println("fail in phy, chem, eng");
               }
               else
               {
                  if(h<33)
                    System.out.println("Fail in phy, chem, hin");
                    else
                       System.out.println("fail in phy, chem");
               }  
            }
          }
         else
          {
              if(m<33)
              {
	        if(e<33)
	        {
		  if(h<33)
		    System.out.println("fail in phy, math, hind, eng");
		    else
		    System.out.println("Fail in phy, math, eng");	        
	        }
	        else 
	        {
	           if(h<33)
	             System.out.println("Fail in phy, math, hin");
	              else
	                 System.out.print("Fail in phy, math");
	        }             
              } 
              else
              {
                 if(e<33)
                 {
                   if(h<33)
                     System.out.println("phy, eng, hin");
                     else
                     System.out.println("phy, eng");
                 }
                 else
                 {
                     if(h<33)
                       System.out.println("Fail in phy, hin");
                       else
                           System.out.println("fail in phy");
                 }
              }
                  
          }
             }
             else
             {
                if(c<33)
                {
                  if(m<33)
                  {
                    if(e<33)
                    {
                      if(h<33)
                        System.out.println("fail in chem, math, eng, hin");
                          else
                             System.out.println("fail in chem, math, eng");
                    }
                    else
                    {
                       if(h<33)
                         System.out.println("fail in chem, math, hin");
                          else
                             System.out.println("fail in chem, math");
                    }
                  }
                  else
                  {
                     if(e<33)
                     {
                       if(h<33)
                         System.out.println(" fail chem, hin, eng");
                           else
                              System.out.println("fail in chem, eng");
                     }
                     else
                     {
                        if(h<33)
                          System.out.println("fail in chem, hin");
                          else
                             System.out.println("fail in chem");
                     }
                     
                  }
                }
                else
                {
                   if(m<33)
                   {
                     if(e<33)
                     {
                       if(h<33)
                         System.out.println("fail in maths eng hin");
                          else
                             System.out.println("fail in math, eng");
                     }
                     else
                     {
                        if(h<33)
                          System.out.println("Fail in math, hin");
                            else
                                System.out.println("fail in math");
                     }
                   }
                   else
                   {
                      if(e<33)
                      {
                        if(h<33)
                         System.out.println("fail in eng, hin"); 
                           else
                              System.out.println("Fail in eng");
                          
                      }
                      else
                      {
                         if(h<33)
                           System.out.println(" fail in hin");
                           else
                           {
                               
                               double per = tot/5.0;
                                 System.out.println("total marks = "+tot);
                                 System.out.println("percentage = "+per); 
                               if(per>=60)
                                 System.out.println("pass in First division");
                                 else
                                 {
                                    if(per>=45)
                                      System.out.println("pass in second division");
                                      else
                                          System.out.println("pass in third division");
                                 }
                           }      
                      }
                   }
                   
                }
                }
                
      
   i++;
   }
             } 
	   
	}
