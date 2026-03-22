public class MutableStringExample {
    public static void main(String[] args) {
        // --- Using String (Immutable) ---
        String str = ""; // An empty String object is created
        System.out.println("Original String: " + str);

        str += "a"; // A *new* String object ("a") is created, 'str' now refers to it
        str += "b"; // Another *new* String object ("ab") is created, 'str' now refers to it
        str += "c"; // Another *new* String object ("abc") is created, 'str' now refers to it

        System.out.println("Final String (many objects created): " + str);
        
        System.out.println("\n----------------------------------------\n");

        // --- Using StringBuilder (Mutable) ---
        StringBuilder sb = new StringBuilder(); // A single StringBuilder object is created
        System.out.println("Original StringBuilder capacity: " + sb.capacity()); // Initial default capacity is 16

        sb.append("a"); // Modifies the existing 'sb' object
        sb.append("b"); // Modifies the existing 'sb' object
        sb.append("c"); // Modifies the existing 'sb' object

        System.out.println("Final StringBuilder (one object modified): " + sb.toString());
    }
}


/*Key StringBuilder Methods
StringBuilder includes methods for modifying the sequence directly, such as append(), insert(), delete(), and replace(). It also offers methods for basic information retrieval like length() and charAt(). 
The Knowledge Academy
The Knowledge Academy
 +3
Common StringBuilder methods include append() (add to end), insert() (insert at index), replace() (replace range), delete()/deleteCharAt() (remove characters), reverse(), and toString(). Information methods like length() and capacity() are also supported. Unlike String, StringBuilder lacks methods such as toUpperCase(), contains(), and split() */