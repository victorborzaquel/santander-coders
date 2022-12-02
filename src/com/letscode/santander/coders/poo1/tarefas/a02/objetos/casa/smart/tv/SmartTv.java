package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.smart.tv;

import java.util.Scanner;

public class SmartTv {
    public final Store store;
    public final Menu menu;

    public SmartTv(Scanner sc) {
        store = new Store(sc);
        this.menu = new Menu(sc, store);
    }

    public void turnOn() {
        menu.open();
    }
}
