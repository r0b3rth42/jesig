package com.example.jesig.service;

import com.example.jesig.entidades.Compra;
import com.example.jesig.entidades.CompraProducto;

import java.util.ArrayList;

public interface CompraService {
    ArrayList<Compra> lista();

    Compra registrarCompra(Compra model);
    int registrarCompraProducto(CompraProducto model);
}
