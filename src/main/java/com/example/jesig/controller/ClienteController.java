
package com.example.jesig.controller;

import com.example.jesig.dao.ClienteDao;
import com.example.jesig.entidades.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE, RequestMethod.OPTIONS})
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @RequestMapping("/lista")
    public ResponseEntity<List<Cliente>> getClientes(){
        List<Cliente> lista = clienteDao.findAll();
        return ResponseEntity.ok(lista);
    }
    
    @RequestMapping("/{clienteId}")
    public ResponseEntity<Cliente> obtenerClienteById(@PathVariable ("clienteId") int clienteId){
        Optional<Cliente> clienteOptional =  clienteDao.findById(clienteId);
        if(clienteOptional.isPresent()){
            return ResponseEntity.ok(clienteOptional.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    
    @RequestMapping("/guardar")
    public ResponseEntity<Cliente> registrarCliente(@RequestBody Cliente cli ){
        Cliente cliente = clienteDao.save(cli);
        return ResponseEntity.ok(cliente);
    }
    
    @RequestMapping("/actualizar")
    public ResponseEntity<Cliente> actualizar(@RequestBody Cliente cli){
        Cliente cliente = clienteDao.save(cli);
        return ResponseEntity.ok(cliente);
    }
    
    @RequestMapping("/eliminar/{id}")
    public ResponseEntity<Cliente> eliminar(@PathVariable ("id") int clienteId){
        clienteDao.deleteById(clienteId);
        return ResponseEntity.ok(null);
    }
}
