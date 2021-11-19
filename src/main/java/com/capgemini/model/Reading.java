package com.capgemini.model;

import java.time.LocalDate;

public class Reading {
	// should be auto-generated
	private Long readingId;
	private Connection readingForConnection;
	private int unitsConsumed;
	// you have to decide either to store path of meter reading photo or to store meter reading photo
	private String readingPhoto;
	private LocalDate readingDate;
	// should be pre-populated based on connection type and other parameter
	private int pricePerUnits;
	
	public Long getReadingId() {
		return readingId;
	}
	public void setReadingId(Long readingId) {
		this.readingId = readingId;
	}
	public Connection getReadingForConnection() {
		return readingForConnection;
	}
	public void setReadingForConnection(Connection readingForConnection) {
		this.readingForConnection = readingForConnection;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public int getPricePerUnits() {
		return pricePerUnits;
	}
	public void setPricePerUnits(int pricePerUnits) {
		this.pricePerUnits = pricePerUnits;
	}
	public String getReadingPhoto() {
		return readingPhoto;
	}
	public void setReadingPhoto(String readingPhoto) {
		this.readingPhoto = readingPhoto;
	}
	public LocalDate getReadingDate() {
		return readingDate;
	}
	public void setReadingDate(LocalDate readingDate) {
		this.readingDate = readingDate;
	}
	
}
