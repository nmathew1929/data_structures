package part03_testing._02JUnit;

public class TestSort {
    /** Test the Sort.sort method. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg."};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(input, expected);
    }
    public static void main(String[] args) {
        testSort();
    }
}

