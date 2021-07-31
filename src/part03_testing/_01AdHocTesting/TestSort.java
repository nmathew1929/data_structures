package part03_testing._01AdHocTesting;

public class TestSort {
    /** Test the Sort.sort method. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg."};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);

        /**equals operator does not compare contents of the array, but the addresses of the array.
        this is a bug **/
        //if (input != expected) {

        for(int i=0; i<input.length; ++i) {
            if(!input[i].equals(expected[i])){
                System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i]);
                return;
            }
        }

//        if(!java.util.Arrays.equals(input, expected))
//            System.out.println("Error! There seems to be a problem with Sort.sort.");

    }
    public static void main(String[] args) {
        testSort();
    }
}

