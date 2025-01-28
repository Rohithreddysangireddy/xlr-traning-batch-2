
import java.util.ArrayList;

public class Demo029 {

    public static void main(String[] args) {
        // Create an ArrayList to store friends' names
        ArrayList<String> friends = new ArrayList<>();

        // Add 10 friends' names to the ArrayList
        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");
        friends.add("Diana");
        friends.add("Edward");
        friends.add("Fiona");
        friends.add("George");
        friends.add("Hannah");
        friends.add("Ian");
        friends.add("Jessica");

        // Display the names of the friends
        System.out.println("List of friends:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
