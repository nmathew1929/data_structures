package part04_inheritance;

public class TenX implements IntUnaryFunction{

    /** Returns ten times the argument */
    @Override
    public int apply(int x) {
        return 10 * x;
    }
}
