package GroupProject2;

public class Task4 {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if
    they are anagrams, meaning they contain the same characters in a
    different order. For example, "listen" and "silent" are anagrams.
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }

    public static boolean isAnagram(String str1, String str2) {
        int count[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for ( int i = 0;i<count.length;i++){
            if (count[i] != 0) {
                return false;
            }
        }return true;
    }
}
