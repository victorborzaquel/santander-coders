package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.smart.tv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Scanner sc;
    private final Store store;

    public Menu(Scanner sc, Store store) {
        this.sc = sc;
        this.store = store;
    }

    public void open() {
        System.out.println("Bem vindo a Smart Tv!");
        System.out.println("Escolha um aplicativo:");
        listApplications();

        int select = sc.nextInt();

        switch (select) {
            case 0: store.open(); break;
            case 99: return;
            default: store.getInstallApplications().get(select).open(); break;
        }

        open();
    }

    public void listApplications() {
        System.out.println("99 - Desligar a TV");
        System.out.println("0 - Ir para Loja");
        store.getInstallApplications().forEach((id, application) -> System.out.printf("%d - %s\n", id, application.getName()));
    }
}
