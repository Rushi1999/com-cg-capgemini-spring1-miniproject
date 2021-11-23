package com.cg.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.cg.spring.boot.demo.model.User;

@Repository
public interface  AddressRespository extends JpaRepository<User, Integer> {

//	boolean existsById(Long connectionId);



}
