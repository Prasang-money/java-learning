
// String is a object in java not a primitive type. 
public class string {
    
    public static void main(String[] args) {
         
        // Since String is a Object in java. You can create the instance of string using the bellow method.
       // String name = new String("Prasang");
       // However the most popular way to define string is this

       String name= "Prasang";

       System.out.println("Hello " + name);

       System.out.println(name.hashCode());
       System.out.println(name.charAt(0));
    

    }
}
