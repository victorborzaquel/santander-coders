package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa;

import com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.smart.tv.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartTv smartTv = new SmartTv(sc);

        smartTv.turnOn();
        sc.close();
    }
}
