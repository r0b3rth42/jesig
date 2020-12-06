package com.example.jesig.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLEVENTA")
public class DetalleVenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddetalle")
    private int idDetalle;
    
    @Column(name="idventa")
    private int idVenta;
    
    @Column(name="idproducto")
    private int idProducto;
    
    @Column(name="preciofinal")    
    private double precioFinal;
    
    @Column(name="cantidad")
    private int cantidad;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalle, int idVenta, int idProducto, double precioFinal, int cantidad) {
        this.idDetalle = idDetalle;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.precioFinal = precioFinal;
        this.cantidad = cantidad;
    }

    public DetalleVenta(int idVenta, int idProducto, double precioFinal, int cantidad) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.precioFinal = precioFinal;
        this.cantidad = cantidad;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
