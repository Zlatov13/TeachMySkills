package com.example.springDataJPA.dao;

import com.example.springDataJPA.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface HandlerCrudRepository extends CrudRepository<User, Long> {

}
