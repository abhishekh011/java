import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter");
        Integer n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer i;

        System.out.println("Enter elements in the array");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Integer count = 0;

        for (i = 0; i < n; i++) {
            if (a[i].equals(a[0])) {
                a[0] = a[i];
                count++;
            }
        }

        System.out.println("\ta[0] = " + a[0]);
        System.out.println(count);
    }
}
