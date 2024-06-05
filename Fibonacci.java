import java.util.*;

public class Recursion {

    public static int Fibonacci(int n) {
        if(n == 0|| n == 1){
            return n;
        }
        int fb1 = Fibonacci(n-1);
        int fb2 = Fibonacci(n-2);
        int fb = fb1+fb2;
        return fb;
    }
    public static void main(String args[]) {
        int n =25;
        System.out.println(Fibonacci(25));
        System.out.println(Fibonacci(26));
        System.out.println(Fibonacci(27));
    }
}