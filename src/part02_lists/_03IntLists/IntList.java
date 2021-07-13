package part02_lists._03IntLists;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Recursively get value of a certain value.  **/
    public int get(int i) {
        if(i == 0)
            return this.first;
        return this.rest.get(--i);
    }

    public int iterativeGet(int i) {
        int counter = 0;
        IntList runner = this;
        while(counter < i) {
            runner = runner.rest;
            counter++;
        }
        return runner.first;
    }

    /** Return the size of the list using... recursion!*/
    public int size() {
        if(rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int iterativeSize() {
        int count = 0;
        IntList runner = this;
        if(runner == null)
            return count;
        while(runner != null) {
            runner = runner.rest;
            count++;
        }
        return count;
    }

    public static IntList incrList(IntList L, int x) {
        IntList Runner  = L;
        return L;
    }

    public static IntList dincrList(IntList L, int x) {
        return L;
    }
    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
        System.out.println(L.iterativeGet(1));
    }
}
