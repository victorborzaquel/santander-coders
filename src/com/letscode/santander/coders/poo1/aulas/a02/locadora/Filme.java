package com.letscode.santander.coders.poo1.aulas.a02.locadora;

public class Filme {
    private String nome;
    private String descricao;
    private String genero;
    private String indicacaoClassificativa;
    private Double valorLocacao;

    public Filme(String nome, String descricao, String genero, String indicacaoClassificativa, Double valorLocacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.genero = genero;
        this.indicacaoClassificativa = indicacaoClassificativa;
        this.valorLocacao = valorLocacao;
    }

    public Filme(String nome, String genero, Double valorLocacao) {
        this.nome = nome;
        this.genero = genero;
        this.valorLocacao = valorLocacao;
    }

    @Override
    public String toString() {
        return "Filme {" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", genero='" + genero + '\'' +
                ", indicacaoClassificativa='" + indicacaoClassificativa + '\'' +
                ", valorLocacao=" + valorLocacao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIndicacaoClassificativa() {
        return indicacaoClassificativa;
    }

    public void setIndicacaoClassificativa(String indicacaoClassificativa) {
        this.indicacaoClassificativa = indicacaoClassificativa;
    }

    public Double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
}
