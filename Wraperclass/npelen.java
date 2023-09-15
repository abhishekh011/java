import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        Integer x = sc.nextInt();

        for (Integer i = 100; i < x; i++) {
            Integer y = i;
            Integer rev = 0;

            while (y > 0) {
                Integer r = y % 10;
                rev = rev * 10 + r;
                y = y / 10;
            }

            if (rev.equals(i)) {
                System.out.println(i);
            }
        }
    }
}
