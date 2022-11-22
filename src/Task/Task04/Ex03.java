import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] numeros = {2, 7, 5, 4};
        int target = 9;

        int[] twoSum = getTwoSum(numeros, target);

        System.out.println(Arrays.toString(twoSum));
    }

    static int[] getTwoSum(int[] numeros, int target) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
