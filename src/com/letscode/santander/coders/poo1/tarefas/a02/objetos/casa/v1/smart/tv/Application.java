package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v1.smart.tv;

import java.util.*;

public class Application {
    private final String name;
    private final Map<Integer, Category> categories;
    private boolean installed;
    private final Scanner sc;

    public Application(Scanner sc, String name, Category[] categories) {
        this.sc = sc;
        this.name = name;
        this.categories = new HashMap<>();
        for (int i = 0; i < categories.length; i++) {
            this.categories.put(i+1, categories[i]);
        }
    }

    public void open() {
        System.out.println(name);
        System.out.println("Selecione uma categoria:");
        listCategories();

        int select = sc.nextInt();

        if (select == 0) {
            return;
        }

        categories.get(select).open();

        open();
    }

    public void listCategories() {
        System.out.println("0 - Voltar ao Menu");
        categories.forEach((id, category) -> System.out.printf("%d - %s\n", id, category.getName()));
    }

    public void toggleInstall() {
        installed = !installed;
    }

    public boolean isInstalled() {
        return installed;
    }

    public String getName() {
        return name;
    }
}
