
abstract class Car {
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("playing music.....");
    }
}

/**
 * Wagon
 */
abstract class Wagon  extends Car{

    public void drive(){
        System.out.println("driving wagon");
    }

    
}

/**
 * UpdatedWagon
 */
class UpdatedWagon extends Wagon{

     public void fly(){
        System.out.println("flying wagon");
     }
    
}
public class Abstract {
    
    public static void main(String[] args) {
        
        Car obj = new UpdatedWagon();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}
