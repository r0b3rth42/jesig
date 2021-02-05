package com.example.jesig.controller;

import com.example.jesig.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE, RequestMethod.OPTIONS})
@RequestMapping("/reportes")
public class ReporteControlller {

    @Autowired
    private ReporteService reporteService;

    @PostMapping(value = "/venta-mensual")
    public ResponseEntity<List<HashMap>> listar(@RequestBody HashMap parametros){
        List<HashMap> lista = reporteService.obtenerReporteMensual(parametros);
        return ResponseEntity.ok(lista);
    }

    @PostMapping(value = "/venta-ganancia-mensual")
    public  ResponseEntity<List<HashMap>> ventaGananciaMensual(@RequestBody int anio){
        List<HashMap> ventasGanancia = reporteService.reporteVentasGananciaMensual(anio);
        return ResponseEntity.ok(ventasGanancia);
    }

    @PostMapping(value = "/ventas-al-mes")
    public ResponseEntity<List<HashMap>> ventasAlMes(@RequestBody HashMap map){
        List<HashMap> ventasAlMes = reporteService.ventasAlMes(map);
        return ResponseEntity.ok(ventasAlMes);
    }


}
