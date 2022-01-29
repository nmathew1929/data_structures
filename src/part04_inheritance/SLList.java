package part04_inheritance;

import part02_lists._05DLLists.LinkedListDeque;

/** An SLList is a list of integers, which hides the terrible truth of the nakedness within.
 */
public class SLList<Type> implements List61B<Type> {
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
    public SLList() {
        sentinel = new Node(null, null);
        size = 0;
    }

    public SLList(Type x) {
        sentinel = new SLList.Node(null, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    @Override
    public void addFirst(Type x) {
        Node prevFirst = sentinel.next;
        sentinel.next = new Node(x, prevFirst);
        ++size;
    }

    /** Returns the first item in the list. */
    @Override
    public Type getFirst() {
        return (Type) sentinel.next.item;
    }

    @Override
    public Type getLast() {
        Node runner = sentinel.next;
        while(runner.next != null){
            runner = runner.next;
        }
        return (Type) runner.item;
    }

    @Override
    //the reason why we made doubly linked list.
    public Type removeLast() {
        size -= 1;
        Type x = getLast();

        if (sentinel.next.next == null){
            sentinel.next = null;
            return x;
        }

        Node p = sentinel.next;

        while (p.next.next != null){
            p = p.next;
        }
        p.next = null;
        return x;
    }

    public void addLast(Type x) {
        size += 1;

        if (sentinel.next == null){
            sentinel.next = new Node(x, null);
            return;
        }

        Node p = sentinel.next;

        while (p.next != null){
            p = p.next;
        }
        p.next = new Node(x, null);
    }

    @Override
    public Type get(int index) {
        return get(sentinel.next, index);
    }

    @Override
    public void insert(Type x, int position) {

    }

    //Implementation
    private Type get(Node node, int index){
        if(index == 0)
            return (Type) node.item;
        return get(node.next, --index);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        SLList.Node runner = sentinel.next;
        while (runner != null) {
            stringBuilder. append(" --> ").append(runner.item);
            runner = runner.next;
        }
        return stringBuilder.toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    public static void main(String[] args) {
       SLList<String> L = new SLList();
        L.addFirst("2021");
        L.addFirst("2017");
        L.addLast("2024");
        System.out.println(L.getFirst());
        System.out.println(L.size());
        System.out.println(L.toString());
    }
}
