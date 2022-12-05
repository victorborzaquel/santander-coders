package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v1.smart.tv;

import java.util.*;

public class Store {
    private final Map<Integer, Application> applications;
    private final Scanner sc;

    public Store(Scanner sc) {
        this.sc = sc;
        this.applications = new HashMap<>();
        createApplications();
    }

    public Map<Integer, Application> getInstallApplications() {
        Map<Integer, Application> installed = new HashMap<>();

        applications.forEach((id, application) -> {
            if (application.isInstalled()) {
                installed.put(id, application);
            }
        });

        return installed;
    }

    public void open() {
        System.out.println("Bem vindo a loja!");

        listApplications();
        int select = sc.nextInt();

        if (select == 0) {
            return;
        }

        applications.get(select).toggleInstall();

        open();
    }

    public void listApplications() {
        System.out.println("0 - Voltar ao Menu");
        Map<Integer, Application> installed = new HashMap<>();
        Map<Integer, Application> uninstalled = new HashMap<>();

        applications.forEach((id, application) -> {
            if (application.isInstalled()) {
                installed.put(id, application);
            } else {
                uninstalled.put(id, application);
            }
        });

        if (installed.size() > 0) {
            System.out.println("Desinstalar:");
            installed.forEach((id, application) -> System.out.printf("%d - %s\n", id, application.getName()));
        }

        if (uninstalled.size() > 0) {
            System.out.println("Instalar:");
            uninstalled.forEach((id, application) -> System.out.printf("%d - %s\n", id, application.getName()));
        }
    }

    private void createApplications() {
        Movie thor = new Movie(sc, "Thor", 120, "Marvel film");
        Movie capitao = new Movie(sc, "Capitão", 70, "Marvel film");
        Movie aranha = new Movie(sc, "Aranha", 80, "Marvel film");
        Movie smile = new Movie(sc, "Smile", 200, "film");
        Movie nope = new Movie(sc, "Nope", 60, "film");
        Movie beast = new Movie(sc, "Beast", 89, "film");

        Category marvelAction = new Category(sc, "Ação", new Movie[]{thor, capitao});
        Category marvelAdventure = new Category(sc, "Aventura", new Movie[]{aranha});
        Category marvelMarvel = new Category(sc, "Marvel", new Movie[]{aranha, thor, capitao});
        Application marvel = new Application(sc, "Marvel", new Category[]{marvelMarvel, marvelAdventure, marvelAction});
        this.applications.put(1, marvel);

        Category netflixAction = new Category(sc, "Ação", new Movie[]{thor, capitao, beast});
        Category netflixAdventure = new Category(sc, "Aventura", new Movie[]{aranha, beast});
        Category netflixHorror = new Category(sc, "Marvel", new Movie[]{smile, nope});
        Application netflix = new Application(sc, "Netflix", new Category[]{netflixAction, netflixAdventure, netflixHorror});
        this.applications.put(2, netflix);
    }
}
