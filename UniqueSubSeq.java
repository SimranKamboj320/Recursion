import java.util.HashSet;

public class UniqueSubSeq {
    public static void Sub(String str, int idx, String newString, HashSet<String> set) {
        // Base case: If idx has reached the end of the string
        if (idx == str.length()) {
            // Only print and add the newString if it's not already in the set
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }

        // Include the current character in the subsequence
        Sub(str, idx + 1, newString + str.charAt(idx), set);

        // Exclude the current character from the subsequence
        Sub(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        Sub(str, 0, "", set); // Start recursion with an empty newString
    }
}
