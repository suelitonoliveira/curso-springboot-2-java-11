package com.educandoweb.curso.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.entities.User;


public interface UserRepository extends JpaRepository<Order, Long>{

	void saveAll(List<User> asList);

}
