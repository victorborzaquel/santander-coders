package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v3;

public class Tv {
    private final String brand;
    private final String model;
    private final int size;
    private final int year;

    public Tv(String brand, String model, int size, int year) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Marca: " + brand + '\n' +
                "Modelo: " + model + '\n' +
                "Tamanho: " + size + '\n' +
                "Ano: " + year + '\n';
    }

    public String getBrand() {
        return brand;
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
