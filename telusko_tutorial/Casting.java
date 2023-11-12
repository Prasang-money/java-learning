// Casting is converting one type of data into other type data. When to convert a lower type data 
// into upper type data that is called upcasting and when we convert the a upper type data
// into lower type data that is called DownCasting.

/**
 * A
 */
class A {
  public void show1(){
    System.out.println("in A show");
  }
    
}

/**
 * B
 */
class B extends A {

    public void show2(){
        System.out.println("in B show");
    }
    
}
public class Casting {
    
    public static void main(String[] args) {
        
        int num1= 8;

        // upcasting
        double num2= num1;
        System.out.println(num2);

        // DownCasting

        double num3 = 10.98;
        int num4= (int)num3;
        System.out.println(num4);

     // How to do type casting in case of classes

     // This is a example of upcasting where we have a reference of type Class A and storing
     // the instance of Class B. And class B extend the class A therefore class A is the parent
     // class of class B.
     A obj = new B();
     obj.show1();
     // Since we can not call the method show2 on obj object 
     // we will downcast the obj object to class B type reference and then we will call
     // the show2 method on that.

     B obj1 = (B)obj;
     obj1.show2();
     


     
    }
}
