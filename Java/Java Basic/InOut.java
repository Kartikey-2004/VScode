
import java.util.Scanner;

class InOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            String x;
            System.out.println("ENTER ANYTHING");
            x = sc.nextLine();
            System.out.println(x);
            sc.close();
        }
    }
}
