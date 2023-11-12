
/**
 * A
 */
class A {

    public void show(){
        System.out.println("in A Show");
    }

    /**
     * B
     */
    class B1 {
     public void show1(){
        System.out.println("in B1 show");
     }
        
    }

     static class C1 {
       public void show3(){
        System.out.println("in C1 show");
       }
        
     }
    
}
public class Innerclass {
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
        
        A.B1 obj1 = obj.new B1();
        obj1.show1();


        A.C1 obj2 = new A.C1();
        obj2.show3();
    }

}
