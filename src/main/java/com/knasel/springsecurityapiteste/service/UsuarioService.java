package com.knasel.springsecurityapiteste.service;

import com.knasel.springsecurityapiteste.domain.Usuario;
import com.knasel.springsecurityapiteste.domain.dto.UsuarioDTO;
import com.knasel.springsecurityapiteste.domain.repository.UsuarioRepository;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements GenericService<UsuarioDTO, Usuario> {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioDTO> findAll() {
        return usuarioRepository.findAll().stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO findById(Usuario entityToFind) {
        return new UsuarioDTO(usuarioRepository.findById(entityToFind.getId()).get());
    }

    @Override
    public UsuarioDTO save(Usuario entityToSave) {
        // TODO not implemented yet
        throw new NotYetImplementedException();
    }

    @Override
    public UsuarioDTO update(Usuario entityToUpdate) {
        // TODO not implemented yet
        throw new NotYetImplementedException();
    }

    @Override
    public UsuarioDTO delete(Usuario entityToDelete) {
        // TODO not implemented yet
        throw new NotYetImplementedException();
    }
}
