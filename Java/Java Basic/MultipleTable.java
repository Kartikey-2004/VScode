
import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Table of number ");
            int num = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (i * num));
            }
        }
    }
}