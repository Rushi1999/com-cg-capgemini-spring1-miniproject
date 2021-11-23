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
import com.cg.spring.boot.demo.repository.AddressRespository;



@RestController
public class ConnectionController {

    private static final Logger LOG = LoggerFactory.getLogger(ConnectionController.class);

    @Autowired
    private ConnectionService connectionService;
    @Autowired
    private AddressRespository  addressRespository ;

    @PostMapping("/newConnection")
    public Connection addConnection(@RequestBody Connection connection) {
        System.out.println("add new connection");
        return connectionService.newConnectionRequest(connection);
    }

//    @PostMapping("/createConnection")
//    public Connection addConnection(@RequestBody Connection connection) {
//        System.out.println("add new connection");
//        return connectionService.createConnection(connection);
//    }
//
    
//	public Connection modifyConnectionAddress(Connection connection);
	
	@PutMapping("/updateconnection")
	public Connection updateEmp(@RequestBody Connection connection) {
		System.out.println("Controller updateConnection");
		return connectionService.modifyConnectionAddress(connection);
	}
	
//	public List<Connection> findActiveConnectionsByVillage(String villageName)throws NoSuchConnectionException;
	
	@GetMapping("/getActiveConnectionbyname/{villageName}")
	public List<Connection>findActiveConnectionsByVillage(@PathVariable String villageName) {
		LOG.info("getActiveConnectionByVillageName");
		return connectionService.findActiveConnectionsByVillage(villageName);
	}
	
	
//	public List<Connection> findActiveConnectionsByTaluka(String taluka)throws NoSuchConnectionException;
	
//	@GetMapping("/getActiveConnectionbyname/{taluka}")
//	public List<Connection>findActiveConnectionsByTaluka(@PathVariable String taluka) throws NoSuchConnectionException {
//		LOG.info("getActiveConnectionByTaluka");
//		return connectionService.findActiveConnectionsByTaluka(taluka);
//	}

//	@GetMapping("/getActiveConnectionbyname/{taluka}")
//	public List<Connection>findActiveConnectionsByTaluka(@PathVariable String taluka){
//		LOG.info("getActiveConnectionByTaluka");
//		return connectionService.findActiveConnectionsByTaluka(taluka);
//	}
	
	
//	public List<Connection> findActiveConnectionsByDistrict(String districtName)throws NoSuchConnectionException;
	
//	@GetMapping("/getActiveConnectionbyDistrictName/{districtName}")
//	public List<Connection>findActiveConnectionsByVillage(@PathVariable String districtName)  {
//		LOG.info("getActiveConnectionByVillageName");
//		return connectionService.findActiveConnectionsByVillage(districtName);
//	}
//	
	
//	public List<Connection> findActiveConnectionsByPincode(String pincode)throws NoSuchConnectionException;
	
	@GetMapping("/getActiveConnectionbypincode/{pincode}")
	public ResponseEntity<Connection> findActiveConnectionsByPincode(@PathVariable(name = "pincode") Integer pincode) throws NoSuchConnectionException {
		LOG.info("getConnectionById");
		List<Connection> connt = connectionService.findActiveConnectionsByPincode(pincode); 
		LOG.info(connt.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This consumer is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Connection> response = new ResponseEntity<Connection>(HttpStatus.OK);
		return response;
	}
	
	
	
//	public List<Connection> findInactiveConnectionsByVillage(String villageName)throws NoSuchConnectionException;
	
	@GetMapping("/getInActiveConnectionbyname/{villageName}")
	public List<Connection>findInactiveConnectionsByVillage(@PathVariable String villageName) throws NoSuchConnectionException {
		LOG.info("getInactiveConnectionByVillageName");
		return connectionService.findInactiveConnectionsByVillage(villageName);
	}	
	
//	public List<Connection> findInactiveConnectionsByTaluka(String taluka)throws NoSuchConnectionException;
	
	@GetMapping("/getInActiveConnectionbyname/{taluka}")
	public List<Connection> findInactiveConnectionsByTaluka(@PathVariable String taluka) throws NoSuchConnectionException {
		LOG.info("getInActiveConnectionByTaluka");
		return connectionService.findInactiveConnectionsByTaluka(taluka);
	}
	
//	public List<Connection> findInactiveConnectionsByDistrict(String districtName)throws NoSuchConnectionException;
	
	@GetMapping("/getInActiveConnectionbyDistrictName/{districtName}")
	public List<Connection>findInactiveConnectionsByDistrict(@PathVariable String districtName) throws NoSuchConnectionException {
		LOG.info("getActiveConnectionByVillageName");
		return connectionService.findInactiveConnectionsByDistrict(districtName);
	}
	
//	public List<Connection> findInactiveConnectionsByPincode(String pincode)throws NoSuchConnectionException;
	
	@GetMapping("/getInActiveConnectionbypincode/{pincode}")
	public ResponseEntity<Connection> findInactiveConnectionsByPincode(@PathVariable(name = "pincode") Integer pincode) throws NoSuchConnectionException {
		LOG.info("getEmpById");
		List<Connection> connt = connectionService.findInactiveConnectionsByPincode(pincode); 
		LOG.info(connt.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This consumer is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Connection> response = new ResponseEntity<Connection>(HttpStatus.OK);
		return response;
	}
	
	
}
