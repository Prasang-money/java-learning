
// Normal array store the group of primitive data type. But collection in array do not store the
// primitive date type they are the collection of non-primitive data type for example collection
// of wrapper class

// Wrapper class are built in top of primitive type.
// int --> Integer
/*
byte: Byte
short: Short
int: Integer
long: Long
float: Float
double: Double
char: Character
boolean: Boolean
 */

public class Wrapper {
    
    public static void main(String[] args) {
        
        int num1= 8;
        Integer num2 = num1;

        int num3 = num2;
        System.out.println(num3);

        String str = "12";

        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
