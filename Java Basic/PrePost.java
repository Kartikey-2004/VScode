public class PrePost {
    public static void main(String[] args) {
        int x = 5, y, z, m;
        y = x++;
        z = x--;
        m = x;
        System.out.println(x + " " + y + " " + z + " " + m);
        System.out.println(x+y+z+m);
    }
}

// pre and post are used two increase or decrease( +/-) the number by 1.
// it uses the the value and change on basis of pre or post the main value.
/*
 * such in above case first it x=5 then uses as post in y so y=5 but now x=6
 * while in z again as post is used so z=6 but now x=5 as shown in m.
 */
// pre = ++x , --x
// post = x++ , x--