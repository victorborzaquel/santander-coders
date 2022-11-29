package POOI.Class;

public class Funcionario {
    public double salario;
    public double desconto;
    public double bonus;

    public double calcularPagamento() {
        return salario + bonus - desconto;
    }
}
