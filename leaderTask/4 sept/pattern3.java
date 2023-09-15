import java.util.*;
class Test {
    public static void Pattern(int n)
    {
        int i, j;
        int num = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number");
	int n=sc.nextInt();
        Pattern(n);
    }
}