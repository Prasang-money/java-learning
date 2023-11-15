// Inteface in java is used to provide 100 percentage abstraction
// Interface is used to achieve multiple inheritence
// interface provide lose coupling

/**
 * Computer
 */
// All the method declared inside a interface are by default public abstact
// All the filed defined inside a interface are bydefault public , static and final

/*
 * type of interface
 * 1- Normal interface:  A interface which has two or more than two method 
 * 2- Functional Interface(SAM): A method which has exactly one method 
 * 3- Marker interface: A method which has no method. Used to pass some information of compiler
 */
interface Computer {
    int x=8;  // public , static , final
    void code(); // public abstract

}

/**
 * X
 */
interface X {

    
}
/**
 * Laptop 
 */
// A class can implement multiple interface but a class can not extend mulltiple class or abstract class
class Laptop implements Computer, X  {

    public void code(){
        System.out.println("coding with Laptop");
    }
}

/**
 * Desktop
 */
class Desktop  implements Computer {
  
    public void code(){
        System.out.println("coding fast with Desktop");
    }
    
}

/**
 * Devloper
 */
class Devloper {


    // method doWork recieve Computer obj as parameter. Any class which implements the interface Computer
    // can be passed as method argument to method doWork
    public void doWork( Computer obj){
        obj.code();
    }
    
}
public class interfaces {
    
    public static void main(String[] args) {
        
        // Creating a Devloper reference and object
        Devloper dev = new Devloper();


        Laptop lap = new Laptop();
        dev.doWork(lap);

        Desktop desk = new Desktop();
        dev.doWork(desk);

        System.out.println(Computer.x);
    
    }
}
