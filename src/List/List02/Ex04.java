import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc;
        int multiply, x;

        sc = new Scanner(System.in);
        System.out.print("Digite o número que deseja ver a tabuada: ");
        x = sc.nextInt();
        sc.close();

        for(int i = 1; i <= 10; i++) {
            multiply = x * i;
            System.out.printf("%d x %d = %d\n", x, i, multiply);
        }
    }
}
