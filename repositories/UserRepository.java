package br.com.mateus.course.repositories;

import br.com.mateus.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
