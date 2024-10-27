public class Keypad {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCom(String str, int idx, String com){
        if(idx == str.length()){
            System.out.println(com);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];

        for(int i=0; i<mapping.length(); i++){
            printCom(str, idx+1, com+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "23";
        printCom(str, 0, "");
    }
}
