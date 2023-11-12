// Static variable are also known as class variable. They are associated with class and they are shared across
// all the object of that class. If you make any changes to the static varibale it will be reflect to all the current
// object to that class.

/**
 * Mobile
 */
class Mobile {
    String brand;
    int price;
    static String name;

    // static block
    static
    {
         name="Phone";
    }

    // contructor
    Mobile()
    {
        brand= "Apple";
        price= 1200;
    }

    public void show() {
        System.out.println(brand + ": " + price + " : " + name);
    }

    // You can use the instance varibale into static method since static methods are linked with call.
    // We call static method with the help of class so they are not aware about the value of instance variable.
    // However if you see the below static method show1 in which we can access the instace variabe. The reason
    // we are able to so because static method is recieving the reference of object as method parameter. Now
    // using this method we can access the instance variable of object obj.
    public static void show1( Mobile obj){
        System.out.println(obj.brand + ": " + obj.price + " : " + name);
    }

}

public class Static {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1700;

        Mobile m2 = new Mobile();

        m1.show();
        m2.show();

        Mobile.show1(m1);

    }
}
