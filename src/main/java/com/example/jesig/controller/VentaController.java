package com.example.jesig.controller;

import com.example.jesig.dao.DetalleVentaDao;
import com.example.jesig.dao.VentaDao;
import com.example.jesig.entidades.DetalleVenta;
import com.example.jesig.entidades.Venta;

import java.util.List;
import java.util.Optional;

import com.example.jesig.mapper.ReportesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author ZetaGzR
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE, RequestMethod.OPTIONS})
@RequestMapping("/venta")
public class VentaController {
    
    @Autowired
    private VentaDao ventaDao;
    @Autowired
    private DetalleVentaDao detalleVentaDao;
    @Autowired
    private ReportesMapper reportesMapper;

    @RequestMapping("/lista")
    public ResponseEntity<List<Venta>> listar(){
        List<Venta> lista = ventaDao.findAll();
        return ResponseEntity.ok(lista);
    }
    
    @RequestMapping("/{id}")
    public ResponseEntity<Venta> obtenerPorId(@PathVariable("id") int id){
        Optional<Venta> optionalVenta = ventaDao.findById(id);
        if(optionalVenta.isPresent()){
            return ResponseEntity.ok(optionalVenta.get());
        } else{
            return ResponseEntity.noContent().build();
        }
    }
    
    @RequestMapping("/registrar")
    public ResponseEntity<Venta> registrarVenta(@RequestBody Venta v){
        Venta venta = ventaDao.save(v);
        return ResponseEntity.ok(venta);
    }

   
    public int obtenerUltimoIdVenta(){
        List<Venta> lista = ventaDao.findAll();
        Venta venta = lista.get(lista.size()-1);
        return venta.getIdVenta();
    }
    
    @RequestMapping("/detalle-venta/registrar")
    public ResponseEntity<DetalleVenta>registrarDV(@RequestBody List<DetalleVenta> detallesVenta){          
        int idVenta = this.obtenerUltimoIdVenta();
        for(DetalleVenta dv: detallesVenta){
            dv.setIdVenta(idVenta);
            detalleVentaDao.save(dv);
        }
       return ResponseEntity.ok(null);
    }

}
