
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("The Number is ");
        try (Scanner sc = new Scanner(System.in)) {
            Double Number = sc.nextDouble();
            if (Number % 2 == 0) {
                System.out.println("Hence, The number is EVEN");
            } else {
                System.out.println("Hence, The number is ODD");
            }
        }
    }
}
