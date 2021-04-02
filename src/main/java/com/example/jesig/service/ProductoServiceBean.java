package com.example.jesig.service;

import com.example.jesig.entidades.Producto;
import com.example.jesig.mapper.ProductoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceBean implements  ProductoService{

    @Autowired
    private ProductoMapper productoMapper;

    @Override
    public List<Producto> lista() {
        return productoMapper.lista();
    }

    @Override
    public int registrar(Producto producto) {

        return productoMapper.registrar(producto);
    }
}
