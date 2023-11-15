// A intrface  which have a single method is know as functional interface

/**
 * A
 */
@FunctionalInterface
interface A {

     void show();

}
/**
 * Functionalinterface
 */
public class Functionalinterface {

    public static void main(String[] args) {
        
     A obj = new A() {
        public void show(){
            System.out.println(" in show");
        }
     };

     obj.show();
    }
}