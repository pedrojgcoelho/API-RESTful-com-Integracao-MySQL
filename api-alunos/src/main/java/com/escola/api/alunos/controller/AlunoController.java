package com.escola.api.alunos.controller;

import com.escola.api.alunos.model.Aluno;
import com.escola.api.alunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repo;

    @GetMapping
    public List<Aluno> getTodos() {
        return repo.findAll();
    }

    @GetMapping("/{matricula}")
    public Optional<Aluno> getPorMatricula(@PathVariable int matricula) {
        return repo.findById(matricula);
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return repo.save(aluno);
    }

    @PutMapping("/{matricula}")
    public Aluno atualizar(@PathVariable int matricula, @RequestBody Aluno dados) {
        return repo.findById(matricula).map(aluno -> {
            aluno.setNome(dados.getNome());
            aluno.setIdade(dados.getIdade());
            aluno.setEmail(dados.getEmail());
            return repo.save(aluno);
        }).orElseGet(() -> {
            dados.setMatricula(matricula);
            return repo.save(dados);
        });
    }

    @DeleteMapping("/{matricula}")
    public void deletar(@PathVariable int matricula) {
        repo.deleteById(matricula);
    }
}
