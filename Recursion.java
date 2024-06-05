import java.util.*;

public class Recursion {

    public static void Dec_Sort(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        Dec_Sort(n-1);
    }
    public static void main(String args[]) {
        int n =10;
        Dec_Sort(n);
    }
}