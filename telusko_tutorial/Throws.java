/*
 * In this tutorial we will talk about the throws keyword which has a different meaning than the throw keyword used 
 * for throwing intentional error within  a method. 
 * throws keyword is used to throw the exception from one method to another method. So instead of handling the 
 * exception within the method we can throws the exception to the parent method(method which will call the current method)
 * and then either we can handle the exception in parent method or parent method can throws the exception to it's
 * parent method.
 */

 /**
  * A
  */
 class A {
 
    // Throwing exception from method show. We hope parent class will handle the exception
    public void show() throws ClassNotFoundException{
        //Class.forName("Throws");
         Class.forName("Demo");
    }
 }
public class Throws {
    
    static
    {
         System.err.println("Class loaded successfully");
    }
    public static void main(String[] args) {
        

        A obj = new A();
        try{
             obj.show();
        }
        catch(ClassNotFoundException e)
        {
          System.out.println("Class not found "+ e);
        }
        
    }
}
