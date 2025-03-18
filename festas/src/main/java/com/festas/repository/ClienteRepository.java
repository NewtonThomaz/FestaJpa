package com.festas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festas.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
