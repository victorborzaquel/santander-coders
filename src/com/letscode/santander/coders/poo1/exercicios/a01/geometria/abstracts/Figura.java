package com.letscode.santander.coders.poo1.exercicios.a01.geometria.abstracts;

public abstract class Figura {
    private String cor;

    public Figura(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
