import java.util.Scanner;
class Loan {
    public static void main(String[] args) 
    {
    //This made by Abhishek 
        
           Scanner sc=new Scanner(System.in);
           Scanner sj=new Scanner(System.in);
       
           
           String d="",e="",f="",g="",h="",i="",j="",k="",l="",m="",n="";
          
                         System.out.println("\t\tFILL YOUR LOAN APPLICATION FORM");            		
        		 System.out.print("\t\tName:");
        		 d=sj.nextLine();
	        	 
	        	 System.out.print("\t\tDOB:");
		         e=sj.nextLine();
		         
		         System.out.print("\t\tPhone no:");
		         f=sj.nextLine();
		         
		         System.out.print("\t\temail address:");
		         g=sj.nextLine();
		         
		         System.out.print("\t\tStreet address:");
		         h=sj.nextLine();
		         
		         System.out.print("\t\tCity:");
		         i=sj.nextLine();
		         
		         System.out.print("\t\tRegion:");
		         j=sj.nextLine();
		         
		         System.out.print("\t\tpostal:"); 
		         k=sj.nextLine();
		         
		         System.out.print("\t\tCountry:");
		         l=sj.nextLine();
		         
		         System.out.print("\t\tJob title:");
		         m=sj.nextLine();
		         
		         System.out.print("\t\tEmployer name:");
		         n=sj.nextLine();
		         
	      		int z=1;
	       
	       		 System.out.println("\t\033[31m # Lone Used For"); 
	      		 System.out.println("\t\033[32m # Press 1 for Personal Loan");
	       		 System.out.println("\t\033[33m # Press 2 for Home Loan");
	       		 System.out.println("\t\033[34m # Press 3 for Car Loan");
	       		 int a=0,b=0,mn=0;
	       		  double prin=0,t=0,emi=0,r=0,r1=0,r2=0,res=0,r3=0,si=0;
	       		 int ch = sc.nextInt();
	       		 do{
	       		 
	      		 switch(ch)
	       		  {
	       	  	    case 1:
	       	                   System.out.println("\t\033[32m Enetr Your Loan Amount");
	       	                   a=sc.nextInt();
	       	                   System.out.println("\tEnter Your Anuual Income");
	       	                   b=sc.nextInt();
	       	                   mn=b/12;
	       	                   System.out.println("\tYour Monthly Income is = "+mn+" Ruppe/-");
	       	                   if(mn>=10000&&a>=50000)
	       	                   {
	       	                     
	       	                      System.out.println("\tCalculate the emi of your Loan");
	       	                     
                                      System.out.println("Enter the Amount");
          			      prin = sc.nextDouble();
          			      System.out.println("Enter the Time in Month");
          			      t = sc.nextDouble();
            			      System.out.println("Enter the Rate");
          			      r = sc.nextDouble();
         	                      r1=r/12/100;
         			      r2=1+r1;
          			      res=Math.pow(r2,t);
          	  		      r3=res-1;
          		  	      emi=(prin*r1*res)/(res-1);
          			      System.out.println("Emi = "+emi);
          			      //simple intrest
          			      si=prin*r*t;
          			      
	       	                   }
	       	                   else
	       	                   System.out.println("Your Not able to get thire lone amount as per your monthly income is "+mn+"Rupee ");
	       	            break;       
	       	            case 2:
	       	                   System.out.println("\t\033[33m Enetr your Loan Amount");
	       	                   a=sc.nextInt();
	       	                   System.out.println("\tEnter Your Anuual Income");
	       	                   b=sc.nextInt();
	       	                   mn=b/12;
	       	                   System.out.println("\tYour Monthly Income is = "+mn+" Ruppe/-");
	       	                   if(mn>=25000&&a>=500000)
	       	                   {
	       	                      System.out.println("\tCalculate the emi of your Loan");
	       	                     
                                      System.out.println("Enter the Amount");
          			      prin = sc.nextDouble();
          			       System.out.println("Enter the Time in Month");
          			      t = sc.nextDouble();
            			      System.out.println("Enter the Rate");
          			      r = sc.nextDouble();
         	                      r1=r/12/100;
         			      r2=1+r1;
          			      res=Math.pow(r2,t);
          	  		      r3=res-1;
          		  	      emi=(prin*r1*res)/(res-1);
          			      System.out.println("Emi = "+emi);
	       	                   }
	       	                   else
	       	                   System.out.println("Your Not able to get thire lone amount as per your monthly income is "+mn+"Rupee ");
	       	            break;
	       	            case 3:
	       	                   System.out.println("\t\033[34m Enetr your Loan Amount");
	       	                   a=sc.nextInt();
	       	                   System.out.println("\tEnter Your Anuual Income");
	       	                   b=sc.nextInt();
	       	                   mn=b/12;
	       	                   System.out.println("\tYour Monthly Income is = "+mn+" Ruppe/-");
	       	                   if(mn>=20000&&a>=100000)
	       	                   {
	       	                      System.out.println("\tCalculate the emi of your Loan");
	       	                      
                                      System.out.println("Enter the Amount");
          			      prin = sc.nextDouble();
          			      System.out.println("Enter the Time in Month");
          			      t = sc.nextDouble();
            			      System.out.println("Enter the Rate");
          			      r = sc.nextDouble();
         	                      r1=r/12/100;
         			      r2=1+r1;
          			      res=Math.pow(r2,t);
          	  		      r3=res-1;
          		  	      emi=(prin*r1*res)/(res-1);
          			      System.out.println("Emi = "+emi);
          			      
          			     
	       	                     
	       	                   }
	       	                   else
	       	                   System.out.println("Your Not able to get thire lone amount as per your monthly income is "+mn+"Rupee ");
	       	            break;
	       	            default :System.out.println("Invalid try ");
	       	             z++;
	       	                
	       	                  
	       		  }
	       
	        }while(ch>=4);
	        
	        System.out.println("\t\t\tLOAN APPLICATION");
        	         System.out.println("|===============================================");
           	  	 System.out.println("|\tName             :\t"+d);
           	  	 System.out.println("|===============================================");
        	  	 System.out.println("|\tDate of birth    :\t"+e);
        	  	 System.out.println("|\tPhone No         :\t"+f);
	          	 System.out.println("|\tEmail	 	 :\t"+g);
	         	 System.out.println("|\tStreet address   :\t"+h);
	          	 System.out.println("|\tCity   	 	 :\t"+i);
	          	 System.out.println("|\tRegion		 :\t"+j);
	          	 System.out.println("|\tPostal		 :\t"+k);
	          	 System.out.println("|\tCountry		 :\t"+l);
	          	 System.out.println("|\tEmployer name	 :\t"+m);
	          	 System.out.println("|===============================================");
	          	 System.out.println("\n\n\tLoan Amount = "+prin+"\n\tRate = "+r+"\n\tEmi per motnth = "+emi);
        
        
    }
} 
