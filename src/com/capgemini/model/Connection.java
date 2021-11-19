package com.capgemini.model;

import java.time.LocalDate;

public class Connection {
	// should be auto-generated for internal purpose
	private Long connectionId;
	// should be auto-generated
	private Long consumerNumber;
	private Customer customerConnection;
	private Address connectionAddress;
	private ConnectionType connectionType;
	private LocalDate applicationDate;
	private LocalDate connectionDate;
	// connectionStatus will be active or inactive
	private boolean connectionStatus;
	
	public Long getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Long connectionId) {
		this.connectionId = connectionId;
	}
	public Customer getCustomerConnection() {
		return customerConnection;
	}
	public void setCustomerConnection(Customer customerConnection) {
		this.customerConnection = customerConnection;
	}
	public Address getConnectionAddress() {
		return connectionAddress;
	}
	public void setConnectionAddress(Address connectionAddress) {
		this.connectionAddress = connectionAddress;
	}
	public ConnectionType getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(ConnectionType connectionType) {
		this.connectionType = connectionType;
	}
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}
	public LocalDate getConnectionDate() {
		return connectionDate;
	}
	public void setConnectionDate(LocalDate connectionDate) {
		this.connectionDate = connectionDate;
	}
	public Long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(Long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
}
