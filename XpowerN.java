import java.util.*;

public class Recursion {
    public static int XpowerN(int x, int n) {
        if(n == 0){
            return 1;
        }

        //int power1 = XpowerN(x, n-1);
        //int xn = x*power1;
        //    return xn;
        return x*XpowerN(x, n-1);
    }
    public static void main(String args[]) {
        System.out.println(XpowerN(2, 10));
    }
}