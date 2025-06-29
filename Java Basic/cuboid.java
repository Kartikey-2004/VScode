
import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Float height, base, length;
            double perimeter, area;
            System.out.println("Enter heigh base & length respectively");
            height = sc.nextFloat();
            base = sc.nextFloat();
            length = sc.nextFloat();
            perimeter = 2 * (height * base + height * length + length * height);
            area = height * base * length;
            System.out.println("The perimeter is " + perimeter);
            System.out.println("The area is " + area);
        }
    }
}
