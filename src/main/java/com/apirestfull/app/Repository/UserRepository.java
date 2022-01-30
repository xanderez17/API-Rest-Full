package com.apirestfull.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirestfull.app.Modelo.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long>{

}
