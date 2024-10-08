import java.util.*;

public class Incre {
    public static boolean Order(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            return Order(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(Order(arr, 0));
    }   
}
