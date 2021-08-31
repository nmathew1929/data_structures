package part04_inheritance;

public class IsaDemo {
    public static void main(String[] args) {
        SLList<String> someList = new SLList<>();
        someList.addFirst("elk");
        someList.addLast("dwell");
        someList.addLast("on");
        someList.addLast("existential");
        someList.addLast("crises");
        someList.print();
    }
}
