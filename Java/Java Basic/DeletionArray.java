
import java.util.Scanner;

public class DeletionArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the element position you want to delete : ");
            int pos = sc.nextInt();
            int a[] = new int[10];
            a[0] = 3;
            a[1] = 4;
            a[2] = 1;
            a[3] = 3;
            a[4] = 8;
            a[5] = 9;
            for (int i = pos; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            for (int x : a) {
                System.out.print(x + " ");
            }
        }
    }
}
    