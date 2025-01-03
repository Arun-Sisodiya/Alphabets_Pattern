public class H {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col == 0 || row == (n-1)/2  || col == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
