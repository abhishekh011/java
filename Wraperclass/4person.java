import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first person age");
        Integer a = sc.nextInt();
        System.out.println("Enter second person age");
        Integer b = sc.nextInt();
        System.out.println("Enter third person age");
        Integer c = sc.nextInt();
        System.out.println("Enter fourth person age");
        Integer d = sc.nextInt();

        if (a.compareTo(b) > 0) {
            if (a.compareTo(c) > 0) {
                if (a.compareTo(d) > 0)
                    System.out.println("a is big");
                else
                    System.out.println("d is big");
            } else {
                if (c.compareTo(b) > 0)
                    System.out.println("c is big");
                else
                    System.out.println("d is big");
            }
        } else {
            if (b.compareTo(c) > 0) {
                if (b.compareTo(d) > 0)
                    System.out.println("b is big");
                else
                    System.out.println("d is big");
            } else
                System.out.println("c is big");
        }
    }
}
