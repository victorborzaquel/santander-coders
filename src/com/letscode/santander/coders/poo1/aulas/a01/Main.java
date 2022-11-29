package com.letscode.santander.coders.poo1.aulas.a01;

import com.letscode.santander.coders.poo1.aulas.a01.jogo.time.Jogador;
import com.letscode.santander.coders.poo1.aulas.a01.dados.pessoais.Endereco;
import com.letscode.santander.coders.poo1.aulas.a01.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        jogador();
    }

    public static void jogador() {
        Jogador jogador = new Jogador();
        jogador.setNome("Neymar");
        jogador.setNumeroCamisa("10");
        jogador.setPosicao("deitado");

        System.out.println(jogador.getNome() + jogador.getNumeroCamisa() + jogador.getPosicao());
    }

    public static void endereco() {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Victor", "v@v.com", endereco);
    }
}
