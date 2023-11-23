package edu.cetys.financeatfreddysserver.dao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cetys.financeatfreddysserver.dao.Entidad.BudgetsEntity;

public interface BudgetRepository extends JpaRepository<BudgetsEntity, Integer> {

}
