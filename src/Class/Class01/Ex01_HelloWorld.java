package Class.Class01;

import java.util.Scanner;

public class Ex01_HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.printf("Hello, %s!", nome);
        sc.close();
    }
}
