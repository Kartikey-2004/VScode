
public class TwoDArray {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = {{3, 6, 1}, {1, 2, 3}, {2, 1, 0}};
        int c[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        for (int[] x : c) {
            for (int y : x) {
                System.out.print(y + "  ");
            }
            System.out.println(" ");
        }
    }
}
