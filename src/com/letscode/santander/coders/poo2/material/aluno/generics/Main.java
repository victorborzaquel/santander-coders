package com.letscode.santander.coders.poo2.material.aluno.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // E - Element (usado exclusivamente pelo Java Collections Framework)
    // K - Key
    // N - Number
    // T - Type
    // V - Value
    // S,U,V etc. - 2nd, 3rd, 4th types
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();

        box.set(22);

        System.out.println(box.get());
    }

    static void example() {
        List<String> list = new ArrayList<>();
        list.add("Hello");

        String s = list.get(0);

        System.out.println(s);
    }
}
