package com.example.jesig.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ZetaGzR
 */
public class Producto implements Serializable {

    private Integer idProducto;
    

    private String codigo;
    

    private String descripcion;
    

    private String marca;
    

    private int stock;
    

    private double precioCompra;
    

    private double precioVenta;
    

    private String foto;

    private List<Foto> listFotos;

    public Producto(Integer idProducto, String codigo, String descripcion, String marca, int stock, double precioCompra, double precioVenta, String foto) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.foto = foto;
    }

    public Producto(String codigo, String descripcion, String marca, int stock, double precioCompra, double precioVenta, String foto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.foto = foto;
    }      

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Foto> getListFotos() {
        return listFotos;
    }

    public void setListFotos(List<Foto> listFotos) {
        this.listFotos = listFotos;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca + ", stock=" + stock + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + '}';
    }
    
    
}
