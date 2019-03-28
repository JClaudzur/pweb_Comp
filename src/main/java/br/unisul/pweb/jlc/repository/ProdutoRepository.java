package br.unisul.pweb.jlc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.jlc.domain.Categoria;
import br.unisul.pweb.jlc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	List<Produto> findDistinctByNomeContainingAndCategoriasIn(
			String nome,
			List<Categoria> categorias
	);
}
