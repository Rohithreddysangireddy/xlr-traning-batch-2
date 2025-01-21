
import java.util.HashSet;

public class Demo32 {

    public static void main(String[] args) {
        // Create a HashSet to store string values
        HashSet<String> stringSet = new HashSet<>();

        // Add some string values to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");

        // Display the HashSet
        System.out.println("HashSet: " + stringSet);

        // Check if a specific value is in the HashSet
        if (stringSet.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        } else {
            System.out.println("Banana is not in the HashSet.");
        }

        // Remove a value from the HashSet
        stringSet.remove("Date");
        System.out.println("HashSet after removing Date: " + stringSet);
    }
}
