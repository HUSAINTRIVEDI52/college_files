public class StringBufferDemo {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string to the buffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specified position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace a part of the string
        sb.replace(6, 10, "Wonderful");
        System.out.println("After replace: " + sb);

        // Delete a part of the string
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Ensure the capacity of the buffer
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // Set the length of the string buffer
        sb.setLength(5);
        System.out.println("After setLength(5): " + sb);
        
        // Get the length of the string buffer
        int length = sb.length();
        System.out.println("Length of the StringBuffer: " + length);

        // Get the capacity of the string buffer
        int capacity = sb.capacity();
        System.out.println("Capacity of the StringBuffer: " + capacity);

        // Get the character at a specific index
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // Set the character at a specific index
        sb.setCharAt(0, 'Y');
        System.out.println("After setCharAt(0, 'Y'): " + sb);
    }
}
