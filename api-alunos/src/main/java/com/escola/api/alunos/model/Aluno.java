package com.escola.api.alunos.model;

import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id
    private int matricula;

    private String nome;
    private int idade;
    private String email;

    // Getters e Setters
    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
