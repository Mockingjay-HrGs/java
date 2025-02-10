import java.util.ArrayList;
public class Exo3 {
    public class AllTypesDemo {
        public static void main(String[] args) {
            byte byteVar = 127;         
            short shortVar = 32000;     
            int intVar = 2147483647;    
            long longVar = 9223372036854775807L; 

            float floatVar = 3.14f;     
            double doubleVar = 3.141592653589793; 

            char charVar = 'J';         

            boolean boolVar = true;     

            String stringVar = "Hello, Java!";

            int[] intArray = {1, 2, 3, 4, 5};

            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Java");
            stringList.add("Code");

            Object obj = new Object();

            String nullReference = null;

            var inferredType = 42; 

            
            System.out.println("=== Types Primitifs ===");
            System.out.println("byte: " + byteVar);
            System.out.println("short: " + shortVar);
            System.out.println("int: " + intVar);
            System.out.println("long: " + longVar);
            System.out.println("float: " + floatVar);
            System.out.println("double: " + doubleVar);
            System.out.println("char: " + charVar);
            System.out.println("boolean: " + boolVar);

            System.out.println("\n=== Types de Référence ===");
            System.out.println("String: " + stringVar);
            System.out.println("Array: " + java.util.Arrays.toString(intArray));
            System.out.println("ArrayList: " + stringList);
            System.out.println("Object: " + obj);
            System.out.println("Null reference: " + nullReference);
            System.out.println("Var type (inferred): " + inferredType);
        }
    }

    
}
