package com.letscode.santander.coders.poo1.exercicios.a01.geometria;

public class Quadrado extends Retangulo {
    public Quadrado(String cor, double lado) {
        super(cor, lado, lado);
    }

    @Override
    public String toString() {
        return String.format("Quadrado [lado=%s, cor=%s]", getLado1(), getCor());
    }
}
