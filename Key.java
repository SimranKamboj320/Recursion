import java.util.*;

public class KeyRecur{
    public static void keys(int n[], int idx, int key){
        if(idx == n.length){
            return;
        }
        if(n[idx]==key){
            System.out.println(idx);
        } 
        keys(n, idx+1, key);
    }
    public static void main(String args[]){
        int n[] = {4,3,5,6,4,4,2};
        keys(n, 0, 4);
    }
    
}
