// Annonymous inner class
/**
 * A
 */
class A {

    public void show() {
        System.out.println("in a show");
    }
}

// Abstract anonymous class
// Java does not allow us to create the instance of abstract class.
// We are going to create the instance of abstract class with the help of anonymous class

abstract class Car {

    abstract public void drive();
}

public class Anonymousinner {

    public static void main(String[] args) {

        // here we are creating a anonymous inner class and overriding the methow show
        // This class has no name and class declaration is provided at the place when we
        // creating the object of class
        // This Anonymous class is present inside the Demo class and has no name that is
        // why it is called
        // anonymous inner class
        A obj = new A() {
            public void show() {
                System.out.println("in a new show");
            }
        };

        obj.show();


        // creating instance of abstract class Car with the help of anonymous class.
        // Anonymous class is the one providing the definition of abstart method drive
        Car obj1 = new Car() {
            public void drive() {
                System.out.println("driving....");
            }
        };

        obj1.drive();
    }
}
