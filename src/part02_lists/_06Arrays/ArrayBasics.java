package part02_lists._06Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] z = null;
        int[] x, y;

        x = new int[] {1, 2, 3, 4, 5};
        y = x; //copy the address that variable x holds. now x, y references the initial array
        x = new int[] {-1, 2, 5, 4, 99}; // only y holds the references.
        y = new int[3]; // the initial array will be garbage collected.
        //in java, when an array is initialized all the boxes are zero.
        z = new int[0]; //an array of 0 length. empthy array.
        int xL = x.length;

        String[] s = new String[6]; //default value for objects is null
        s[4] = "ketchup";
        s[x[3] - x[1]] = "muffins";

        int[] b = {9, 10, 11};
        System.arraycopy(b, 0, x, 3, 2);
    }

}
