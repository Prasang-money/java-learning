
// Dynamic Method Dispatch is one form of runtime polymorphism. it is achieved through function overriding 
// and function overriding is achieved through interface.
/**
 * A
 */
class A {
    
    public void show(){
        System.out.println("in A show");
    }
}

/**
 * 
 */
class B extends A{
    int x;
    public void show(){
        System.out.println("in B show");
    }
    
}

/**
 * C
 */
class C extends A{
    public void show(){
        System.out.println("in C show");
    }
    
}
public class DMethod {
    
    public static void main(String[] args) {
     
    // Here we have created a reference variable of class A. Then we assign the object of class A,B and C.
    // Based on what kind of object reference variable obj store. That class show methos will be executed.
    // And the decision of which class show method will be executed is decided at the runtime and this phenomena
    // is known as Dynamic dispatch method.
        A obj = new A();
        obj.show();

        obj= new B();
        obj.show();

        obj= new C();
        obj.show();
    }
}
