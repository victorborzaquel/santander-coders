package Task.Task04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CorrecaoProf {
    public static void main(String[] args) {
        int[] nums = {5, 4, 6};
        int target = 10;

        int[] results = twoSum(nums,target);


        if (results == null) {
            System.out.println("Nada");
        } else {
            for (int result : results) {
                System.out.println(result);
            }
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0, diff; i < nums.length; i++) {
            diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
