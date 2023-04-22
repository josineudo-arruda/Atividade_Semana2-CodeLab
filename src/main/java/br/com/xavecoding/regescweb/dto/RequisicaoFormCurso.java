package br.com.xavecoding.regescweb.dto;

import br.com.xavecoding.regescweb.models.Curso;
import br.com.xavecoding.regescweb.models.TipoCurso;
import jakarta.persistence.*;

public class RequisicaoFormCurso {
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoCurso tipoCurso;

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

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Curso toCurso() {
        Curso curso = new Curso();
        curso.setNome(this.nome);
        curso.setDescricao(this.descricao);
        curso.setTipoCurso(this.tipoCurso);
        return curso;
    }

    public Curso toCurso(Curso curso) {
        curso.setNome(this.nome);
        curso.setDescricao(this.descricao);
        curso.setTipoCurso(this.tipoCurso);

        return curso;
    }

    public void fromCurso(Curso curso) {
        this.nome = curso.getNome();
        this.descricao = curso.getDescricao();
        this.tipoCurso = curso.getTipoCurso();
    }

}
