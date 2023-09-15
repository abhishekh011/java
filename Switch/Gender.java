import java.util.Scanner;
public class Gender
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char gen;
 
		System.out.printf("Enter the Gender(M/F) : ");
		gen = input.next().charAt(0);
 
		switch (gen)
		{
		case 'M':
		case 'm':
			System.out.printf("Male");
			break;
		case 'F':
		case 'f':
			System.out.printf("Female");
			break;
		default:
			System.out.printf("Unspecified Gender.");
			break;
		}
	}
}
