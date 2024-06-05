import java.util.*;

public class Recursion {

    public static int Sum_N(int n) {
        if(n == 1){
            return 1;
        }
        int Sum1 = Sum_N(n-1);
        int Sum = n + Sum_N(n-1);
        return Sum;
    }
    public static void main(String args[]) {
        int n =5;
        System.out.println(Sum_N(n));
    }
}