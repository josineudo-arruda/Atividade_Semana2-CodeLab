package br.com.xavecoding.regescweb.models;

import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoCurso tipoCurso;

    public Curso() {}

    public Curso(String nome, String descricao, TipoCurso tipoCurso) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipoCurso = tipoCurso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
}
