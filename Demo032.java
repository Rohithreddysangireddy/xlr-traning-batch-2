
import java.util.*;

class HashSetStringDemo {

    void hashSetMethod() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.remove("Hyderabad");
        hashSet.add("Mumbai");
        hashSet.add("Delhi");
        hashSet.add("Agra");
        hashSet.add("Vizag");
        hashSet.add("Chennai");

        System.out.println("Elements of the HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}

public class Demo032 {

    public static void main(String[] args) {
        HashSetStringDemo obj = new HashSetStringDemo();
        obj.hashSetMethod();
    }
}
