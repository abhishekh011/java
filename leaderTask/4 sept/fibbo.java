import java.util.Scanner;
import java.lang.String;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		    int a=0;
		    int b=1;
		    int c;
		System.out.print(a+"   "+b);
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.print("   "+c);
			a=b;
			b=c;
		}
	}
}
class Test2
{
	public static void main(String[] args)
	{
		int n=9;
		int a=-1;
		int b=1;
		int c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println("   "+c);
			a=b;
			b=c;
		}
	
	}
}