package Class.Class01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        hello();
//        input();
        dataType();
    }

    static void hello() {
        System.out.print("Hello world!\n");
        System.out.println("Hello");
        System.out.print("Hello\n");
        System.out.printf("Tenho %d anos\n", 15);
        System.out.printf("Tenho %d anos\n", (31/2));
        System.out.printf("Tenho %.2f anos\n", 15.5);

        String nome = "Victor";
        System.out.printf("Me chamo %s, tenho %d anos", nome, 24);
        System.out.println("Me chamo" + nome + ", tenho" + 24 + " anos");
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();
        System.out.println("O numero foi: " + n);
        sc.close();
    }

    static void dataType() {
        byte by = 1;
        short sh = 10;
        int i = 100;
        long lo = 100_000_000L;

        float fl = 2.2F;
        double dou = 2.20;

        char ch = 'v';
        boolean bo = false;

//        BigDecimal

        final double PI = 3.14;

        String text = "Victor Hugo";
        double dd = (15f/2);
        System.out.println(dd);

    }
}