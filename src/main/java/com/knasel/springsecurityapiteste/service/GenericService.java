package com.knasel.springsecurityapiteste.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param <DTO> DTO Object to return
 * @param <T> Entity to iterate
 */
@Service
public interface GenericService <DTO, T>{

    public List<DTO> findAll();
    public DTO findById(T entityToFind);
    public DTO save(T entityToSave);
    public DTO update(T entityToUpdate);
    public DTO delete(T entityToDelete);

}
