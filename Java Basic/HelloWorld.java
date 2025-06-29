
class HelloWorld {

    public static void main(String arg[]) {
        System.out.println("hello world");
        int x = 5;
        int y = -8;
        Float z = 18.53f;
        String str = "hello";
        System.out.printf("%d %d %S\n", x, y, str);
        System.out.printf("%1$d %2$d %3$S\n", x, y, str);
        System.out.printf("%+5d %+5d\n", x, y);
        System.out.printf("%5d\n", x);
        System.out.printf("%05d\n", x);
        System.out.printf("%(05d\n", y);
        System.out.printf("%(08d\n", y);
        System.out.printf("%6.5f\n", z);
        System.out.printf("%10s\n", str);
        System.out.printf("%-10s\n", str);
    }
}
