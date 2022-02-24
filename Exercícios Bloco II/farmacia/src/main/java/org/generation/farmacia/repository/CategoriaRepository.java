package org.generation.farmacia.repository;

import java.util.List;

import org.generation.farmacia.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	public List <CategoriaModel>findAllByDescricaoContainingIgnoreCase(String descricao);
}
