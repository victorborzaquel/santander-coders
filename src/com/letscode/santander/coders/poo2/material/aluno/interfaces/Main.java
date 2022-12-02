package com.letscode.santander.coders.poo2.material.aluno.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empregado a = new Empregado(102, "Victor", 3000d);
        Empregado b = new Empregado(20, "Karen", 5000d);
        Empregado c = new Empregado(1, "Tuca", 50000d);

        List<Empregado> empregados = new ArrayList<>();
        empregados.add(a);
        empregados.add(b);
        empregados.add(c);

        System.out.println(">>>> Antes da ordenação.");
        empregados.forEach(System.out::println);

        Collections.sort(empregados);

        System.out.printf("%n%n>>>> Depois da ordenação.");
        empregados.forEach(System.out::println);
    }
}
