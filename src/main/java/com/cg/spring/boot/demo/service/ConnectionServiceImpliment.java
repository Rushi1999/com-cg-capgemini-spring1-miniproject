package com.cg.spring.boot.demo.service;

import java.util.*;


import  com.cg.spring.boot.demo.exception.NoSuchConnectionException;
import  com.cg.spring.boot.demo.exception.NoSuchCustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.demo.model.Connection;
import com.cg.spring.boot.demo.model.Customer;
import com.cg.spring.boot.demo.repository.ConnectionRespository;
import com.cg.spring.boot.demo.controller.ConnectionController;
import com.cg.spring.boot.demo.service.ConnectionService;
import com.cg.spring.boot.demo.repository.AddressRespository;

@Service
class ConnectionServiceImpliment implements  ConnectionService
{

	 @Autowired
	    private ConnectionRespository connectionRepository;
	 
	 @Autowired
	    private AddressRespository addressRepository;
	 

@Override
	public Connection newConnectionRequest(Connection newConnection)
	{
	 System.out.println("Add new Connection");
   if (!connectionRepository.existsById(newConnection.getConnectionId()))
       return connectionRepository.save(newConnection);
   System.out.println(newConnection.getConnectionId() + " already exists.");
   return null;
	}


	@Override
	public Customer searchCustomerByConsumerNumber(Long consumerNumber) throws NoSuchCustomerException {
//		// TODO Auto-generated method stub
//		System.out.println("getCustomerByCunsumerNumber");
//		Optional<Connection> custOpt = connectionRepository.findById(consumerNumber);
//		if (custOpt.isPresent()) {
//			System.out.println("Cunsumer is available.");
//			return custOpt.get();
//		} else {
//			System.out.println("Cunsumer is NOT available.");
//			throw new NoSuchCustomerException(consumerNumber + " this customer is not found.");
//		}
		return null;
	}

//	@Override
//	public Connection modifyConnectionAddress(Connection connection) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("Service Modify Address");
//		if (connectionRepository.existsById(connection.getConnectionId()))
//			return connectionRepository.save(connection);
//		System.out.println(connection.getConnectionId() + " does not exist.");
//		
////		return null;
//	}
	
	

	@Override
	public Connection modifyConnection(Connection connection) {
//		System.out.println("Service Modify Address");
//		if (connectionRepository.existsById(connection.getConnectionId()))
//			return connectionRepository.save(connection);
//		System.out.println(connection.getConnectionId() + " does not exist.");
//		return connection;
		return null;
	}


	@Override
	public List<Connection> findActiveConnectionsByVillage(String villageName) throws NoSuchConnectionException {
		
		System.out.println("getActiveConnectionByVillageName");
			return connectionRepository.readActiveConnectionsByVillage(villageName);		
//			return null;
		
	}


	@Override
	public List<Connection> findActiveConnectionsByTaluka(String taluka) throws NoSuchConnectionException {
//		System.out.println("getActiveConnectionByByTaluka");
//		Optional<Connection> connectionOpt = connectionRepository.findByTaluka(taluka);
//		if (connectionOpt.isPresent()) {
//			System.out.println("Cunsumer is available.");
//			
//			return (List<Connection>) connectionOpt.get();
//		} 
//		else
//		{
//			throw new NoSuchConnectionException("Consumer Not Found");
//		}
		return null;
		
	}


	@Override
	public List<Connection> findActiveConnectionsByDistrict(String districtName) throws NoSuchConnectionException {
//		System.out.println("getActiveConnectionByTaluka");
//		return connectionRepository.findByDistrictName(districtName);
		return null;
	}

	@Override
	public List<Connection> findActiveConnectionsByPincode(Integer pincode)throws NoSuchConnectionException {
//		// TODO Auto-generated method stub
//		System.out.println("getCustomerByCunsumerNumber");
//		Optional<Connection> custOpt = connectionRepository.findActiveConnectionsByPincode(pincode);
//		if (custOpt.isPresent()) {
//			System.out.println("Cunsumer is available.");
//			return (List<Connection>) custOpt.get();
//		} else {
//			
//			throw new NoSuchConnectionException( " this cunsumer is not found.");
//		}
		return null;
	}


	@Override
	public List<Connection> findInactiveConnectionsByVillage(String villageName) throws NoSuchConnectionException {
//		System.out.println("getInactiveConnectionByVillageName");
//		return connectionRepository.findByVillageName(villageName);
		return null;
	}


	@Override
	public List<Connection> findInactiveConnectionsByTaluka(String taluka) throws NoSuchConnectionException {
//		System.out.println("getInactiveConnectionByTaluka");
//		System.out.println("getInActiveConnectionByByTaluka");
//		Optional<Connection> connectionOpt = connectionRepository.findByTaluka(taluka);
//		if (connectionOpt.isPresent()) {
//
//			return (List<Connection>) connectionOpt.get();
//		} 
//		else
//		{
//			throw new NoSuchConnectionException("Consumer Not Found");
//		}
		return null;
		
	}


	@Override
	public List<Connection> findInactiveConnectionsByDistrict(String districtName) throws NoSuchConnectionException {
//		System.out.println("getInactiveConnectionByDistrictName");
//		return connectionRepository.findByDistrictName(districtName);
		return null;
	}


	@Override
	public List<Connection> findInactiveConnectionsByPincode(Integer pincode) throws NoSuchConnectionException {
		// TODO Auto-generated method stub
		return null;	
     }


	@Override
	public Connection modifyConnectionAddress(Connection connection) {
		// TODO Auto-generated method stub
		return null;
	}


	
}