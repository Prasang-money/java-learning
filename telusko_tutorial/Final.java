// Final variable, method and class
// Final variables are constant

/**
 * A
 */
final class F {
// Since this method is defined as final no other class can inherit the class F. so final keyword is used with class
// to stop the inheritance
    
}
class A {
    // once created and initialized a final varibale it's value can not be chnaged
    final int x = 8;
    
    // This method can not overriden in the extended class because method is defined as final
    final public void show(){
        System.out.println("in A show");
    }


}

/**
 * B
 */
class B  extends A{
 
    // class B can not override the method show of class A because show method in class A  is defined as final
    
}

public class Final {

    public static void main(String[] args) {

    }
}
