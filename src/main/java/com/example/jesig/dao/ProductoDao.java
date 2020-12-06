package com.example.jesig.dao;


import com.example.jesig.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author ZetaGzR
 */
public interface ProductoDao extends JpaRepository<Producto, Integer>{
    
}
