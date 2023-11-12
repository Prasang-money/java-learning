// There are two types of string in java
// 1- mutable   2- immutable
// String name ="Prasang" is a immutale string. If i modifie the name variable it will create a new string
// object and stores the new value. It will not modifie the existing string object.

// StringBuffrer and StringBuilder is mutable string. The difference between stringBuffer and stringBuilder 
// is that stringBuffrer is thread safe and stringBuilder is not.
public class stringBuffrer {
    
    public static void main(String[] args) {
        
         StringBuffer sb = new StringBuffer("Prasang Mani");
         
         sb.append(" manav");
        // String s= sb.toString();
         sb.insert(2, " ant");
         sb.setLength(20);
         sb.ensureCapacity(100);

         System.out.println(sb.length());
         System.out.println(sb.capacity());
         System.out.println(sb);
    }
}
