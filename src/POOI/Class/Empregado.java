package POOI.Class;

import java.math.BigDecimal;

public class Empregado {
    private String nome;
    private int matricula;
    private BigDecimal salario;

    public Empregado(String nome, int matricula, BigDecimal salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.printf("%s está trabalhando... ", this.nome);
    }

    public void baterPonto() {
        System.out.printf("%s bateu o ponto", this.nome);
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
