package part001;

public class _03LargerDemo {
    /** Return teh larger of x and y. */
    public static int larger(int x, int y) {
        if (x > y)
            return x;
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(3, 2));
    }
}

/*
    1. Functions must be declared as part of a class in Java.
        A function must be part of a class is called a method
        So in Java, all functions are methods.
    2. To define a function in Java, we use "public static"
        There are other ways of defining functions later.
    3. All parameters of a function must have a declared type,
        and the return value of the function must have a declared type.
        Functions in Java return only one value;
 */
