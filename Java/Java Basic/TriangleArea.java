
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("enter the data ");
            Float a = sc.nextFloat();
            Float b = sc.nextFloat();
            Float c = sc.nextFloat();
            Float s = (a + b + c) / 2;
            System.out.println("your semi perimeter is " + s);
            Double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area is " + area);
            sc.close();
        }
    }
}