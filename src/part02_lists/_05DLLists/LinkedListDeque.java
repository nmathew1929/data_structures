package part02_lists._05DLLists;

public class LinkedListDeque<T> {

    private static class Node<T> {
        public T item;
        public Node next;
        public Node prev;

        public Node(T i, Node n, Node p) {
            item = i;
            next = n;
            prev = p;
        }
    }

    private Node sentinel;
    private int size;

    /** Init a Deque with no items inside.*/
    public LinkedListDeque() {
        sentinel = new Node(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    /** Init a Deque with 1 item in it. */
    public LinkedListDeque(T item) {
        sentinel = new Node(null, null, null);
        sentinel.next = new Node(item, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }

    /** Creates a deep copy of other. Creating an entirely new LinkedListDeque with the exact same items as other
     * Sentinel is not public
     *
     * */
    public LinkedListDeque(LinkedListDeque<T> other) {
        this();
        int count = 0;
        while(count < other.size()) {
            addLast(other.get(count));
            ++count;
        }
    }

    /** Adds an item of type T to the front of the deque */
    public void addFirst(T item){
        Node prevFirst = sentinel.next;
        sentinel.next = new Node(item, prevFirst, sentinel);
        prevFirst.prev = sentinel.next;
        ++size;
    }

    /** Adds an item of type T to the back of the deque */
    public void addLast(T item) {
        Node prevLast = sentinel.prev;
        sentinel.prev = new Node(item, sentinel, prevLast);
        prevLast.next = sentinel.prev;
        ++size;
    }

    /** Returns true if deque is empty, false otherwise */
    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    /** Returns the number of items in the deque */
    public int size() {
       return size;
    }

    /** Prints the items in the deque from frist to last, separated by space. */
    public void printDeque() {
        StringBuilder stringBuilder = new StringBuilder();
        Node runner = sentinel.next;
        while(runner != sentinel) {
            stringBuilder.append(runner.item).append(" ");
            runner = runner.next;
        }
        stringBuilder.append("\n");
        System.out.println(stringBuilder.toString());
    }

    /** Removes and returns the item at the front of the deque,
     * If no such item exists, return null */
    public T removeFirst() {
        if(sentinel.next == sentinel)
            return null;

        Node removeNode = sentinel.next;
        T removeItem = (T) removeNode.item;
        sentinel.next = removeNode.next;
        sentinel.next.prev = sentinel;
        return removeItem;
    }

    /** Removes and returns the item at the back of the deque.
     * If no such item exists, return null */
    public T removeLast() {
        if (sentinel.prev == sentinel)
            return null;

        Node removeNode = sentinel.prev;
        T removeItem = (T) removeNode.item;
        sentinel.prev = removeNode.prev;
        sentinel.prev.next = sentinel;
        return removeItem;
    }

    /** Gets the item at the given index, where 0 is the front, 1 is the next item and so forth
     * if no such items exists, return null. Must not alter the deque. */
    public T get(int index) {
        if( index >= size || index < 0)
            return null;

        int count = 0;
        Node runner = sentinel.next;
        while (count != index) {
            runner = runner.next;
            ++count;
        }
        return (T) runner.item;
    }

    public T getRecursive(int index) {
        return getRecursive(sentinel.next, index);
    }

    private T getRecursive(Node node, int index){
        if(index == 0)
            return (T) node.item;
        return getRecursive(node.next, --index);
    }

    public static void main(String[] args) {
        LinkedListDeque<String> deque = new LinkedListDeque();
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        deque.addLast("2017");
        deque.addLast("2021");
        deque.addLast("2024");
        deque.printDeque();

        LinkedListDeque<String> dq = new LinkedListDeque(deque);
        dq.printDeque();
        System.out.println(dq.getRecursive(2));
    }

}
