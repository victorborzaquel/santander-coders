package POOI.Aula.Class01;

import POOI.Aula.Class01.dados.pessoais.Endereco;
import POOI.Aula.Class01.pessoa.Pessoa;
import POOI.Aula.Class01.jogo.time.Jogador;

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
