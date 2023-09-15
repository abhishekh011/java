import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        Integer n = sc.nextInt();
        Integer i = 1, a = -1, b = 1, c;

        while (i <= n) {
            c = a + b;
            System.out.println(i + "     = " + c);
            a = b;
            b = c;
            i++;
        }
    }
}
