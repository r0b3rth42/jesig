package com.example.jesig.entidades;

import java.util.List;

public class CompraProducto {

    private int compraProductoId;
    private Compra compra;
    private Producto producto;
    private double precio;
    private int cantidad;

    public int getCompraProductoId() {
        return compraProductoId;
    }

    public void setCompraProductoId(int compraProductoId) {
        this.compraProductoId = compraProductoId;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


}
