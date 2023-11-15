
/**
 * Exceptionthrow
 * 
 * In this exercise we are going to see that how can one throw exception intentionally and we will also
 * try to create custom exception by extention the exception class and after that we can also throw the custom 
 * exception.
 */

 /**
  * CustomException
  */
 class CustomException extends Exception {
  
    public CustomException( String str){
        super(str);
    }
    
 }
public class Exceptionthrow {

    public static void main(String[] args) {
        
        int i=20;
        int j=0;

        try
        {
            j=18/i;
            if(j==0)
                //throw new ArithmeticException("Denominator value is greater than numerator"); // intentionally throwing exception
                // throwing custom exception
                throw new CustomException("Denominator value is greater than numerator");
        }
        catch(CustomException e)
        {
          System.out.println("Something went wrong "+ e);   
        }
        catch(ArithmeticException e)
        {

            System.out.println("deivide by zero");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
    }
}