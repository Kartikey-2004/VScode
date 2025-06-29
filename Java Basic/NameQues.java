
import java.util.Scanner;

class NameQues {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            String name;
            System.out.println("what is your name ?");
            name = s.nextLine();
            System.out.println("welcome " + name);
            s.close();
        }
    }
}
