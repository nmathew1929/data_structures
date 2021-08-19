package part03_testing._02JUnit;

/** Tests the Sort class. */
public class Sort {

    /**
     * Find the smallest item
     * Move it to the front
     * Selection sort the remaining N-1 items(without touching front item!).
     */
    public static void sort(String input[]) {
        sort(input, 0);
    }

    private static void  sort (String[] input, int start) {
        if(start == input.length)
            return;

        int smallestIdx = findSmallest(input, start);
        swap(input, start, smallestIdx);
        sort(input, start+1);
    }
    /** Returns the smallest index from a particular starting point
     *  compareTo() method compares the given string with the current string lexicographically
     * lexicographical order is alphabetical order. 1, 10, 2
     * he other type is numerical ordering. Consider the following values,
     *  **/
    public static int findSmallest(String input[], int start) {
        int smallestIndex = start;
        for (int i = start+1; i < input.length; i++){
            if (input[i].compareTo(input[smallestIndex]) < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /** swaps two indexes of an array */
    public static void swap(String input[], int a, int b) {
        String temp = input[b];
        input[b] = input[a];
        input[a] = temp;
    }

}
