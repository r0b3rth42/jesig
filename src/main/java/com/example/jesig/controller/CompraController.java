package com.example.jesig.controller;

import com.example.jesig.entidades.Compra;
import com.example.jesig.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE, RequestMethod.OPTIONS})
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping(value = "/lista")
    public ResponseEntity<List<Compra>> lista(){
        List<Compra> list = compraService.lista();
        return ResponseEntity.ok(list);
    }


    @PostMapping()
    public ResponseEntity<Compra> registro(@RequestBody Compra model){
        Compra compra = compraService.registrarCompra(model);
        return ResponseEntity.ok(compra);
    }


}
