package com.cg.spring.boot.demo.service;

import java.util.List;
import  com.cg.spring.boot.demo.exception.NoSuchConnectionException;
import  com.cg.spring.boot.demo.exception.NoSuchCustomerException;
import org.springframework.data.jpa.repository.Query;

import com.cg.spring.boot.demo.model.Connection;
import com.cg.spring.boot.demo.model.Customer;
import com.cg.spring.boot.demo.model.Address;
import com.cg.spring.boot.demo.service.ConnectionService;

public interface ConnectionService {

	public Connection newConnectionRequest(Connection newConnection);
	public Customer searchCustomerByConsumerNumber(Long consumerNumber)throws NoSuchCustomerException;
	public Connection modifyConnectionAddress(Connection connection);
	// suspend or activate connection
	public Connection modifyConnection(Connection connection);
	
//	@Query(name = "SELECT e FROM address_table WHERE e.villageName=?")
	public List<Connection> findActiveConnectionsByVillage(String villageName)throws NoSuchConnectionException;
	
//	@Query(name = "SELECT e FROM address_table WHERE e.taluka=?")
	public List<Connection> findActiveConnectionsByTaluka(String taluka)throws NoSuchConnectionException;
	
//	@Query(name = "SELECT e FROM address_table WHERE e.districtName=?")
	public List<Connection> findActiveConnectionsByDistrict(String districtName)throws NoSuchConnectionException;
	
	
	public List<Connection> findActiveConnectionsByPincode(Integer pincode)throws NoSuchConnectionException;
//	public Connection findActiveConnectionsByPincode(int pincode)throws NoSuchConnectionException;

	public List<Connection> findInactiveConnectionsByVillage(String villageName)throws NoSuchConnectionException;
	public List<Connection> findInactiveConnectionsByTaluka(String taluka)throws NoSuchConnectionException;
	public List<Connection> findInactiveConnectionsByDistrict(String districtName)throws NoSuchConnectionException;
	public List<Connection> findInactiveConnectionsByPincode(Integer pincode)throws NoSuchConnectionException;
	
}

//class ConnectionSer implements  ConnectionService{
//
//	 @Autowired
//	    private ConnectionRespository connectionRepository;
//
//	 @Override
//	public Connection newConnectionRequest(Connection newConnection)
//	{
//	 System.out.println("Add new Connection");
//     if (!connectionRepository.existsById(newConnection.getConnectionId()))
//         return connectionRepository.save(newConnection);
//     System.out.println(newConnection.getConnectionId() + " already exists.");
//     return null;
//	}
//
//
//	@Override
//	public Customer searchCustomerByConsumerNumber(Long consumerNumber) throws NoSuchCustomerException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public Connection modifyConnectionAddress(Connection connection) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public Connection modifyConnection(Connection connection) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<Connection> findActiveConnectionsByVillage(String villageName) throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<Connection> findActiveConnectionsByTaluka(String taluka) throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<Connection> findActiveConnectionsByDistrict(String districtName) throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<Connection> findActiveConnectionsByPincode(String pincode) throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<Connection> findInactiveConnectionsByVillage(String villageName) throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<Connection> findInactiveConnectionsByTaluka(String taluka) throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<Connection> findInactiveConnectionsByDistrict(String districtName) throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public List<Connection> findInactiveConnectionsByPincode(String pincode) throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}



//}
