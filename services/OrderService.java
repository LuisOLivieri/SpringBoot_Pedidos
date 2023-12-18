package com.projeto.projetoSB.services;

import com.projeto.projetoSB.entities.Order;
import com.projeto.projetoSB.repositories.OrderRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepositories repositories;

    public List<Order> findall(){
       return repositories.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj = repositories.findById(id);
        return obj.get();
    }
}
