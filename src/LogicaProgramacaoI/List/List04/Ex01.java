package LogicaProgramacaoI.List.List04;

public class Ex01 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        int[] arrayConcatenado = concatenaArray(a, b);
        printArray(arrayConcatenado);
    }

    public static int[] concatenaArray(int[] a, int[] b) {
        int[] output = new int[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            output[i * 2] = a[i];
            output[i * 2 + 1] = b[i];
        }
        return output;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }
}
