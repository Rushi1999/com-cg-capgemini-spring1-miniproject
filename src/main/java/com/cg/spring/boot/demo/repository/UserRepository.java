package com.cg.spring.boot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.demo.model.Connection;
import  com.cg.spring.boot.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	List<Connection> findInactiveConnectionsByVillage(String villageName);

//	List<Connection> findActiveConnectionsByVillage(String villageName);

//	List<Connection> findByVillageName(String villageName);

}