package com.projeto.projetoSB.services;

import com.projeto.projetoSB.entities.Product;
import com.projeto.projetoSB.entities.User;
import com.projeto.projetoSB.repositories.ProductRepositories;
import com.projeto.projetoSB.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepositories repositories;

    public List<Product> findall(){
       return repositories.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repositories.findById(id);
        return obj.get();
    }
}
