import java.util.HashMap;

// https://leetcode.com/problems/first-unique-character-in-a-string/description/

public class FirstUniqueChar {
    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (letters.containsKey(c)) {
                letters.replace(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (letters.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("eaabbddc"));
    }
}
