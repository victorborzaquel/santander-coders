package com.letscode.santander.coders.logica.programacao.listas.l02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int x;
        Scanner sc;
        boolean isWeird = true;
        boolean isEven, isGreaterThen20, isBetween2and5;

        System.out.print("Digite um número inteiro: ");
        sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();

        isEven = (x % 2 == 0);
        isGreaterThen20 = (x > 20);
        isBetween2and5 = (2 <= x) && (x <= 5);
        if(isEven && (isGreaterThen20 || isBetween2and5)) {
            isWeird = false;
        }
        System.out.println(isWeird ? "Weird" : "Not Weird");
    }
}
