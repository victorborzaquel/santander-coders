package com.letscode.santander.coders.poo2.material.aluno.interfaces;

/**
 * Interface de marcação é um recurso utilizado para quando temos interfaces que não possuem métodos ou campos. A implementação dessa interface em um classe serve para marcar que uma classe pertence à categoria da interface implementada e indicar à JVM que aquela classe terá um comportamento de acordo com o contrato definido.
 * */
interface Ave {}

class Tucano implements Ave {
    private int id;
    private String nome;
    private String nacionalidade;
}

class Pardal implements Ave {
    private int id;
    private String nome;
    private String nacionalidade;
}