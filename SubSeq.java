public class SubSeq {
    public static void Sub(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);

        Sub(str, idx+1, newString+currchar);

        Sub(str, idx+1, newString);

    }
    public static void main(String args[]){
        String str = "abc";
        String newString = "";
        Sub(str, 0, newString);
    }
}
