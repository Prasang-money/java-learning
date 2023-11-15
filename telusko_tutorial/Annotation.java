// Annotation are the way to pass more information to compiler or to runtime
/**
 * A
 */
class A {

  public void show(){
    System.out.println(" in A show");
  }
}

/**
 * B
 */
class B  extends A {

    @Override  // Annotation
    public void show(){
        System.out.println(" in B show");
    }
}
public class Annotation {
    
    public static void main(String[] args) {
         
        A obj = new B();
        obj.show();
    }
}
