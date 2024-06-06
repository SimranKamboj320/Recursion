public class Recursion {

    public static int FrndPairOptimized(int n){

        //base case
        if(n == 1 || n ==2){
            return n;
        }
        return FrndPairOptimized(n-1) + (n-1) * FrndPairOptimized(n-2);
    }
    public static void main(String args[]) {
        System.out.println(FrndPairOptimized(5));
    }
}