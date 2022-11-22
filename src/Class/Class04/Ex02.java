package Class.Class04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int quantidade = 4;
        int total = 0;
        double media;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= quantidade; i++) {
            System.out.println("Adiciona a nota " + i);
            total += sc.nextInt();
        }

        media = total / quantidade;
        
    }
}
