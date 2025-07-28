package com.handyReserve.spring.repository;

import com.handyReserve.spring.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
}
