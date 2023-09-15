import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        Integer n = sc.nextInt();
        Integer i, a, m = 1;

        for (i = 2; m <= n; i++) {
            Integer count = 1;
            for (a = 2; a < i; a++) {
                if (i % a == 0)
                    count++;
            }
            if (count.equals(1)) {
                System.out.println(i);
                m++;
            }
        }
    }
}
