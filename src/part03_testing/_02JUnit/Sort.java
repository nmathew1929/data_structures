package part03_testing._02JUnit;

/** Tests the Sort class. */
public class Sort {

    /**
     * Find the smallest item
     * Move it to the front
     * Selection sort the remanining N-1 items(without touching front item!).
     */
    public static void sort(String input[]) {
        for(int i = 0; i<input.length; ++i) {
            int minIdx = i;
            for (int j = i; j<input.length-i; ++j){
                if(input[j].compareTo(input[minIdx]) < 0){
                    minIdx = j;
                }
            }
            String temp = input[i];
            input[i] = input[minIdx];
            input[minIdx] = temp;
        }
    }

}
