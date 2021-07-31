# A New Way

## How Does a Programmer Know That Their Code Works?

We have some that code that runs locally and yell at you if did something wrong.

In the real world, programmer believe their code works because of tests they write themselves.

- Knowing that it works for sure is usually impossible.
- This will be our new way.

![image-20210730215050158](images/image-20210730215050158.png)

## Ad Hoc Testing vs JUnit

The sort method destructively sorts elements inside the original array.

```java
//Ad Hoc
public class TestSort {
    /** Test the Sort.sort method. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg."};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);

        /**equals operator does not compare contents of the array, but the addresses of the array.
        this is a bug **/
        //if (input != expected) {

        for(int i=0; i<input.length; ++i) {
            if(!input[i].equals(expected[i])){
                System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i]);
                return;
            }
        }

//        if(!java.util.Arrays.equals(input, expected))
//            System.out.println("Error! There seems to be a problem with Sort.sort.");

    }
    public static void main(String[] args) {
        testSort();
    }
}

```

```java
//Junit
public class TestSort {
    /** Test the Sort.sort method. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg."};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(input, expected);
    }
    public static void main(String[] args) {
        testSort();
    }
}

```

