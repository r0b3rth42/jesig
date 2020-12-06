
package com.example.jesig.entidades;

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
@Entity
@Table( name = "VENTA")
public class Venta {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column (name = "IDVENTA")
    private int idVenta;
    
    @Column (name = "IDCLIENTE")
    private int idCliente;
    
    @Column (name = "FECHA")
    private String fecha;

    public Venta(int idVenta, int idCliente, String fecha) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.fecha = fecha;
    }

    public Venta() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Venta(int idCliente, String fecha) {
        this.idCliente = idCliente;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", idCliente=" + idCliente + ", fecha=" + fecha + '}';
    }
    
        
}
