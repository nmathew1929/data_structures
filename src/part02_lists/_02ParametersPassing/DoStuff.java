package part02_lists._02ParametersPassing;

import part02_lists._01Walrus.Walrus;

public class DoStuff {
    public static void main(String[] args) {
        Walrus walrus; //64 bit address container.
        int x; //32 bit value container.
        walrus = new Walrus(3500, 10.5);
        x = 9;
        doStuff(walrus, x);
        System.out.println(walrus);
        System.out.println(x);
    }

    //reference and primitive parameter passing.
    public static void doStuff(Walrus W, int x) {
        W.weight = W.weight - 100; //reference state change.
        x = x - 5; //primitive value change.
    }
}
