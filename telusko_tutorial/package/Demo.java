import others.tools.AdvCalc;
import others.tools.Calc;
/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
         Calc obj = new Calc();
         int r1=obj.add(3, 4);

         AdvCalc obj2 = new AdvCalc();
         int r2=obj2.multiply(3, 4);

         System.out.println(r1 + " : "+ r2);
    }
}