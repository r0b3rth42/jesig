package com.example.jesig.dao;


import com.example.jesig.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteDao extends JpaRepository<Cliente, Integer> {
    
}
