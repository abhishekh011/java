import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        Integer n = sc.nextInt();
        Integer i = 1;
        Integer count = 0;

        while (i <= n) {
            if (n % i == 0)
                count++;
            i++;
        }

        if (count.equals(2))
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
