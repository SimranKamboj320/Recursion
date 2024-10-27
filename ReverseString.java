import java.util.*;

public class ReverseString {
    public static void reverse(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        reverse(str, idx-1);
    }
    public static void main(String[] args){
        String str = "abcd";
        reverse(str, str.length()-1);

    }
    
}
