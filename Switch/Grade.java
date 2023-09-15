import java.util.Scanner;
public class Grade 
{
    public static void main(String args[])
    {
		Scanner input = new Scanner(System.in);
		char g;
		System.out.println("A, B, C, D or F");
		System.out.print("Please Select Grade :");
		g = input.next().charAt(0);
        System.out.println("Grade : " + g);
		char grade = Character.toUpperCase(g);
        switch(grade)
        {
            case 'A':
                System.out.println("Remark : Excellent!");
                break;
            case 'B':
                System.out.println("Remark : Well Done");
                break;
            case 'C':
                System.out.println("Remark : Very Good");
                break;
            case 'D':
                System.out.println("Remark : Good");
                break;
            case 'F':
                System.out.println("Remark : Fail");
                break;
            default:
                System.out.println("Invalid Grade");
				break;
        }
    }
}
