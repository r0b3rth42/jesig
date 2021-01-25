package com.example.jesig.service;

import com.example.jesig.entidades.Compra;
import com.example.jesig.entidades.CompraProducto;
import com.example.jesig.mapper.CompraMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class CompraServiceBean implements CompraService{

    @Autowired
    private CompraMapper compraMapper;

    @Override
    public ArrayList<HashMap> lista() {
        ArrayList listaCompra = compraMapper.lista();
        return listaCompra;
    }

    @Override
    public Compra registrarCompra(Compra model) {
        int resultado = compraMapper.registrarCompra(model);
        if(resultado == 1){
            model.getListProducto().forEach( producto -> {
                CompraProducto compraProd = new CompraProducto();
                Compra compra = new Compra();
                compra.setCompraId(model.getCompraId());
                compraProd.setCompra(compra);
                compraProd.setProducto(producto);
                compraProd.setPrecio(producto.getPrecioVenta());
                compraProd.setCantidad(producto.getStock());
                compraMapper.registrarCompraProducto(compraProd);
            });
        }

        return model;
    }

    @Override
    public int registrarCompraProducto(CompraProducto model) {
        Compra compra = model.getCompra();
        int resultado = compraMapper.registrarCompra(compra);
        if(resultado == 1){
            model.setCompra(compra);

        }
        return 0;
    }
}
