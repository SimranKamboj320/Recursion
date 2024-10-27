public class DupString {
    public static boolean[] map = new boolean[26];
    public static void Dup(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }


        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            Dup(str, idx+1, newString);
        }else{
            newString += currchar;
            map[currchar - 'a'] = true;
            Dup(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
        String str = "aabbccdd";
        String newString = "";
        Dup(str, 0, newString);

    }
    
}
