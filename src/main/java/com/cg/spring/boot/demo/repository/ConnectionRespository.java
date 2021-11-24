package com.cg.spring.boot.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import  com.cg.spring.boot.demo.model.Connection;

@Repository
public interface ConnectionRespository extends JpaRepository<Connection, Integer> {

	

	public Connection createConnection(Connection newConnection);
//	public Customer readCustomerByConsumerNumber(Long consumerNumber);
	public Connection updateConnectionAddress(Connection connection);
	public Connection updateConnection(Connection connection);
	
	@Query(name = "SELECT e FROM address_table WHERE e.villageName=?1")
	public List<Connection> readActiveConnectionsByVillage(String villageName);
	@Query(name = "SELECT e FROM address_table WHERE e.taluka=?1")
	public List<Connection> readActiveConnectionsByTaluka(String taluka);
	@Query(name = "SELECT e FROM address_table WHERE e.districtName=?1")
	public List<Connection> readActiveConnectionsByDistrict(String districtName);
	@Query(name = "SELECT e FROM address_table WHERE e.pincode=?1")
	public List<Connection> readActiveConnectionsByPincode(String pincode);
	@Query(name = "SELECT e FROM address_table WHERE e.villageName=?1")
	public List<Connection> readInactiveConnectionsByVillage(String villageName);
	
	@Query(name = "SELECT e FROM address_table WHERE e.taluka=?1")
	public List<Connection> readInactiveConnectionsByTaluka(String taluka);
	
	@Query(name = "SELECT e FROM address_table WHERE e.districtName=?1")
	public List<Connection> readInactiveConnectionsByDistrict(String districtName);
	@Query(name = "SELECT e FROM address_table WHERE e.pincode=?1")
	public List<Connection> readInactiveConnectionsByPincode(String pincode);
	


//	List<Connection> findByVillageName(String villageName);
//
//	Optional<Connection> findByTaluka(String taluka);

//	List<Connection> findByDistrictName(String districtName);

//	Optional<Connection> findActiveConnectionsByPincode(Integer pincode);
	
	
	
//	public Connection createConnection(Connection newConnection);
//	public Customer readCustomerByConsumerNumber(Long consumerNumber);
//	public Connection updateConnectionAddress(Connection connection);
//	public Connection updateConnection(Connection connection);
//	
//	public List<Connection> readActiveConnectionsByVillage(String villageName);
//	public List<Connection> readActiveConnectionsByTaluka(String taluka);
//	public List<Connection> readActiveConnectionsByDistrict(String districtName);
//	public List<Connection> readActiveConnectionsByPincode(String pincode);
//	
//	public List<Connection> readInactiveConnectionsByVillage(String villageName);
//	public List<Connection> readInactiveConnectionsByTaluka(String taluka);
//	public List<Connection> readInactiveConnectionsByDistrict(String districtName);
//	public List<Connection> readInactiveConnectionsByPincode(String pincode);
	

//	boolean existsById(Long connectionId);



}