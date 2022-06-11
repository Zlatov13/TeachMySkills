package com.example.demo.servise;

import com.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface HandlerCrudRepository extends CrudRepository<User, Long> {

}
