package part02_lists._07ALists;

/*  Invariants: (Things that are always true about our DS.
    addLast:    The next item wa want to add, will go into position size
    getLast:    The item we want to return is in position size - 1;
    size:       The number of items in the list should be size.
 */

public class GenericAList<Item> {
    private Object[] items;
    private int size;


    /** Creates an empty list. */
    public GenericAList() {
        items =  new Object[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if(size == items.length)
            resize(size*=2);
        items[size] = x;
        ++size;
    }

    private void resize(int capacity) {
        Object[] a  = new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return (Item) items[size-1];
    }

    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return (Item) items[i];
    }

    public int size(){
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item.
     */
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null; //Unused objects need to have no reference.
        --size;
        return x;
    }
}