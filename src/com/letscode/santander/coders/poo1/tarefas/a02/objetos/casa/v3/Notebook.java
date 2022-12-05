package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v3;

public class Notebook {
    private final String branch;
    private final String model;
    private final int size;
    private final int year;

    public Notebook(String branch, String model, int size, int year) {
        this.branch = branch;
        this.model = model;
        this.size = size;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Marca: " + branch + '\n' +
                "Modelo: " + model + '\n' +
                "Tamanho: " + size + '\n' +
                "Ano: " + year + '\n';
    }

    public String getBranch() {
        return branch;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public int getYear() {
        return year;
    }
}
