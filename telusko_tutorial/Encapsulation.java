
/**
 * Human
 */
class Human {
    private int age;
    private String name;

    public Human(){
        System.out.println("in human");
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("in human 2");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj= new Human();

        obj.setAge(10);
        obj.setName("Prasang");

        System.out.println(obj.getAge() +" : " + obj.getName());
    }
}
