class Test {
    public static int a = 65;

    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (a + j) + " ");
			a=a+j;
            }
            System.out.println();
        }
    }
}
