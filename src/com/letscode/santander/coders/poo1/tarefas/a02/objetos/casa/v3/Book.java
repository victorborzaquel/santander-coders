package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v3;

public class Book {
    private final String title;
    private final String author;
    private final int pages;
    private final int year;
    private final String summary;

    public Book(String title, String author, int pages, int year, String summary) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Titulo: " + title + '\n' +
                "Autor: " + author + '\n' +
                "Paginas: " + pages + '\n' +
                "Ano: " + year + '\n' +
                "Resumo: " + summary + '\n';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getSummary() {
        return summary;
    }
}
