public class Recursion {
    public static int OptimizedPower(int a, int n) {
        if(n == 0){
            return 1;
        }

        //int halfPowerSq = OptimizedPower(a, n/2) * OptimizedPower(a, n/2);//time complexity = O(n)
        int halfPower = OptimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;//time complexity = O(logn)


        //n is odd
        if(n%2 != 0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]) {
        System.out.println(OptimizedPower(2, 10));
    }
}