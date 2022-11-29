package com.letscode.santander.coders.logica.programacao.listas.l04;

public class Ex02 {
    public static void main(String[] args) {
        double[][] turma = {{9,8,7,8},{10,9,8,9},{9,8,7,8}};
        double[] mediaAlunos = calculaMediaAlunos(turma);
        double mediaTurma = calculaMediaTurma(mediaAlunos);
        printMediasTurma(mediaAlunos, mediaTurma);
    }

    public static double calculaMediaTurma(double[] mediaAlunos) {
        double somaTurma = 0, mediaTurma;
        for (double mediaAluno : mediaAlunos) {
            somaTurma+=mediaAluno;
        }
        mediaTurma = somaTurma / mediaAlunos.length;
        return mediaTurma;
    }

    public static double[] calculaMediaAlunos(double[][] turma) {
        double[] mediaAlunos = new double[turma.length];
        double somaAluno;
        int i = 0;
        for (double[] aluno : turma) {
            somaAluno = 0;
            for (double nota : aluno) {
                somaAluno+= nota;
            }
            mediaAlunos[i] = somaAluno / aluno.length;
            i++;
        }
        return mediaAlunos;
    }

    public static void printMediasTurma(double[] mediaAlunos, double mediaTurma) {
        int l = mediaAlunos.length-1;
        for (int i = 0; i < l; i++) {
            System.out.printf("Aluno %d - Média %.0f,\n", i, mediaAlunos[i]);
        }
        System.out.printf("Aluno %d - Média %.0f\n", l, mediaAlunos[l]);
        System.out.printf("\nMédia da turma: %.2f", mediaTurma);
    }
}
