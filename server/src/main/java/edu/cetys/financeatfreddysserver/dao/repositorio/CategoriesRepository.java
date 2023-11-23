package edu.cetys.financeatfreddysserver.dao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cetys.financeatfreddysserver.dao.Entidad.CategoriesEntity;

public interface CategoriesRepository extends JpaRepository<CategoriesEntity, Integer> {

}
