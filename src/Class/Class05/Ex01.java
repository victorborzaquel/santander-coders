package Class.Class05;

public class Ex01 {
    public static void main(String[] args) {
        int s = menor(2);
        System.out.println(s);
    }

    public static int menor(int n) {
        int i = 1;
        while ((n * i) % 2 != 0) {
            i++;
        }
        return n * i;
    }
}
