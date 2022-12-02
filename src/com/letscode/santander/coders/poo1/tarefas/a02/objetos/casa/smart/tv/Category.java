package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.smart.tv;

import java.util.*;

public class Category {
    private final String name;
    private final Map<Integer, Movie> movies;
    private final Scanner sc;

    public Category(Scanner sc, String name, Movie[] movies) {
        this.name = name;
        this.movies = new HashMap<>();
        for (int i = 0; i < movies.length; i++) {
            this.movies.put(i+1, movies[i]);
        }
        this.sc = sc;
    }

    public void open() {
        System.out.println(name);
        System.out.println("Selecione um filme:");
        listMovies();

        int select = sc.nextInt();

        if (select == 0) {
            return;
        }

        movies.get(select).open();

        open();
    }

    public void listMovies() {
        System.out.println("0 - Voltar");
        movies.forEach((id, movie) -> System.out.printf("%d - %s\n", id, movie.getName()));
    }

    public String getName() {
        return name;
    }
}
