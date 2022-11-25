package Class.Class07;

public class Matriz {
    public static void main(String[] args) {
        int[] vetor = new int[2];
        int[][] matriz = new int[2][2];

        matriz = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        printArray(matriz);
    }

    public static void printArray(int[][] matriz) {
        System.out.print("{ ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print(", ");
        }
        System.out.print(" }");
    }
}
