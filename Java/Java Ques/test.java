
import java.util.Scanner;

public class test {

    // static int factor(int n){
    // if(n==0 || n==1){
    // return 1;
    // }
    // else{
    // return n*factor(n-1);
    // }
    // }
    public static void main(String[] args) {
        System.out.println("Hello");
        try (Scanner sc = new Scanner(System.in)) {

            // String rev = "";
            // System.out.print("Enter the number : ");
            // String num = sc.nextLine();
            // for (int i = num.length() - 1; i >= 0; i--) {
            // rev = rev + num.charAt(i);
            // }
            // System.out.println(rev);
            // 
            // 
            // System.out.print("Enter the number : ");
            // int num = sc.nextInt();
            // int fact = 1;
            // for (int i = 1; i <= num; i++) {
            // fact = fact * i;
            // }
            // System.out.println(fact);
            // 
            // 
            // // connect to method factor
            // System.out.print("Enter the number : ");
            // int n = sc.nextInt();
            // int result = factor(n);
            // System.out.println(result);
            // 
            // 
            System.out.print("Enter the n term : ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Enter a greater term");
            } else {
                int a = 0, b = 1;
                System.out.print(a);
                for (int i = 1; i < n; i++) {
                    System.out.print(", " + b);
                    int temp = a + b;
                    a = b;
                    b = temp;
                }
                System.out.println();
            }
            //
            // 
            
        }
    }
}
