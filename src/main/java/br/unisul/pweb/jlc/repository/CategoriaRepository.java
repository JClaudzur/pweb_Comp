package br.unisul.pweb.jlc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.pweb.jlc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
