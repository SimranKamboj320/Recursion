public class Recursion {

    public static int TilingProblem(int n) { //2*n (floor size)

        //base case
        if(n ==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = TilingProblem(n-1);

        //horizontal choice
        int fnm2 = TilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String args[]) {
        int n =4;
        System.out.println(TilingProblem(n));
    }
}