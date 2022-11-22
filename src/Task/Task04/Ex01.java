import java.util.Objects;

public class Ex01 {
    public static void main(String[] args) {
        Integer[] array1 = {1,2,3};
        Integer[] array2 = {1,2,3};

        boolean isEquals = compareArraysIsEquals(array1, array2);

        printResult(isEquals);
    }
    static boolean compareArraysIsEquals(Integer[] array1, Integer[] array2) {
        if(array1.length != array2.length) {
            return false;
        }

        for(int i = 0; i < array1.length; i++) {
            if(!Objects.equals(array1[i], array2[i])) {
                return false;
            }
        }

        return true;
    }

    static void printResult(boolean isEquals) {
        if(isEquals) {
            System.out.println("Parabéns, Os arrays são iguais");
        } else {
            System.out.println("Lamento, mas os arrays não são iguais");
        }
    }
}
