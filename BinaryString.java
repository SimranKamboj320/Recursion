public class Recursion {

    public static void BinaryString(int n, int lastPlace, String str) {
        if(n == 0){
            //return 1;
            System.out.println(str);
            return;
        }
        //kaam
        //if(lastPlace == 0){
            //sit 0 on chair n
            //BinaryString(n-1, 0, str.append("0"));
            //BinaryString(n-1, 1, str.append("1"));
        //}else{
            //BinaryString(n-1, 0, str.append("0"));
        //}
        BinaryString(n-1, 0, str + "0");

        if(lastPlace == 0){
            BinaryString(n-1, 1, str +"1");
        }
    }
    public static void main(String args[]) {
        BinaryString(3, 0, "");
    }
}