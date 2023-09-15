import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        Integer n = sc.nextInt();
        Integer i = 1;
        Integer a, b, m = n;
        Integer sum = 0;

        while (n > 0) {
            a = n % 10;
            b = a * a * a;
            sum = sum + b;
            n = n / 10;
        }

        if (m.equals(sum))
            System.out.println("armstom");
        else
            System.out.println("not armstom");
    }
}
