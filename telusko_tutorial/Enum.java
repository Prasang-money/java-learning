enum Status {
    Running, Failed, Ready, Pending
}

enum Laptop {
    Mackbook(2000), Sony(1000), Lenvo(7899), Dell;

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enum {

    public static void main(String[] args) {

        Status s = Status.Running;
        System.out.println(s + " : " + s.ordinal());

        Status[] ss = Status.values();

        for (Status s1 : ss) {
            System.out.println(s1 + " : " + s1.ordinal());
        }

        if (s == Status.Running)
            System.out.println("all good");
        else if (s == Status.Ready)
            System.out.println("ready fine");
        else if (s == Status.Pending)
            System.out.println("in pending");
        else
            System.out.println("failed");

        switch (s) {
            case Ready:
                System.out.println("ready from switch");
                break;
            case Running:
                System.out.println("Running from switch");
                break;
            case Pending:
                System.out.println("pending from switch");
            default:
                System.out.println("failed from switch");
                break;
        }

        for (Laptop lap : Laptop.values()) {

            System.out.println(lap + " : " + lap.getPrice());
        }
    }

}
