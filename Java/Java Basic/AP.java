
import java.util.Scanner;

public class AP {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the nth term : ");
            int n = sc.nextInt();
            System.out.print("Enter the base : ");
            int a = sc.nextInt();
            System.out.print("Enter the difference : ");
            int d = sc.nextInt();
            int Arithmetic_Progression;
            for (int i = 0; i < n; i++) {
                Arithmetic_Progression = a + (i - 1) * d;
                System.out.print(Arithmetic_Progression + ", ");
            }
        }
    }
}
