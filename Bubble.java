
public class Bubble
{
    /**
     * Does n Bubble Sort passes on a string s.
     * Return the modified string.
     */
    public static String bubbleSort(String s, int n) {
        boolean done = false;
        for(int i = 0; i < n; i++) {
            done = true;
            for(int j = 0; j < s.length() - i - 1; j++) {
                if(s.substring(j, j + 1).compareTo(s.substring(j + 1, j + 2)) > 0) {
                    s = s.substring(0, j) + s.substring(j + 1, j + 2) + s.substring(j, j + 1) + s.substring(j + 2);
                    done = false;
                }

            }
            if(done) {
                return s;
            }
        }
        return s;
    }
    
    public static void bubbleTester() {
        
        int STRING_LENGTH = 5;  // Can change this
        
        String str = RandomString.randomString(STRING_LENGTH);
        System.out.println("Starting string: " + str);
        
        for(int i = 0; i < STRING_LENGTH; i++) {
            System.out.println("Bubble sort after " +  i + " passes: " + bubbleSort(str, i));
            System.out.println("Should be: " + Key.bubbleSort(str, i));
            System.out.println("Correct: " + Key.bubbleSort(str, i).equals(bubbleSort(str, i)));
            System.out.println();
        
        }
        
        System.out.println("Now sorted.");
    }
}
