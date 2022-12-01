package com.letscode.santander.coders.poo1.aulas.a02;

import com.letscode.santander.coders.poo1.aulas.a02.locadora.Filme;
import com.letscode.santander.coders.poo1.aulas.a02.locadora.Locadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filme marvel = new Filme("Thor", "Ação", 10.0);
        Filme dc = new Filme("Batman", "Herois", "Ação", "10", 10.0);

        List<Filme> filmes = new ArrayList<>(Arrays.asList(marvel, dc));
        Locadora locadora2 = new Locadora("AdaFlix", "1234456", filmes);
        Locadora locadora = new Locadora("AdaFlix", "1234456");

        locadora.cadastrarFilme(marvel);
        locadora.cadastrarFilme(dc);

        locadora.listarFilmes();
    }
}
