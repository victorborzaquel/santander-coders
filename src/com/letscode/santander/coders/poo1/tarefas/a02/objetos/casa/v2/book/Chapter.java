package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v2.book;

import com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v2.book.Page;

public class Chapter {
    private final String name;
    private final Page[] pages;

    public Chapter(String name, Page[] pages) {
        this.pages = pages;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Page[] getContents() {
        return pages;
    }
}
