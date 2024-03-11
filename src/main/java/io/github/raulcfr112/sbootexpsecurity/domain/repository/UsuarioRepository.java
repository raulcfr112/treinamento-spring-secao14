package io.github.raulcfr112.sbootexpsecurity.domain.repository;

import io.github.raulcfr112.sbootexpsecurity.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Optional<Usuario> findByLogin (String login);
}
