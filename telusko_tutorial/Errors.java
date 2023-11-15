
/**
 *  types of Erros
 * 1- Compile time error
 * 2- Runtime Error (Exception and handling)
 * 3- Logical error (Getting other than expected output)
 */

 /*
  *1- Error- We do not handle error in java. When a error occur in a java code , it stops working.
    Exalple- Thread-death, IO-Error, VirtualMachine error, OutofMemory.

 2- Exception- (RunTimeException, I/oException, SqlException)- These are the exception we handle within the 
 java code. Even in the mentioned exception can be catogarized into two group.
   1- uncheck-exception- Exception which are optional to handle. Even if we do not handle them we will
   get any complain from the compiler.
   For example- Runtime-exception(Arithmatic, ArrayOutOfIndex, NullPointer)

   2- Checked exeption- Compiler forces us to handle these kind of exceprion. If you do nor handle them
   compiler will keep giving error.
   For example- (SqlException, IOException)
  */

public class Errors {
    
    public static void main(String[] args) {
        
        int i=2;
        int j=0;
        String str= null;
        int arr[] = new int[5];
        try
        {
            j= 18/i;

            System.out.println(str.length());
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index is more than array size");
        }
        catch(ArithmeticException e)
        {
          System.out.println("can not divided by zero");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong: " +  e);
        }

        System.out.println(j);
    }

}
