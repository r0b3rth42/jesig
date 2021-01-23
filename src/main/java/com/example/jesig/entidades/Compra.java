package com.example.jesig.entidades;

import java.time.LocalDate;
import java.util.List;

public class Compra {
    private int compraId;
    private LocalDate fecha;
    private List<Producto> listProducto;

    public int getCompraId() {
        return compraId;
    }

    public void setCompraId(int compraId) {
        this.compraId = compraId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }
}
