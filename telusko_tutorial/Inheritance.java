// inheritance is a concept by which a class inherits the fields and methods of other class. The class 
// which inherits the other class know as child or subclass and the class to which it inherits called as
// parents or super class.

// multi level inheritance is possible in java. However multiple inheritance is not allowed in java.
/**
 * Calc
 */
class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public void show(){
        System.out.println("in class Calc");
    }
}

/**
 * AdvCalc
 */
// AdvCalc will inherits the add and sub method from Calc by inheriting the Calc class. extends key word 
// is used for inherting the other class.
class AdvCalc extends Calc {

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {
        return n1 / n2;
    }

    // method overriding
    // Here we will provide the different definition of method show
     public void show(){
        System.out.println("in class AdvCalc");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // creating object of cladd Calc
        Calc obj = new Calc();
        int r1 = obj.add(2, 2);
        int r2 = obj.sub(7, 4);

        AdvCalc obj2 = new AdvCalc();
        int r3 = obj2.multiply(3, 4);
        double r4 = obj2.division(15, 4);
        obj2.show();

        
        System.out.println(r1 + " : " + r2 + " : "+ r3 + " : "+ r4);
    }
}
