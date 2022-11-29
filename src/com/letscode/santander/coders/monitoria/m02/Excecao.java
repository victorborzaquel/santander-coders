package com.letscode.santander.coders.monitoria.m02;

import java.io.IOException;

public class Excecao {
    public static void main(String[] args) { //varargs
        varargs();
        varargs("Victor");
        varargs("Victor", "Hugo");
    }

    public static void varargs(String... strings) {

    }

    public static void stack() {
        try {
            checked();
        } catch (IOException | AgenciaException e) {
            System.out.println("Error");
        } catch (Exception e) {
            System.out.println("Error geral");
        }

    }

    public static void checked() throws IOException, AgenciaException {
        throw new IOException();
    }

    public static void unchecked() {
        int[] array = new int[0];

        System.out.println(array[1]);
    }

    public static void error() {
        try {
            // Abre recurso
        } catch (Exception e) {
            // Trata recurso
        } finally {
            // Libera recurso
        }
    }
}

enum AgenciInvalida { CERTO, ERRADO }

class AgenciaException extends Exception { }