package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v2.book;

import java.util.Arrays;

public class Book {
    private final Chapter[] chapters;
    private final String author;
    private final String summary;
    private final String resume;
    private final String name;
    private int currentPage;

    public Book(String name, String author, String resume, Chapter[] chapters) {
        this.chapters = chapters;
        this.author = author;
        this.resume = resume;
        this.name = name;
        this.summary = this.generateSummary();
        this.currentPage = 0;
    }

    private String generateSummary() {
        String summary = "";
        for (Chapter chapter : chapters) {
            summary += chapter.getName() + "\n";
        }
        return summary;
    }

    public void printCover() {
        System.out.println("Nome: " + name);
        System.out.println("Autor: " + author);
        System.out.println("Resumo: " + resume);
    }

    public void printCurrentPage() {
        System.out.println("Pagina atual: " + currentPage);
        System.out.println("Conteudo: " + Arrays.toString(chapters[currentPage].getContents()));
    }
}
