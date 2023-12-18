package com.projeto.projetoSB.repositories;

import com.projeto.projetoSB.entities.OrderItem;
import com.projeto.projetoSB.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepositories extends JpaRepository<OrderItem, Long> {


}
