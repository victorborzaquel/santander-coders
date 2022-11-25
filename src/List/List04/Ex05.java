package List.List04;

public class Ex05 {
    public static void main(String[] args) {
        int[] matriz = {1,2,3,0,4,2};

        int indicePivo = calculaIndicePivo(matriz);
        System.out.println(indicePivo);
    }

    public static int calculaIndicePivo(int[] matriz) {
        int[] sumLeft = new int[matriz.length];
        int[] sumRight = new int[matriz.length];
        int mi = matriz.length-1;

        sumLeft[0] = matriz[0];
        sumRight[mi] = matriz[mi];

        for (int i = 1; i < mi; i++) {
            sumLeft[i] = sumLeft[i-1] + matriz[i];
            sumRight[mi-i] = sumRight[mi-i+1] + matriz[mi-i];
        }

        sumLeft[mi] = sumLeft[mi-1] + matriz[mi];
        sumRight[0] = sumRight[1] + matriz[0];

        if (sumRight[1] == 0) {
            return 0;
        } else if (sumLeft[mi-1] == 0) {
            return mi;
        }

        for (int i = 1; i < matriz.length; i++) {
            if (sumLeft[i-1] == sumRight[i+1]) {
                return i;
            }
        }

        return -1;
    }
}
