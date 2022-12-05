package com.letscode.santander.coders.poo2.material.aluno.solid.dependency.inversion;

import com.letscode.santander.coders.poo2.material.aluno.solid.dependency.inversion.comunicacao.MatriculaService;
import com.letscode.santander.coders.poo2.material.aluno.solid.dependency.inversion.comunicacao.services.ComunicacaoService;
import com.letscode.santander.coders.poo2.material.aluno.solid.dependency.inversion.comunicacao.services.EmailService;

public class Main {
    // "Busca o desacoplamento de código onde,
    // ao invés de módulos de alto nível dependerem
    // de módulos de baixo nível, ambos dependem de abstrações".
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        ComunicacaoService comunicacaoService = new EmailService();
        MatriculaService matriculaService = new MatriculaService(comunicacaoService);

        matriculaService.realizarMatricula(aluno);
    }
}
