package GroupProject2;

public class Task5 {
    /*
    Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c'.
    */
    public static void main(String[] args) {
        String string = "abracadabra";
        int index = -1;
        char str = ' ';
        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                str = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == 1) {
            System.out.println("All characters are repeating");
        }
        else {
            System.out.println("First non-repeating character is " + str);
        }
    }
}
