package com.fastfood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fastfood.model.Propriedade;



@Repository
public interface PropriedadeRepository extends PagingAndSortingRepository<Propriedade, String> {

	/*
	 * @Query("Select	c	from	Propriedade	c where	c.nome like %filtro% order "
	 * + "by categoria,subcategoria,nome")
	 */
	@Query("Select	c from	Propriedade	c where c.nome like %:filtro%"
			+ " order by categoria,subcategoria,nome")
	public List<Propriedade> findByFiltro(@Param("filtro") String filtro); 
}
