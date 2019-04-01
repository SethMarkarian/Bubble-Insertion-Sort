
public class RandomString
{   
    /**
     * Generates a string of length len, with random letters.
     * As written, all letters are lowercase.
     * To switch to capitals, change UPPER_CASE to true.
     */
    public static String randomString(int len) {
        boolean UPPER_CASE = false;
        
        String s = "";
        for(int i = 0; i < len; i++) {
            if(UPPER_CASE) {
                s += (char)(int) (65 + Math.random() * 26);
            }
            else {
                s += (char)(int) (97 + Math.random() * 26);
            }
        }
        return s;
    }
}
