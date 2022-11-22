package Task.Task04;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 0);
        map.put(7, 1);
        map.put(11, 2);
        map.put(15, 3);

        for (int key : map.keySet()) {
            int result = target - key;
            boolean contains = map.containsKey(target - key);
            if (contains) {
                System.out.println(map.get(key) + " " + map.get(result));
                return;
            }
        }
    }
}
