package com.generation.blogpessoal.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Usuário;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuário, Long> {

    public Optional<Usuário> findByUsuario(String usuario);
    public List<Usuário> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
