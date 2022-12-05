package com.letscode.santander.coders.poo2.material.aluno.solid.open.closed;

public class Main {
    // Aberto para extensão, Fechado para alterações
    public static void main(String[] args) {

    }
}

class Professor {
    private String nome;
}

class PagamentoService {
    public void pagar(Professor professor) {
        //code
    }
}

class ProfessorEmTreinamento extends Professor {
    //code
}

class PagamentoEmTreinamentoService extends PagamentoService {
    public void pagar(ProfessorEmTreinamento professor) {
        //code
    }
}