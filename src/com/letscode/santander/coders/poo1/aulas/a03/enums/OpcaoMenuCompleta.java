package com.letscode.santander.coders.poo1.aulas.a03.enums;

public enum OpcaoMenuCompleta {
    CADASTRAR(1, "Cadastrar Filme"),
    LISTAR_FILME(2, "Listar Filme"),
    SAIR(3, "Sair");

    private final int id;
    private final String descricao;
    OpcaoMenuCompleta(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
