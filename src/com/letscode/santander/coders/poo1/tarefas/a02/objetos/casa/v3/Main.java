package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v3;

public class Main {
    public static void main(String[] args) {
        Book java = new Book("Java", "James Gosling ", 1000, 1991, "Java é uma linguagem de programação orientada a objetos.");
        Tv lg = new Tv("LG", "Smart", 50, 2020);
        Notebook mac = new Notebook("Mac", "Pro", 14, 2021);

        System.out.println(java);
        System.out.println(lg);
        System.out.println(mac);
    }
}
