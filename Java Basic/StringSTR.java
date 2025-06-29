public class StringSTR {
    public static void main(String[] args) {
        String str = "test 43";
        String STR = "test 54";
        System.out.println(str);
        System.out.println(STR);

        // charAT()
        char str2 = str.charAt(2);
        System.out.println(str2);

        // codePointAT()
        int str3 = str.codePointAt(3);
        System.out.println(str3);

        // codePointAT()
        int str4 = str.codePointBefore(3);
        System.out.println(str4);

        // length
        System.out.println(str.length());

        // replace()
        System.out.println(str.replace(str, STR));
    }
}
