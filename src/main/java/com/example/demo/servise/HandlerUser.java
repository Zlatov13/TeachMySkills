package com.example.demo.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class HandlerUser {
    @Autowired
    private HandlerCrudRepository handlerCrud;

    public void searchById(){

    }


}
