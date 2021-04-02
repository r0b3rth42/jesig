package com.example.jesig.service;

import com.example.jesig.entidades.Producto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductoService {
    List<Producto> lista ();

    int registrar (Producto producto);
}
