import java.util.HashMap;

public class Baskin {
    // Hashmap for memoization, AKA dictionary
    private static HashMap<Integer,Integer> map = new HashMap<>();
    public static int baskin(int num) {
        // Check if num in map, get value from key
        if (map.containsKey(num)) {
            return map.get(num);
        }

        // If 1 or 0, possibility counts as 1 for adding possibilities recursively
        if (num == 1 || num == 0) {
            return 1;
        }
        // Recursively add possibilities, each time removing 1 or 2 from num
        int result = baskin(num - 1) + baskin(num - 2);
        // Save key and value in map
        map.put(num, result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(baskin(5));
    }
}