
public class Bitwise {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int a = x & y; // AND
        System.out.println("a " + a);
        int b = x | y; // OR
        System.out.println("b " + b);
        int c = x ^ y; // XOR
        System.out.println("c " + c);
        int d = x << 1; // LEFT SHIFT
        System.out.println("d " + d);
        int e = x >> 2; // RIGHT SHIFT
        System.out.println("e " + e);
        int f = x >>> 1; // UNSIGNED RIGHT SHIFT
        System.out.println("f " + f);
        int g = ~x; // NOT
        System.out.println("g " + g);

        System.out.println("\n");
        // output in binary format
        System.out.println(String.format("%s", Integer.toBinaryString(f)));
        System.out.println(String.format("%32s", Integer.toBinaryString(g)));
    }
}

// bitwise act only on integer or binary number.
// the bitwise output is always integer.

