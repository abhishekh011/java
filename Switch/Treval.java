import java.util.Scanner;
 class Treval
 {
  public static void main(String [] args)
  {
  	Scanner sc = new Scanner(System.in);	
  	System.out.println("chose your Destination");
  	System.out.println("\t# Press 1 for Indore to Bhopal");
  	System.out.println("\t# Press 2 for Bhopal to Indore ");
  	System.out.println("\t# Press 3 for Ujjain to Indore");
  	System.out.println("\t# Press 4 for Indore to ujjain");
  	System.out.println("\t# Press 5 for Bhopal to ujjain");
	System.out.println("\t# Press 6 for Ujjain to Bhopal");
	
	int Press = sc.nextInt();
	int pr;
	
	switch(Press)
	{
	  case 1:
	  
	  System.out.println("Chose your mode");
	  System.out.println("\t# Pr 11 for Ac");
	  System.out.println("\t# Pr 12 for Non-Ac");
	  pr = sc.nextInt();
	     if(pr==11)
	     {
	      System.out.println("Ac Selected");
	    System.out.println("Your payment is 500/rs only");
	        
	    }
	    else if(pr==12)
	    {
	     System.out.println("Non Ac Selected"); 
	    System.out.println("Your payment is 700/rs only");
	      
	    }
	    else
	       System.out.println("This Bus Service Not For You"); 
	    break;
       case 2:
	  
	  System.out.println("Chose your mode");
	  System.out.println("\t# Pr 11 for Ac");
	  System.out.println("\t# Pr 12 for Non-Ac");
	  pr = sc.nextInt();
	     if(pr==11)
	     {
	    System.out.println("Your payment is 700/rs only");
	    System.out.println("Ac Selected");
	    }
	    else
	    { 
	    System.out.println("Your payment is 900/rs only");
	    System.out.println("Non Ac Selected");
	}
	break;
	 case 3:
	  
	  System.out.println("Chose your mode");
	  System.out.println("\t# Pr 11 for Ac");
	  System.out.println("\t# Pr 12 for Non-Ac");
	  pr = sc.nextInt();
	     if(pr==11)
	     {
	    System.out.println("Your payment is 1000/rs only");
	    System.out.println("Ac Selected");
	    }
	    else
	    { 
	    System.out.println("Your payment is 1200/rs only");
	    System.out.println("Non Ac Selected");
	    }
	    break;
       case 4:
	  
	  System.out.println("Chose your mode");
	  System.out.println("\t# Pr 11 for Ac");
	  System.out.println("\t# Pr 12 for Non-Ac");
	  pr = sc.nextInt();
	     if(pr==11)
	     {
	    System.out.println("Your payment is 1200/rs only");
	    System.out.println("Ac Selected");
	    }
	    else
	    { 
	    System.out.println("Your payment is 1400/rs only");
	    System.out.println("Non Ac Selected");
	}
	break;
	case 5:
	  
	  System.out.println("Chose your mode");
	  System.out.println("\t# Pr 11 for Ac");
	  System.out.println("\t# Pr 12 for Non-Ac");
	  pr = sc.nextInt();
	     if(pr==11)
	     {
	    System.out.println("Your payment is 1000/rs only");
	    System.out.println("Ac Selected");
	    }
	    else
	    { 
	    System.out.println("Your payment is 1200/rs only");
	    System.out.println("Non Ac Selected");
	    }
	    break;
       case 6:
	  
	  System.out.println("Chose your mode");
	  System.out.println("\t# Pr 11 for Ac");
	  System.out.println("\t# Pr 12 for Non-Ac");
	  pr = sc.nextInt();
	     if(pr==11)
	     {
	    System.out.println("Your payment is 1200/rs only");
	    System.out.println("Ac Selected");
	    }
	    else
	    { 
	    System.out.println("Your payment is 1400/rs only");
	    System.out.println("Non Ac Selected");
	}
	break;
	}
  }
 }
