public class M {
    public static void main(String args[]) {
        int n = 7;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col == 0 || row == col && row <= (n-1)/2 || row + col == n-1 && row <= (n-1)/2 || col == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
