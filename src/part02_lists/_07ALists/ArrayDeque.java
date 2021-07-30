package part02_lists._07ALists;

/**
 *  Naive
 *  Invariant
 *      firstIdx cannot infringe on lastIdx;
 *          need a mechanism to prevent that from happening.
 */
public class ArrayDeque<T> {
    private int firstIdx, lastIdx, size;
    private Object  items[];


    public ArrayDeque() {
        items = new Object[100];
        firstIdx = 0;
        size = 0;
    }

    /** Adds an item of type T to the front of the deque **/
    public void addFirst(T item) {
    }

    private void resize() {
    }

    /** Adds an item of type T to the back of the deque **/
    public void addLast(T item) {
        if(size == items.length)
            resize();
    }

    /** Returns true if deque is empty, false otherwise */
    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    /** Returns the number of items in the deque. */
    public int size() {
        return size;
    }

    /** Prints the items in the deque from first to last, separated by a space. */
    public void printDeque() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < size; i++)
            stringBuilder.append(items[i] + " ");
        System.out.println(stringBuilder.toString());
    }

    /** Removes and returns the item at the front of the deque.
     * If no such item exists, return nulls.
     */
    public T removeFirst(){
        return null;
    }

    /** Removes and returns the item at the back of the deque.
     * If no such item exists, return nulls.
     */
    public T removeLast(){
        return null;
    }

    /**
     * Gets the item at the given index, where 0 is the front,
     * 1 is the next item, and so forth.
     * If no such item exists, returns null.
     * Must not alter the deque!
     */
    public T get (int index) {
        return null;
    }
}
