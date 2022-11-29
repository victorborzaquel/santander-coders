package POOI.Aula.Class01.pessoa;

import POOI.Aula.Class01.dados.pessoais.Endereco;

public class Pessoa {
    private String nome;
    private String email;
    private Endereco endereco;

    public Pessoa(String nome, String email, Endereco endereco) {

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
