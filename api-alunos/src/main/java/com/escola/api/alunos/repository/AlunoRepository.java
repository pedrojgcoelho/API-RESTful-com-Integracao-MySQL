package com.escola.api.alunos.repository;

import com.escola.api.alunos.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
