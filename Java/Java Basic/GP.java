
import java.util.Scanner;

public class GP {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the nth term : ");
            int n = sc.nextInt();
            System.out.print("Enter the base : ");
            int a = sc.nextInt();
            System.out.print("Enter the ratio: ");
            int r = sc.nextInt();
            int geometric_progression=a;
            for (int i=0;i<n;i++){
                System.out.print(geometric_progression+", ");
                geometric_progression=geometric_progression*r;
            }
        }
    }
}
