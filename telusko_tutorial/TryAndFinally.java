import java.util.Scanner;

public class TryAndFinally {

    public static void main(String[] args) {

        int num = 0;
        // Scanner sc = null;

        // instead if putting this code into finally block.
        // we can put it into try block itself and try block will close this resource
        // after the excecution of try block code.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enetr a number");
            // sc = new Scanner(System.in);

            num = sc.nextInt();

        }
        // finally {
        // // irrespective to if try block throw a exception or not finally block will
        // be
        // // executed.
        // // So if you want to close any resource or you want to execute some statement
        // // irrspective to
        // // try block throwing a exception or not , in that you put that code into
        // // finally block.
        // // with finally block you can also use the catch block to handle the
        // exception
        // sc.close();
        // }

        System.out.println(num);
    }
}
