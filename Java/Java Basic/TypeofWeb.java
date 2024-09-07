
import java.util.Scanner;

public class TypeofWeb {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the URL");
            String url = sc.nextLine();
            String protocol = url.substring(0, url.indexOf(":"));
            if (protocol.equals("http")) {
                System.out.println("Hyper Text Protocol");
            } else if (protocol.matches("ftp")) {
                System.out.println("File Transfer Protocol");
            } else {
                System.out.println("NOT DEFINE");
            }
            String ext = url.substring(url.lastIndexOf(".") + 1);
            if (ext.equals("com")) {
                System.out.println("Commercial");
            } else if (url.equals("org")) {
                System.out.println("Organization");
            } else if (url.equals("net")) {
                System.out.println("Network");
            } else {
                System.out.println("NOT DEFINE");
            }
        }
    }
}
