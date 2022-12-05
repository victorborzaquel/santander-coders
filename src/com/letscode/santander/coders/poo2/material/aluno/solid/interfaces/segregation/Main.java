package com.letscode.santander.coders.poo2.material.aluno.solid.interfaces.segregation;

public class Main {
    // "Interfaces grandes devem ser quebradas em interfaces menores".
    // @FunctionalInterface, onde uma interface define apenas uma
}

class EngenheiroSoftware implements
        Desenvolvedor,
        AnalistaRequisitos,
        AnalistaQualidade,
        EngenheiroDevops
{

    @Override
    public void codificar() {

    }

    @Override
    public void documentarRequisitos() {

    }

    @Override
    public void testar() {

    }

    @Override
    public void disponibilizar() {

    }
}

interface Desenvolvedor {
    void codificar();
}
interface AnalistaRequisitos {
    void documentarRequisitos();
}
interface AnalistaQualidade {
    void testar();
}
interface EngenheiroDevops {
    void disponibilizar();
}