public class F {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || col == 0 || row == (n - 1) / 2 && row >= col) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
