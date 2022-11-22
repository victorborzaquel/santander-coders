package Class.Class05;

public class MetodosAndFuncoes {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;

        int soma = Calculadora.soma(n1, n2);
        double div = Calculadora.div(n1, n2);

        System.out.println(soma);
        System.out.println(div);

        hello();
    }

    public static void hello() {
        System.out.println("Ola mundo!");
    }
}
