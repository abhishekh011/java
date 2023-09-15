import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        Integer n = sc.nextInt();
        Integer m = 0;
        Integer k = 1;

        for (Integer i = 1; k <= n; i++) {
            m = i;
            Integer count = 0;

            while (i > 0) {
                count++;
                i = i / 10;
            }
            i = m;
            Integer sum = 0;

            while (i > 0) {
                Integer r = i % 10;
                Integer a = 1, pow = 1;

                while (a <= count) {
                    pow = pow * r;
                    a++;
                }
                sum = sum + pow;
                i = i / 10;
            }
            i = m;

            if (m.equals(sum)) {
                System.out.println("armstom" + m);
                k++;
            }
        }
    }
}
