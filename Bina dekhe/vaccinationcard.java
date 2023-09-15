import java.util.Scanner;
import java.lang.String;
class Vaccination{
public static void main(String args[])
{
Scanner sj=new Scanner(System.in);
Scanner sc=new Scanner(System.in);
System.out.println("Enter");
	int x = sc.nextInt();
	int y = 1;
	while(y<=x)
	{
System.out.println("enter name :");
String a=sj.nextLine();
System.out.println("enter gender");
String c=sj.nextLine();
System.out.println("enter vaccination name");
String n=sj.nextLine();
System.out.println("enter vaccinated by ");
String l=sj.nextLine();
System.out.println("enter date of dose");
String j=sj.nextLine();
System.out.println("enter manufcture:");
String h=sj.nextLine();
System.out.println("enter Vaccination status");
String g=sj.nextLine();
System.out.println("Vaccinated at");
String m=sj.nextLine();  
System.out.println("enter age:");
int b=sc.nextInt();
System.out.println("enter verified id");
int d=sc.nextInt();
System.out.println("enter unique health id");
int e=sc.nextInt();
System.out.println("enter reference id");
int f=sc.nextInt();
System.out.println("dose no.");
int i=sc.nextInt();
System.out.println("enter batch no.");
int k=sc.nextInt();


System.out.println("-------------------------------------------------------");
System.out.println("\tministry of health & family welfare");
System.out.println("\t\tGovernmentof india");
System.out.println("\tCertificate for COVID-19 Vaccination");
System.out.println("\t\tcertificate ID : 325523512");
System.out.println("-------------------------------------------------------");
System.out.println("\tBeneficiary Details");
System.out.println("-------------------------------------------------------");
System.out.println("\tBenificiary Name          :"+a+"                     ");
System.out.println("\tage                       :"+b+"                     ");
System.out.println("\tGender                    :"+c+"                     ");
System.out.println("\tID Verified               :"+d+"                     ");
System.out.println("\tUnique Health ID          :"+e+"                     ");
System.out.println("\tBenificiaryReference ID   :"+f+"                     ");
System.out.println("\tVaccination Status        :"+g+"                     ");
System.out.println("-------------------------------------------------------");
System.out.println("\tvaccination Details");
System.out.println("-------------------------------------------------------");
System.out.println("\tVaccination Name         :"+n+"                      ");
System.out.println("\tManufacture              :"+h+"                      ");
System.out.println("\tDose Number              :"+i+"                      ");
System.out.println("\tDate of Dose             :"+j+"                      ");
System.out.println("\tBatch Number             :"+k+"                      ");
System.out.println("\tVaccinated By            :"+l+"                      ");
System.out.println("\tVaccinated At            :"+m+"                      ");
System.out.println("-------------------------------------------------------");

y++;
}
}
}


