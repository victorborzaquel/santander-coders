package com.letscode.santander.coders.poo1.material.aluno;

public class Main {
    public static void main(String[] args) {
//        funcionario();
    }
    public static void Veiculos() {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

//        Veiculo veiculo = obterTipoDoVeiculo();
//        veiculo.desligar();
    }
    public static void jogador() {
        Jogador neymar = new Jogador();

        neymar.nomeDoTime = "Paris Saint Germain";
        neymar.numeroDaCamisa = 10;

        String simbolo = Jogador.simbolo;
    }
    public static void funcionario() {
        Funcionario gerente = new Funcionario();
        gerente.salario = 3000;
        gerente.desconto = 300;
        gerente.bonus = 600;

        double result = gerente.calcularPagamento();
        System.out.println(result);
    }
}
