package com.letscode.santander.coders.poo1.aulas.a02;

public enum OpcaoMenu {
    INICIAR_PARTIDA("1"),
    SAIR("2");
    private final String opcao;

    OpcaoMenu(String opcao) {
        this.opcao = opcao;
    }

    public String getOpcao() {
        return opcao;
    }
}
