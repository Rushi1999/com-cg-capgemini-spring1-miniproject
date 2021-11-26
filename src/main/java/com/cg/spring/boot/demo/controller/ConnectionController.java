package com.cg.spring.boot.demo.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.demo.exception.NoSuchConnectionException;
import com.cg.spring.boot.demo.model.Connection;
import com.cg.spring.boot.demo.service.ConnectionService;



@RestController
public class ConnectionController {

    private static final Logger LOG = LoggerFactory.getLogger(ConnectionController.class);

    @Autowired
    private ConnectionService connectionService;
    
    /* */
 // http://localhost:8082/registerCustomer
    @PostMapping("/createConnection")
    public Connection addConnection(@RequestBody Connection connection) throws NoSuchConnectionException {
        System.out.println("add new connection");
        return connectionService.newConnectionRequest(connection);
    }
    
//	public Connection modifyConnectionAddress(Connection connection);
	
 // http://localhost:8082/modifyConnectionAddress
	@PutMapping("/modifyConnectionAddress")
	public Connection updateAddress(@RequestBody Connection connection) {
		System.out.println("Controller updateConnectionAdddress");
		return connectionService.modifyConnectionAddress(connection);
	}
	
	// http://localhost:8082/modifyConnection
	@PutMapping("/modifyConnection")
	public Connection updateConnection(@RequestBody Connection connection) throws NoSuchConnectionException {
		System.out.println("Controller updateConnection");
		return connectionService. modifyConnection(connection);
	}
	
	
//	public List<Connection> findConnectionsByPincode(String pincode)throws NoSuchConnectionException;
	
	// http://localhost:8082/getConnectionbypincode/{pincode}
	@GetMapping("/getConnectionbypincode/{pincode}")
	public ResponseEntity<Connection> findActiveConnectionsByPincode(@PathVariable(name = "pincode")Long pincode) throws NoSuchConnectionException {
		LOG.info("getConnectionById");
		List<Connection> connt = connectionService.findConnectionsByPincode(pincode); 
		LOG.info(connt.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This consumer is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Connection> response = new ResponseEntity<Connection>(HttpStatus.OK);
		return response;
	}
	
//	public List<Connection> findConnectionsById(Long connectionId)throws NoSuchConnectionException;
	
	// http://localhost:8082/getConnectionbyId/{connectionId}
	@GetMapping("/getConnectionbyId/{connectionId}")
	public ResponseEntity<Connection>findConnectionById(@PathVariable(name = "connectionId")Long i) throws NoSuchConnectionException {
		LOG.info("getConnectionById");
		Connection connt = connectionService.findConnectionById(i); 
		LOG.info(connt.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This connection is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Connection> response = new ResponseEntity<Connection>(HttpStatus.OK);
		return response;
	}
	
	
}
