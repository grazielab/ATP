package com.alexinha.banco.repository;

import com.alexinha.banco.model.Clientes;
import org.springframework.data.repository.CrudRepository;

public interface ClientesRepository extends CrudRepository<Clientes, Integer>{
    
}