package com.example.jesig.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.jesig.dao.ProductoDao;
import com.example.jesig.entidades.Producto;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 *
 * @author ZetaGzR
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoDao productoDao;

    @RequestMapping("lista")
    public ResponseEntity<List<Producto>> getProducto() {
        List<Producto> lista = productoDao.findAll();
        return ResponseEntity.ok(lista);
    }

    @RequestMapping(value = "{id}")
    public ResponseEntity<Producto> getProductoById(@PathVariable("id") int id) {
        Optional<Producto> producto = productoDao.findById(id);
        if (producto.isPresent()) {
            return ResponseEntity.ok(producto.get());
        } else {
            return ResponseEntity.noContent().build();

        }
    }

    @PostMapping(value = "registrar")
    public ResponseEntity<Producto> insertarProducto(@RequestBody Producto producto) {            
        Producto product = productoDao.save(producto);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping(value = "eliminar/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable("id") int id) {
        productoDao.deleteById(id);
        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = "modificar", method = RequestMethod.PUT)
    public ResponseEntity<Producto> actualizarProducto(@RequestBody Producto producto) {
        Optional<Producto> optionalProducto = productoDao.findById(producto.getIdProducto());
        if (optionalProducto.isPresent()) {
            productoDao.save(producto);
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();

        }
    }

    private void crearImagen(MultipartFile file, String path) {
      
        try {            
            Files.write(Paths.get(path), file.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }      
    }
}
