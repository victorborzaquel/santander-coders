package com.letscode.santander.coders.logica.programacao.aulas.a07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        // Aceita apenas Objetos e Wrapper class
        // Valor dinâmico
        // Conseguimos remover um elemento (sem complexidade)

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(list.get(0));
        System.out.println(list2.get(0));

        System.out.println(list2.size());

        list.set(1, 12);

        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
