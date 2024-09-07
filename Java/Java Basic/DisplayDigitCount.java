
import java.util.Scanner;

public class DisplayDigitCount {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int m = n;
            int r;
            int sum = 0;

            int count = 0;
            while (n > 0) {
                r = n % 10;
                n = n / 10;
                count++;
                sum = sum + r * r * r;
                System.out.println(r);
            }
            System.out.println("THe total number of digit is " + count);

            if (sum == m) {
                System.out.println("The number is armstrong");
            } else {
                System.out.println("The number is not armstrong");
            }

        }
    }
}
