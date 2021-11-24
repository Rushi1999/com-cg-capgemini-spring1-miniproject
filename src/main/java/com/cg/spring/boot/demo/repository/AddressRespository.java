package com.cg.spring.boot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.cg.spring.boot.demo.model.Address;

@Repository
public interface  AddressRespository extends JpaRepository<Address, Integer> {

//	List<Connection> findByVillageName(String villageName);

//	boolean existsById(Long connectionId);



}
