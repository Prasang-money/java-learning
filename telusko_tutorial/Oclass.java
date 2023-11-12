
// Every class in java by default extends the Object class. Object class ha s certin method which
// you can use on the object of your class or you can also override those method and provide your
// class specific definition of those method.
// In this tutorial we are going to talk about Object class and it's method. 

/**
 * Laptop
 */
class Laptop {
    String model;
    int price;
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
}

public class Oclass {

    public static void main(String[] args) {

        Laptop obj = new Laptop();
        obj.model = "Dell";
        obj.price = 60000;

        Laptop obj1 = new Laptop();
        obj1.model = "Dell";
        obj1.price = 60000;

        System.out.println(obj.toString());

        System.out.println(obj.equals(obj1));
    }
}
