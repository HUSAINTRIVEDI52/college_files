public class AutoBoxingDemo {
    public static void main(String[] args) {
        // Auto-boxing of int to Integer
        int intPrimitive = 10;
        Integer intWrapper = intPrimitive;
        System.out.println("Primitive int: " + intPrimitive);
        System.out.println("Wrapper Integer: " + intWrapper);

        // Auto-boxing of char to Character
        char charPrimitive = 'A';
        Character charWrapper = charPrimitive;
        System.out.println("Primitive char: " + charPrimitive);
        System.out.println("Wrapper Character: " + charWrapper);

        // Auto-boxing of double to Double
        double doublePrimitive = 12.34;
        Double doubleWrapper = doublePrimitive;
        System.out.println("Primitive double: " + doublePrimitive);
        System.out.println("Wrapper Double: " + doubleWrapper);

        // Auto-boxing of boolean to Boolean
        boolean booleanPrimitive = true;
        Boolean booleanWrapper = booleanPrimitive;
        System.out.println("Primitive boolean: " + booleanPrimitive);
        System.out.println("Wrapper Boolean: " + booleanWrapper);

        // Auto-boxing of float to Float
        float floatPrimitive = 9.81f;
        Float floatWrapper = floatPrimitive;
        System.out.println("Primitive float: " + floatPrimitive);
        System.out.println("Wrapper Float: " + floatWrapper);

        // Auto-boxing of long to Long
        long longPrimitive = 123456789L;
        Long longWrapper = longPrimitive;
        System.out.println("Primitive long: " + longPrimitive);
        System.out.println("Wrapper Long: " + longWrapper);

        // Auto-boxing of short to Short
        short shortPrimitive = 1234;
        Short shortWrapper = shortPrimitive;
        System.out.println("Primitive short: " + shortPrimitive);
        System.out.println("Wrapper Short: " + shortWrapper);

        // Auto-boxing of byte to Byte
        byte bytePrimitive = 100;
        Byte byteWrapper = bytePrimitive;
        System.out.println("Primitive byte: " + bytePrimitive);
        System.out.println("Wrapper Byte: " + byteWrapper);
    }
}
