package LogicaProgramacaoI.Class.Class03;

public class Condicional {
    public static void main(String[] args) {
        double nota = 8.0;

        boolean estaAprovado = nota >= 7;
        boolean estaRecuperacao = (5 <= nota) && (nota < 7);
        if(estaAprovado) {
            System.out.println("Aprovado");
        } else if (estaRecuperacao) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }


    }
}
