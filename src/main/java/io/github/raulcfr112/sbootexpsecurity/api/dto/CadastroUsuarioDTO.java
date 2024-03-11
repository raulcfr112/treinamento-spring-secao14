package io.github.raulcfr112.sbootexpsecurity.api.dto;

import io.github.raulcfr112.sbootexpsecurity.domain.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class CadastroUsuarioDTO {
    private Usuario usuario;
    private List<String> permissoes;
}
