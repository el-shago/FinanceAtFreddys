package edu.cetys.financeatfreddysserver.dao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cetys.financeatfreddysserver.dao.Entidad.TransactionsEntity;

public interface TransactionsRepository extends JpaRepository<TransactionsEntity, Integer> {

}
