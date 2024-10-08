import java.util.*;

public class Last{
    public static void Lasts(String str, String str1, int count, int idx){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                str1 += 'x';
            }
            System.out.println(str1);
            return;
        }

        if(str.charAt(idx) == 'x'){
            count++;
            Lasts(str, str1, count, idx+1);
        }else{
            str1 += str.charAt(idx);
            Lasts(str, str1, count, idx+1);
        }
    } 
    public static void main(String args[]){
        String str = "djwsydwefbwfasxhxcxxuix";
        Lasts(str, " ", 0, 0);

    }
}