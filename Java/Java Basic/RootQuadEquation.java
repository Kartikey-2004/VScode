
import java.util.Scanner;

public class RootQuadEquation {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;
            Double r1, r2;
            System.out.println("Enter The Value a ");
            a = sc.nextInt();
            System.out.println("Enter The Value b ");
            b = sc.nextInt();
            System.out.println("Enter The Value c ");
            c = sc.nextInt();
            r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("x = " + r1);
            System.out.println("x = " + r2);
        }
    }
}
