package LogicaProgramacaoI.List.List04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        final int NUMERO_VOTOS = 10;
        String[] nomeCandidatos = {"victor", "hugo", "mattos", "borzaquel"};

        Map<String, Integer> votos = pegarVotos(nomeCandidatos, NUMERO_VOTOS);
        String vencedor = pegarVencedor(nomeCandidatos, votos);
        int porcentagemVencedor = pegarPorcentagemVencedor(nomeCandidatos, vencedor, votos);
        printVencedor(vencedor, porcentagemVencedor);
    }

    public static int pegarPorcentagemVencedor(String[] candidatos, String vencedor, Map<String, Integer> votos) {
        int votosVencedor = votos.get(vencedor);
        int votosValidos = 0;
        for (String candidato : candidatos) {
            if (candidato == "votos nulos") {
                votosValidos -= votos.get(candidato);
            } else {
                votosValidos += votos.get(candidato);
            }
        }
        return votosVencedor * 100 / votosValidos;
    }

    public static String pegarVencedor(String[] candidatos, Map<String, Integer> votos) {
        String vencedor = null;
        for (String candidato : candidatos) {
            if (vencedor == null) {
                vencedor = candidato;
            } else if ((candidato != "votos nulos") && (votos.get(candidato) > votos.get(vencedor))) {
                vencedor = candidato;
            }
        }
        return vencedor;
    }

    public static Map<String, Integer> pegarVotos(String[] nomeCandidatos, int numero_votos) {
        Map<String, Integer> votos = new HashMap<>();
        String votoAtual;
        int votosNulos = 0;

        for (String candidato : nomeCandidatos) {
            votos.put(candidato, 0);
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero_votos; i++) {
            System.out.print("Em quem vai votar? ");
            votoAtual = sc.nextLine();
            if (votos.containsKey(votoAtual)) {
                votos.put(votoAtual, votos.get(votoAtual) + 1);
            } else {
                votosNulos++;
            }
        }
        sc.close();

        votos.put("votos nulos", votosNulos);

        return votos;
    }

    public static void printVencedor(String vencedor, int porcentagemVencedor) {
        System.out.printf("O vencedor foi o candidato %s e teve %d%% dos votos válidos!", vencedor, porcentagemVencedor);
    }
}
