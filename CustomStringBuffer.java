public class CustomStringBuffer {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        // 1. append()
        stringBuffer.append("Hello");

        // 2. insert()
        stringBuffer.insert(5, " World");

        // 3. replace()
        stringBuffer.replace(6, 11, "There");

        // 4. delete()
        stringBuffer.delete(5, 11);

        // 5. charAt()
        char charAtIndex = stringBuffer.charAt(3);

        // 6. setCharAt()
        stringBuffer.setCharAt(0, 'J');

        // 7. length()
        int length = stringBuffer.length();

        // 8. capacity()
        int capacity = stringBuffer.capacity();

        // 9. ensureCapacity()
        stringBuffer.ensureCapacity(20);

        // 10. toString()
        String result = stringBuffer.toString();

        // 11. substring(int start)
        String substring1 = stringBuffer.substring(2);

        // 12. substring(int start, int end)
        String substring2 = stringBuffer.substring(1, 4);

        // Print results
        System.out.println("Result: " + result);
        System.out.println("Char at index 3: " + charAtIndex);
        System.out.println("Length: " + length);
        System.out.println("Capacity: " + capacity);
        System.out.println("Substring1: " + substring1);
        System.out.println("Substring2: " + substring2);
    }
}
