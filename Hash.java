import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put(null, 3);
        map.put("Banana", 5);
        map.put("Orange", 2);

        // Printing the map
        System.out.println("Map: " + map);  // Output: {Apple=3, Banana=5, Orange=2}

        // Accessing value by key
        int appleCount = map.get("Apple");
        System.out.println("Apple count: " + appleCount);  // Output: 3

        // Checking if key exists
        boolean hasApple = map.containsKey("Apple");
        System.out.println("Contains 'Apple' key? " + hasApple);  // Output: true

        // Removing a key-value pair
        map.remove("Banana");
        System.out.println("Map after removing 'Banana': " + map);  // Output: {Apple=3, Orange=2}

        // Checking the size of the map
        System.out.println("Size of the map: " + map.size());  // Output: 2
    }
}
