/**
 * MethodOverloading
 */
// Method overloading is a OOPs concept which allow us to have have mutiple method with same name in a class

// if you see the calculator class had three method with the same name. However
// in the first two add method
// number of parameter is different. And first and third add method has equal
// number of parameter but the
// type of parameter is different. That is the example of method overloading.

// In Java method overloading can be done by either changing the number of
// parameter or type of parameter.
// You can not do the method overloading by changing the method return type.
class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

     public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Method overloading not supported by changing the method return type
    //public double add(int n1, int n2) {
    //    return n1 + n2;
    //}

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

    }
}