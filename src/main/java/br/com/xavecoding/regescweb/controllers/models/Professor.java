package br.com.xavecoding.regescweb.controllers.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    private BigDecimal salario;
    @Enumerated(EnumType.STRING)
    private StatusProfessor statusProfessor;

    public Professor() {}
    public Professor(long id, String nome, BigDecimal salario, StatusProfessor statusProfessor) {}

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

    public BigDecimal getSalario() {
        return salario;
    }

    public StatusProfessor getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(StatusProfessor statusProfessor) {
        this.statusProfessor = statusProfessor;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
