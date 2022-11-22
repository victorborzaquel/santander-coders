package Class.Class06;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        int[] nums = {7, 10, 13};

        // Key - Value
        Map<String, Double> map = new HashMap<>();
        map.put("Victor", 10.0);
        map.put("Hugo", 8.0);
        map.put("Mat", 9.0);
        System.out.println(map.get("Victor"));

        Map<Integer, String> alunos = new HashMap<>();
        alunos.put(123, "victor");
        alunos.put(222, "hugo");
        alunos.put(333, "mat");
        alunos.putIfAbsent(333, "matws");
        System.out.println(alunos);
        alunos.remove(222);
        alunos.put(333, "mats");
        System.out.println(alunos);
        System.out.println(alunos.containsKey(222));
    }
}
