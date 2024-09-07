
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = {3, 9, 7, 12, 15, 13, 5, 34};

            /*sum of array*/
            //int sum = 0;
            // for (int i = 0; i < a.length; i++) {
            //     sum = sum + a[i];
            // }
            // System.out.println(sum);

            /*check an element */
            System.out.print("Enter the search Element : ");
            int find = sc.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (a[i] == find) {
                    System.out.println("Element is present");
                    System.exit(0);
                }
            }

            /*maximum element*/
            // int max = 0;
            // for (int i = 0; i < a.length; i++) {
            //     if (max < a[i]) {
            //         max = a[i];
            //     }
            // }
            // System.out.println(max);

            /*second max number*/
            // int max1 = 0, max2 = 0;
            // for (int i = 0; i < a.length; i++) {
            //     if (a[i] > max1) {
            //         max2 = max1;
            //         max1 = a[i];
            //     }
            //     else if (a[i]>max2){
            //         max2=a[i];
            //     }
            // }
            // System.out.println(max2);

            /*rotate left*/
            // for (int x : a) {
            //     System.out.print(x + " ");
            // }
            // System.out.println(" ");
            // int temp = a[0];
            // for (int i = 1; i < a.length; i++) {
            //     a[i - 1] = a[i];
            // }
            // a[a.length - 1] = temp;
            // for (int y : a) {
            //     System.out.print(y + " ");
            // }

            /*rotate right*/
            // for (int x : a) {
            //     System.out.print(x + " ");
            // }
            // System.out.println(" ");
            // int temp = a[a.length - 1];
            // for (int i = a.length - 1; i > 0; i--) {
            //     a[i] = a[i - 1];
            // }
            // a[0] = temp;
            // for (int y : a) {
            //     System.out.print(y + " ");
            // }

            /*coping an array*/
            // int b[] = new int[a.length];
            // for (int i = 0; i < a.length; i++) {
            //     b[i] = a[i];
            // }
            // for (int j = 0; j < a.length; j++) {
            //     System.out.print(b[j] + " ");
            // }

            /*reverse copy*/
            // int b[] = new int[a.length];
            // for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            //     b[j] = a[i];
            // }
            // for (int x : b) {
            //     System.out.print(x + " ");
            // }

        }
    }
}
