
// A intrface  which have a single method is know as functional interface

/**
 * A
 */
@FunctionalInterface
interface A {

    int add(int i, int j);

}

/**
 * Lamda
 */
public class Lamda {

    public static void main(String[] args) {

        // A obj = (int i, int j) -> {
        // return i + j;
        // };

        A obj = (i,j) ->  i + j;
       

        int result= obj.add(4, 5);
        System.out.println(result);
    }
}