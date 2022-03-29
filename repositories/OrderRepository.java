package br.com.mateus.course.repositories;

import br.com.mateus.course.entities.Order;
import br.com.mateus.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
