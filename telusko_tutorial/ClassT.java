

class Calculator {
  int num1;
  int num2;
 
  public int add(){
    return num1+ num2;
  }
}
public class ClassT {
    
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        calc.num1=3;
        calc.num2=4;

        int sum = calc.add();

        System.out.println(sum);
    }
}
