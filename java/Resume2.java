import java.lang.String;
import java.lang.System;
import java.util.Scanner;
public class Test
//input Resume
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);

//input

System.out.println("Enter your name");
String name = sc.nextLine();

System.out.println("Enter Father name");
String Fname = sc.nextLine();

System.out.println("Enter mother name");
String Mname = sc.nextLine();

System.out.println("Enter your DOB");
String dob = sc.nextLine();

System.out.println("Enter your gander");
String gander = sc.nextLine();

System.out.println("Enter your nationlity");
String nation = sc.nextLine();

System.out.println("Enter marital status");
String marit = sc.nextLine();

System.out.println("Enter 12th %");
String b = sc.nextLine();

System.out.println("Enter 10th %");
String a = sc.nextLine();

System.out.println("your work experience");
String work = sc.nextLine();

System.out.println("Enter your hobby");
String hobby = sc.nextLine();

System.out.println("Enter date");
String date = sc.nextLine();

System.out.println("Enter place");
String place = sc.nextLine();



//output
System.out.println("\t\t\t\t RESUME");
System.out.println("\t\t\t\t--------");
System.out.println("");
System.out.println("  PERSONAL DETAILS:");
System.out.println("  ----------------");
System.out.println("Name\t:"+name);
System.out.println("FName\t:"+Fname);
System.out.println("MName\t:"+Mname);
System.out.println("DOB\t:"+dob);
System.out.println("Gender\t:"+gander);
System.out.println("Nationality\t:"+nation);
System.out.println("Marital status\t:"+marit);
System.out.println("");
System.out.println("  QUALIFICATION:");
System.out.println("  -------------");
System.out.println("* 12th %:"+a);
System.out.println("* 10th %:"+b);
System.out.println("");
System.out.println("  PROFESSIONAL SKILS:");
System.out.println("  ------------------");
System.out.println("* Basic knowledge of computer.");
System.out.println("* typing");
System.out.println("");
System.out.println("  WORK EXPERIENCE");
System.out.println("  ---------------");
System.out.println("*"+work);
System.out.println("");
System.out.println("  HOBBY");
System.out.println("  -----");
System.out.println("* Playing :"+hobby);
System.out.println("");
System.out.println("date :"+date);
System.out.println("place:"+place);
}
}
