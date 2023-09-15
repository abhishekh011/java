import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");

        String a = sc.nextLine();
        String n = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println(a);

        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            n = ch + n;
        }
        System.out.println("Reversed word: " + n);
    }
}
