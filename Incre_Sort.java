import java.util.*;

public class Recursion {

    public static void Incre_Sort(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        Incre_Sort(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]) {
        int n =10;
        Incre_Sort(n);
    }
}