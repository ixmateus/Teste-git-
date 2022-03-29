package br.com.mateus.course.repositories;

import br.com.mateus.course.entities.Category;
import br.com.mateus.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
