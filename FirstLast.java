import java.util.*;

public class FirstLast {
    public static void First(String str,int idx,char ch, int f, int l){

        if(str.length() == idx){
            System.out.println(f);
            System.out.println(l);
            return;
        }

        if(str.charAt(idx) == ch){
            if(f == -1){
                f = idx;
            }
            l = idx; 
        }
        First(str, idx+1, ch, f, l);
    }
    public static void main(String args[]){
        String str = "saddjgfdiuwbdawfla";
        int idx = 0;
        char ch = 'a';
        int f = -1;
        int l = -1;
        First(str, idx, ch, f, l);
        //System.out.println(f, l);
    }
}
