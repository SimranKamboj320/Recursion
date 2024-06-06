public class Recursion {

    public static int FrndPairs(int n){

        //base case
        if(n == 1 || n ==2){
            return n;
        }
        //choice
        //single
        int fp = FrndPairs(n-1);

        //pair
        int fp1 = FrndPairs(n-2);
        int pairWays = (n-1) * fp1;

        //total ways
        int totWays = fp + pairWays;
        return totWays;
    }
    public static void main(String args[]) {
        System.out.println(FrndPairs(5));
    }
}