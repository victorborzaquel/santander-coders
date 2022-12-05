package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v2;

import com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v2.book.Book;
import com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v2.book.Chapter;
import com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v2.book.Page;

public class Main {
    public static void main(String[] args) {
        Book java = createJavaBook();

        java.printCover();
    }

    public static Book createJavaBook() {
        return new Book("Java", "Paulo", "Java é uma linguagem de programação", new Chapter[]{
                new Chapter("Capitulo 1", new Page[]{
                        new Page(new String[]{
                                "Ola",
                                "Tudo bem"
                        }),
                        new Page(new String[]{
                                "Ola",
                                "Ola"
                        })}),
                new Chapter("Capitulo 2", new Page[]{
                        new Page(new String[]{
                                "Tudo",
                                "Tudo bem"
                        }),
                        new Page(new String[]{
                                "bem",
                                "Tudo bem"
                        })
                })
        });
    }
}