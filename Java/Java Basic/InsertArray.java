
import java.util.Scanner;

public class InsertArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the element position : ");
            int pos = sc.nextInt();
            System.out.print("Enter the element value : ");
            int val = sc.nextInt();
            int a[] = new int[10];
            a[0] = 3;
            a[1] = 4;
            a[2] = 1;
            a[3] = 3;
            a[4] = 8;
            a[5] = 9;
            for (int i = a.length - 1; i > pos; i--) {
                a[i] = a[i - 1];
            }
            a[pos] = val;
            for (int x : a) {
                System.out.print(x + " ");
            }
        }
    }
}
