package com.myfirstapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myfirstapi.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
