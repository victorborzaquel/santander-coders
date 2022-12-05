package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v1.smart.tv;

import java.util.Scanner;

public class Movie {
    private final String name;
    private final int timeInMinutes;
    private final String description;
    private final Scanner sc;

    public Movie(Scanner sc, String name, int timeInMinutes, String description) {
        this.name = name;
        this.sc = sc;
        this.timeInMinutes = timeInMinutes;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void open() {
        System.out.println(name);
        System.out.println("Descrição: " + description);
        System.out.println("Duração: " + timeInMinutes + " Minutos");

        System.out.println("0 - Voltar");
        int select = sc.nextInt();

        if (select == 0) {
            return;
        }

        open();
    }
}
