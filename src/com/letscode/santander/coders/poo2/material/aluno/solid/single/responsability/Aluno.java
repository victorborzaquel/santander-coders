package com.letscode.santander.coders.poo2.material.aluno.solid.single.responsability;

public class Aluno {
    private String name;
    private String mail;

    public Aluno(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
