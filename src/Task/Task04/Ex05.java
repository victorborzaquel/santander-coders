import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 5, 4};
        int target = 9;

        Integer[] twoSum = getTwoSum(numbers, target);

        printResult(twoSum);
    }

    static Integer[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int search;
        for (int i = 0; i < numbers.length; i++) {
            map.putIfAbsent(numbers[i], i);

            search = target - numbers[i];
            if (map.containsKey(search)) {
                return new Integer[]{map.get(search), i};
            }
        }
        return new Integer[2];
    }

    static void printResult(Integer[] twoSum) {
        if (twoSum[0] == null || twoSum[1] == null) {
            System.out.println("Lamento, mas não existe essa soma no vetor!");
            return;
        }

        System.out.println("Os indices que tem essa soma são: " + Arrays.toString(twoSum));
    }
}
