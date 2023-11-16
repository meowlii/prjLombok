package com.melissa.lombok.projetoLombok.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.melissa.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}