package part02_lists._05DLLists;

import part02_lists._04SLLists.GenericSLList;

public class DLList {

    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode prev;


        public IntNode(int i, IntNode n, IntNode p) {
            item = i;
            next = n;
            prev = p;
        }
    }

    /** The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;

    /** Creates an empty SLList */
    public DLList() {
        sentinel = new IntNode(-1, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    public DLList(int x) {
        sentinel = new IntNode(-1, null, null);
        sentinel.next = new IntNode(x, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        IntNode prevFirst = sentinel.next;
        sentinel.next = new IntNode(x, prevFirst, sentinel);
        prevFirst.prev = sentinel.next;
        ++size;
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        IntNode prevLast = sentinel.prev;
        sentinel.prev = new IntNode(x, sentinel, prevLast);
        prevLast.next = sentinel.prev;
        ++size;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        IntNode runner = sentinel.next;
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
        DLList L = new DLList();
        L.addFirst(2021);
        L.addFirst(2017);
        L.addLast(2024);
        System.out.println(L.getFirst());
        System.out.println(L.size());
        System.out.println(L.toString());
    }
}