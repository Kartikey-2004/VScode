
import java.util.Scanner;

public class SumOFn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Value of n");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("sum of " + n + " number is " + sum);
        }
    }
}
