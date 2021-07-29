package part02_lists._07ALists;

/*  Invariants: (Things that are always true about our DS.
    addLast:    The next item wa want to add, will go into position size
    getLast:    The item we want to return is in position size - 1;
    size:       The number of items in the list should be size.
 */

public class AList {
    private int[] items;
    private int size, houseSize;


    /** Creates an empty list. */
    public AList() {
        items = new int[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        items[size] = x;
        ++size;
    }

    private void doubleHouse(int[] val) {

    }

    /** Returns the item from the back of the list. */
    public int getLast() {
       return items[size-1];
    }

    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    public int size(){
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int val = items[size-1];
        --size;
        return val;
    }
}
