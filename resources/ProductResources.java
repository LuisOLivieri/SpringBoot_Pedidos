package com.projeto.projetoSB.resources;

import com.projeto.projetoSB.entities.Product;
import com.projeto.projetoSB.entities.User;
import com.projeto.projetoSB.services.ProductService;
import com.projeto.projetoSB.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {
    @Autowired
    private ProductService service;
    @GetMapping
    public ResponseEntity<List<Product>> findall(){
        List<Product> list = service.findall();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
