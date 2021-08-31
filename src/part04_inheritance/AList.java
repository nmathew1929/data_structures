package part04_inheritance;

public class AList<Item> implements List61B<Item> {

    private Object[] items;
    private int size;


    /** Creates an empty list. */
    public AList() {
        items =  new Object[100];
        size = 0;
    }

    @Override
    public void addFirst(Item x) {

    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if(size == items.length)
            resize(size*2);
        items[size] = x;
        ++size;
    }

    @Override
    public Item getFirst() {
        return get(0);
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

    @Override

    public void insert(Item x, int position) {
    //    items[position] = x;
        //it has to be inside the size
        //check if occupied
            //if occupied shift to right over 1.
            //make to sure to check if the underlying array can handle that shift.
                //if not resize
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
