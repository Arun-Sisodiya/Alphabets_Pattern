public class Z {
    public static void main(String args[]) {
        int n = 7;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row + col == n-1 || row == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
