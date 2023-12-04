package edu.cetys.financeatfreddysserver.dao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cetys.financeatfreddysserver.dao.Entidad.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByNombre(String Nombre);
}
