import java.util.*;

public class Power {
    public static int po(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n%2 == 0){
            return po(x, n/2) * po(x, n/2);
        }else{
            return po(x, n/2) * po(x, n/2)*x;
        }
    }
    public static void main(String args[]){
        System.out.println(po(5, 3));
    }
    
}
