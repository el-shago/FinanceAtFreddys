package edu.cetys.financeatfreddysserver.dao.Entidad;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "users", schema = "public")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "user_id_user_seq",strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "user_id_user_seq",sequenceName = "user_id_user_seq",allocationSize = 1)
    @Column(name = "id_user", columnDefinition = "serial")

    private Integer id_user;

    @Column(name = "user_email")
    private String user;
    private String password;
    private String name;
    
    

}
