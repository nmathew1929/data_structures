package part02_lists._06Arrays;

public class ArrayBasics2 {
    public static void main(String[] args) {
        int[][] pascalsTriangle;
        pascalsTriangle = new int[4][];
        int[] rowZero = pascalsTriangle[0];

        pascalsTriangle[0] = new int[]{1};
        pascalsTriangle[1] = new int[]{1, 1};
        pascalsTriangle[2] = new int[]{1, 2, 1};
        pascalsTriangle[3] = new int[]{1, 3, 3, 1};
        int[] rowTwo = pascalsTriangle[2];
        rowTwo[1] = -5;

        int[][] matrix;
        matrix = new int[4][];//creates 1 total array with null values in it.
        matrix = new int[4][4]; //creates 5 total arrays with null values in 4 them.

        int[][] pascalAgain  = new int[][] {
                {1},
                {1, 1},
                {1, 2, 1},
                {1,3, 3, 1}};

    }
}
