import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int num=0;
        try{
         num = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter input is not type integer: "+e);
        }
        

        System.out.println(num);

        sc.close();
    }
}
