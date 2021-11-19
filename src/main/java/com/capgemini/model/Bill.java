package com.capgemini.model;

import java.time.LocalDate;

public class Bill {
	// should be auto-generated
	private Long billId;
	private Reading billForReading;
	private LocalDate billDate;
	private LocalDate billDueDate;
	private int unitsConsumed;
	private int billAmount;
	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public LocalDate getBillDueDate() {
		return billDueDate;
	}
	public void setBillDueDate(LocalDate billDueDate) {
		this.billDueDate = billDueDate;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public Reading getBillForReading() {
		return billForReading;
	}
	public void setBillForReading(Reading billForReading) {
		this.billForReading = billForReading;
	}
}
