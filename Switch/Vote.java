import java.util.Scanner;
public class Vote
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.printf("Enter the Age : ");
		age = input.nextInt();
		int res = age >= 18?1:0;
		switch (res)
		{
			case 0:
				System.out.printf("You are Not Eligible for Voting...");
				break;
 
			case 1:
				System.out.println("You are Eligible for Voting...");
				break;
		}
	}
}
