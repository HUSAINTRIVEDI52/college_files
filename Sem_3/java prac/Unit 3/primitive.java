public class primitive {
    public static void main(String[] args) {
        
        int primitiveInt=10;
        char primitiveChar='S';
        double primitiveDouble=10.9;
        boolean primitiveBoolean=true;


        Integer wrappedInt=primitiveInt;
        Character wrappedChar=primitiveChar;
        double wrappedDouble=primitiveDouble;
        boolean wrappedboolean=primitiveBoolean;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrappedInt);

        System.out.println("Primitive char: " + primitiveChar);
        System.out.println("Wrapper Character: " + wrappedChar);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrappedDouble);

        System.out.println("Primitive boolean: " + primitiveBoolean);
        System.out.println("Wrapper Boolean: " + wrappedboolean);
    }
}
