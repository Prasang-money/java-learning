// super method are by default part of each constructor(super()). when super method get executed they call the 
// contrutor of parent class. If super class has one parameter in that case constructor which has one
// parameter will be executed. By default super method had no parameter so if you want to call the constructor
// with x number parameter then you have to pass the x number of parameter in the super method
//####  this() method
// this method calls the constructor of the current class or you can say in the class it is being called.

// At a time you can either use super method or this method. 
// The concept of parameter which i explain above for super method. Also applies for the this method
// this(x,y) will call the constructor of the current class which accept two parameters.
/**
 * A
 */
class A {
  
    public A(){
        System.out.println("in A");
    }

    public A(int age){
        System.out.println("in A 1");
    }
    
}

/**
 * B
 */
class B extends A{
     int age;
    public B(){
        this(2);
        System.out.println("in B");
    }

    public B( int age){
        
        super(2);
        this.age= age; 
        System.out.println("in B 1");
    }
    
}
public class Super {
    
    public static void main(String[] args) {
        
        B obj = new B();

       // B obj1 = new B(2);
    }
}
