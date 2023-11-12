
// In this tutorial we will learn about the Anonymous object and how to use them.


/**
 * A
 */
 class A {
 public void show(){
    System.out.println("in class A");
 }
    
}
/**
 * AnonymousObject
 */
public class AnonymousObject {


    public static void main(String[] args) {
        // Here I am able to create a object of class A and call the show method without storing  the
        // object into a reference variable(A obj)
         new A().show();
    }
    
}