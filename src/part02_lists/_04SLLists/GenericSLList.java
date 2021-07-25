package part02_lists._04SLLists;
/**
 *  A SLList in where you can pass in the type at runtime.
 */
public class GenericSLList<Type> {

    private static class Node<Type> {
        public Type item;
        public Node next;

        public Node(Type i, Node n) {
            item = i;
            next = n;
        }
    }

    /** The first item (if it exists) is at sentinel.next */
    private Node sentinel;
    private int size;

    /** Creates an empty SLList */
    public GenericSLList() {
        sentinel = new Node(null, null);
        size = 0;
    }

    public GenericSLList(Type x) {
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(Type x) {
        Node prevFirst = sentinel.next;
        sentinel.next = new Node(x, prevFirst);
        ++size;
    }

    /** Returns the first item in the list. */
    public Type getFirst() {
        return (Type) sentinel.next.item;
    }

    public void addLast(Type x) {
        Node runner = sentinel.next;
        while(runner.next != null){
            runner = runner.next;
        }
        runner.next = new Node(x, null);
        ++size;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node runner = sentinel.next;
        while (runner != null) {
            stringBuilder. append(" --> ").append(runner.item);
            runner = runner.next;
        }
        return stringBuilder.toString();
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        GenericSLList<String> L = new GenericSLList();
        L.addFirst("2021");
        L.addFirst("2017");
        L.addLast("2024");
        System.out.println(L.getFirst());
        System.out.println(L.size());
        System.out.println(L.toString());
    }
}
