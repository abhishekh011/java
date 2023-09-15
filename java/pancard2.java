import java.lang.String;
import java.lang.System;
import java.util.Scanner;
public class Test
//pancard2
{
public static void main(String args [])
{
Scannar sc = new Scannar(System.in);

//input

System.out.println("Enter your name");
String name = sc.nextLine();

System.out.println("Enter Father name");
String Fname = sc.nextLine();

System.out.println("Enter mother name");
String Mname = sc.nextLine();

System.out.println("Enter your DOB");
String dob = sc.nextLine();


//output



System.out.println("\t\tINCOME TAX DEPARTMENT\t\t\tGOVT OF INDIA");
System.out.println("\t\t\t\tpermament account number card");
System.out.println("NAME");
System.out.println("First name  middle name");
System.out.println("\t\t\t\t\t\t\t\t\t_________");
System.out.println("Father's name\t\t\t\t\t\t\t\t|\t |");
System.out.println("First name  middle name\t\t\t\t\t\t\t|\t |");
System.out.println("\t\t\t\t\t\t\t\t\t|\t |");
System.out.println("Date of Birth\t\t\t\t\t\t\t\t|\t |");
System.out.println("DD/MM/YY\t\t\t\t\t\t\t\t|________|");
System.out.println("\t\t\t\t\tsignatur\t\t\tphoto");


}
}
