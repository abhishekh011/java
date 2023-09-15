import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter");
        Integer n = sc.nextInt();
        Integer[] a = new Integer[20];
        Integer i;

        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter index in array");
        Integer ind = sc.nextInt();
        System.out.println("Enter value you want to increase");
        Integer inc = sc.nextInt();

        for (i = ind; i >= ind; i--) {
            a[i] = a[i] + inc;
        }

        for (i = 0; i < n; i++) {
            System.out.println("\ta[" + i + "] = " + a[i]);
        }
    }
}
