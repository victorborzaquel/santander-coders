package My;

public class Invert {
    public static void main(String[] args) {
        int a = 5, b = 2;

        a+=b;
        b=a-b;
        a-=b;

        System.out.println(a);
        System.out.println(b);
    }
}
