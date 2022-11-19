package Class02;

public class Operadores {
    public static void main(String[] args) {
//        operadores();
        aritimetico();
    }

    static void operadores() {
        int a = 10;
        int b = 2;

        System.out.println("Resultado Soma= " + (a + b));
        System.out.println("Resultado Subtracao= " + (a - b));
        System.out.println("Resultado Multiplicacao= " + (a * b));
        System.out.println("Resultado Divisao= " + (a / b));
    }

    static void aritimetico() {
        // and , or , nand
        boolean estaChovendo = true;
        boolean tenhoDinheiro = true;

        System.out.println(estaChovendo && tenhoDinheiro);
    }
}
