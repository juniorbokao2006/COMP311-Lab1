public class Question2 {
    public static void main(String[] args) {
        byte byteVal = 100;
        short shortVal = 20000;
        int intVal = 350000;
        long longVal = 9000000000L; // L suffix needed - value exceeds int range
        float floatVal = 3.14f;     // f suffix needed for float literals
        double doubleVal = 3.14159265;
        char charVal = 'J';
        boolean booleanVal = true;

        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + booleanVal);
    }
}