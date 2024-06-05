import java.util.*;

public class Recursion {

    public static int Factorial(int n) {
        if(n == 0){
            return 1;
        }
        int fn1 = Factorial(n-1);
        int fn = n*Factorial(n-1);
        return fn;
    }
    public static void main(String args[]) {
        int n =5;
        System.out.println(Factorial(n));
    }
}