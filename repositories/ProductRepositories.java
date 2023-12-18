package com.projeto.projetoSB.repositories;

import com.projeto.projetoSB.entities.Category;
import com.projeto.projetoSB.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositories extends JpaRepository<Product, Long> {


}
