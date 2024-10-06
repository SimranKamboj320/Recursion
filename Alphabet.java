import java.util.*;

public class Alphabet {
    public static void Alpha(int num){
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if(num == 0){
            return;
        }

        int last = num%10;
        Alpha(num/10);
        System.out.println(digits[last]+ " ");
    }
    public static void main(String args[]){
        Alpha(1234);
        System.out.println();
    }
    
}
