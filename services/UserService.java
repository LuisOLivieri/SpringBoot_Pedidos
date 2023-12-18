package com.projeto.projetoSB.services;

import com.projeto.projetoSB.entities.User;
import com.projeto.projetoSB.repositories.UserRepositories;
import com.projeto.projetoSB.services.exceptions.DatabaseException;
import com.projeto.projetoSB.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositories repositories;

    public List<User> findall(){
       return repositories.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = repositories.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    public User insert(User obj){
        return repositories.save(obj);
    }

    public void delete(Long id){
        if (!repositories.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        try {
            repositories.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }

    }

    public User update(Long id, User obj){
        try {
            User entity = repositories.getReferenceById(id);
            updateData(entity, obj);
            return repositories.save(entity);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);

        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
