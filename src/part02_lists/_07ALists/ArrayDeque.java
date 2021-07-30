package part02_lists._07ALists;

/**
 *  Invariants
 *      size will always tell the amount of items in the list.
 *      the list will wrap  forward if there space in the front.
 *      the list will wrap backward if there space in the back.
 *      the list will resize if all the spaces are filled.
 *          if firstIdx is negative it is the back of the list.
 *          if lastIdx is postive it is the front of the list.
 *
 *      firstIdx points to the abstract beginning of our list.
 *      lastIdx points to the abstract end of our list.
 *
 *      To get the concrete Idx on the items array []Idx%item.length
 *
 *      When the items is full or when the circular array is full. firstIdx and lastIdx should be near each other.
 *
 */

public class ArrayDeque<T> {
    private int firstIdx, lastIdx, size;
    private Object  items[];


    public ArrayDeque() {
       this(4);
    }

    private ArrayDeque(int itemCapacity) {
        items = new Object[itemCapacity];
        size = 0;
        firstIdx = 0;
        lastIdx = 0;
    }

    /** Adds an item of type T to the front of the deque **/
    public void addFirst(T item) {
        if(size == items.length)
            resize(size*2);
        if(size == 0){
            items[firstIdx] = item;
        } else {
            --firstIdx;
            items[Math.floorMod(firstIdx, items.length)] = item;
        }
        ++size;
    }

    private void resize(int capacity) {
        Object[] a = new Object[capacity];
        int concreteLast = Math.floorMod(lastIdx, items.length);
        int concreteFirst = Math.floorMod(firstIdx, items.length);

        if(concreteLast > concreteFirst)
            System.arraycopy(items, concreteFirst, a, 0, size); //copies the contiguous chunk to the new array starting from zero.
        else if(concreteFirst >= concreteLast){
                                //fromarr, fromIdx, toarr,  toIdx, length;
                System.arraycopy(items, concreteFirst, a, 0, size-concreteFirst);
                System.arraycopy(items, 0, a, size-concreteFirst, concreteLast+1);
        }
        items = a;
        firstIdx = 0;
        lastIdx = size-1;
    }

    /** Adds an item of type T to the back of the deque **/
    public void addLast(T item) {
        if(size == items.length)
            resize(size *2);
        if(size == 0){
            items[lastIdx] = item;
        } else{
            ++lastIdx;
            items[Math.floorMod(lastIdx, items.length)] = item;
        }
        ++size;
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
        if(size == 0)
            return null;
        int concreteFirst = firstIdx % items.length;
        T item = (T) items[concreteFirst];
        items[concreteFirst] = null;
        ++firstIdx;
        --size;
        return item;
    }

    /** Removes and returns the item at the back of the deque.
     * If no such item exists, return nulls.
     */
    public T removeLast(){
        if(size == 0)
            return null;
        int concreteLast = lastIdx % items.length;
        T item = (T) items[concreteLast];
        items[concreteLast] = null;
        --lastIdx;
        --size;
        return item;
    }

    /**
     * Gets the item at the given index, where 0 is the front,
     * 1 is the next item, and so forth.
     * If no such item exists, returns null.
     * Must not alter the deque!
     */
    public T get (int index) {
        index = index + firstIdx;
        index = Math.floorMod(index, items.length);
        return (T) items[index];
    }

    public static void main(String[] args) {
      ArrayDeque<String> adq = new ArrayDeque<>();

//      adq.addFirst("Hello");
//      adq.addFirst("World");
//      adq.addFirst("Navin");
//      adq.addFirst("Mathew");
//      adq.addFirst("Candy");

        adq.addLast("Hello");
        adq.addLast("World");
        adq.addLast("Navin");
        adq.addFirst("Mathew");
        adq.addLast("Candy");
        adq.printDeque();
        System.out.println(adq.removeLast());
        adq.printDeque();


        System.out.println(adq.get(2));
    }
}
