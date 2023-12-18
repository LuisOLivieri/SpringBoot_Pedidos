package com.projeto.projetoSB.services;

import com.projeto.projetoSB.entities.Category;
import com.projeto.projetoSB.entities.User;
import com.projeto.projetoSB.repositories.CategoryRepositories;
import com.projeto.projetoSB.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepositories repositories;

    public List<Category> findall(){
       return repositories.findAll();
    }
    public Category findById(Long id){
        Optional<Category> obj = repositories.findById(id);
        return obj.get();
    }
}
