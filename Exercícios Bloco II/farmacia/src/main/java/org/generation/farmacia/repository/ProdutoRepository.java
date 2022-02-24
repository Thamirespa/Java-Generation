package org.generation.farmacia.repository;

import java.util.List;

import org.generation.farmacia.model.CategoriaModel;
import org.generation.farmacia.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
	public List <CategoriaModel>findAllByDescricaoTituloContainingIgnoreCase(String descricaoTitulo);

	
	
}
