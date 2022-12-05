package com.letscode.santander.coders.poo2.material.aluno.solid.dependency.inversion.comunicacao;

import com.letscode.santander.coders.poo2.material.aluno.solid.dependency.inversion.Aluno;
import com.letscode.santander.coders.poo2.material.aluno.solid.dependency.inversion.comunicacao.services.ComunicacaoService;

public class MatriculaService {
    private final ComunicacaoService comunicacaoService;

    public MatriculaService(ComunicacaoService comunicacaoService) {
        this.comunicacaoService = comunicacaoService;
    }

    public void realizarMatricula(Aluno aluno) {
        this.comunicacaoService.send("Matrícula realizada.", aluno.getDestinatario());
    }
}
