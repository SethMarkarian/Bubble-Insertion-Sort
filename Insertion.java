
public class Insertion
{
    /**
     * Does n Insertion Sort passes on a string s.
     * Return the modified string.
     */
    public static String insertionSort(String s, int n) {
        for(int i = 1; i < n + 1; i++) {
            int j = i;
            String temp = s.substring(j, j + 1);
            while(j > 0 && s.substring(j - 1, j).compareTo(temp) > 0) {
                s = s.substring(0, j - 1) + temp + s.substring(j - 1, j) + s.substring(j + 1);
                j--;
            }
        }
        return s;
    }
    
    public static void insertionTester() {
        
        int STRING_LENGTH = 5;  // Can change this
        
        String str = RandomString.randomString(STRING_LENGTH);
        System.out.println("Starting string: " + str);
        
        for(int i = 0; i < STRING_LENGTH; i++) {
            System.out.println("Insertion sort after " +  i + " passes: " + insertionSort(str, i));
            System.out.println("Should be: " + Key.insertionSort(str, i));
            System.out.println("Correct: " + Key.insertionSort(str, i).equals(insertionSort(str, i)));
            System.out.println();
        
        }
        
        System.out.println("Now sorted.");
    }
}
