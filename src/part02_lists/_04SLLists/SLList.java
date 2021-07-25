package part02_lists._04SLLists;

/** An SLList is a list of integers, which hides the terrible truth of the nakedness within.
 */

public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /** The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;

    /** Creates an empty SLList */
    public SLList() {
        sentinel = new IntNode(-1, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(-1, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        IntNode prevFirst = sentinel.next;
        sentinel.next = new IntNode(x, prevFirst);
        ++size;
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        IntNode runner = sentinel.next;
        while(runner.next != null){
            runner = runner.next;
        }
        runner.next = new IntNode(x, null);
        ++size;
    }



    public int size() {
        return size;
    }

    public static void main(String[] args) {
        /** Creates a list of one integer, namely 10 */
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
}
