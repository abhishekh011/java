//check nth number of bit what is 0 and 1

import java.util.Scanner;
 class NthBitGet
 {
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter any value :");
     int num = sc.nextInt();
     System.out.print("Enter the value(0-31) :");
     int n = sc.nextInt();
     int bitstatus = (num>>n) &1;
    System.out.println("nth bit is Bitstatus"+bitstatus);

   }
 }
