
import java.util.Scanner;

public class EmailGmail {
    public static void main(String[] args) {
        System.out.println("Enter the email address");
        try (Scanner sc = new Scanner(System.in)) {
            String email = sc.next();
            int i = email.indexOf("@");
            String usernsame = email.substring(0, i);
            String doamin = email.substring(i + 1, email.length());
            System.out.println("Username = " + usernsame);
            System.out.println("Domain = " + doamin);
            System.out.println(doamin.startsWith("gmail"));
        }
    }
}
