import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Test
//input ATM
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
//input section
System.out.println("Enter the Bank");
String bank = sc.nextLine();

System.out.println("Enter branch");
String branch = sc.nextLine();

System.out.println("Enter your card no");
String card = sc.nextLine();

System.out.println("Enter validity date");
String valid = sc.nextLine();

System.out.println("Enter your name");
String name = sc.nextLine();

System.out.println("Enter card type");
String type = sc.nextLine();


// Print details

System.out.println("|\t\t\t\t*"+bank);
System.out.println("|\t\t\t\t"+branch);
System.out.println("|***");
System.out.println("|***");
System.out.println("|***");
System.out.println("|\n\n"+card);
System.out.println("|valid :"+valid);
System.out.println("|"+name+"\t\t\tRUPAY");
System.out.println("|\t\t\t\t"+type);
}
}
