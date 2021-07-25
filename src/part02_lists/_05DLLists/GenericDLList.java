package part02_lists._05DLLists;

public class GenericDLList<T> {

    private static class Node <T> {
        public T item;
        public Node next;
        public Node prev;


        public Node(T i, Node n, Node p) {
            item = i;
            next = n;
            prev = p;
        }
    }

    /** The first item (if it exists) is at sentinel.next */
    private Node sentinel;
    private int size;

    /** Creates an empty SLList */
    public GenericDLList() {
        sentinel = new Node(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    public GenericDLList(T item) {
        sentinel = new Node(null, null, null);
        sentinel.next = new Node(item, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(T item) {
        Node prevFirst = sentinel.next;
        sentinel.next = new Node(item, prevFirst, sentinel);
        prevFirst.prev = sentinel.next;
        ++size;
    }

    /** Returns the first item in the list. */
    public T getFirst() {
        return (T) sentinel.next.item;
    }

    public void addLast(T item) {
        Node prevLast = sentinel.prev;
        sentinel.prev = new Node(item, sentinel, prevLast);
        prevLast.next = sentinel.prev;
        ++size;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node runner = sentinel.next;
        while (runner != sentinel) {
            stringBuilder.append(" --> ").append(runner.item);
            runner = runner.next;
        }
        return stringBuilder.toString();
    }


    public int size() {
        return size;
    }

    public static void main(String[] args) {
        GenericDLList<String> L = new GenericDLList();
        L.addFirst("Navin");
        L.addFirst ("Hello");
        L.addLast("Mathew");
        System.out.println(L.getFirst());
        System.out.println(L.size());
        System.out.println(L.toString());
    }
}