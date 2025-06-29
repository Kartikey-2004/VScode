
import java.util.Scanner;

public class NumberWords {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            int r;
            String str = "";
            while (num > 0) {
                r = num % 10;
                num = num / 10;
                str = str + r;
            }
            System.out.println("Reverse of the number : " + str);
            char c;
            for (int i = str.length() - 1; i >= 0; i--) {
                c = str.charAt(i);
                switch (c) {
                    case '0' ->
                        System.out.print("ZERO ");
                    case '1' ->
                        System.out.print("ONE ");
                    case '2' ->
                        System.out.print("TWO ");
                    case '3' ->
                        System.out.print("THREE ");
                    case '4' ->
                        System.out.print("FOUR ");
                    case '5' ->
                        System.out.print("FIVE ");
                    case '6' ->
                        System.out.print("SIX ");
                    case '7' ->
                        System.out.print("SEVEN ");
                    case '8' ->
                        System.out.print("EIGHT ");
                    case '9' ->
                        System.out.print("NINE ");
                }
            }
        }
    }
}
