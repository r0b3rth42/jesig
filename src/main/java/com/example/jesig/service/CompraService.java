package com.example.jesig.service;

import com.example.jesig.entidades.Compra;
import com.example.jesig.entidades.CompraProducto;

import java.util.ArrayList;
import java.util.HashMap;

public interface CompraService {
    ArrayList<HashMap> lista();

    Compra registrarCompra(Compra model);
    int registrarCompraProducto(CompraProducto model);
}
