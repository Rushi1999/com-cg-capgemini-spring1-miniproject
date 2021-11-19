package com.capgemini.model;

import java.time.LocalDate;

public class Payment {
	// should be auto-generated
	private Long paymentId;
	private Bill billPayment;
	private LocalDate paymentDate;
	private PaymentMode paymentMode;
	private double latePaymentCharges;
	private double totalPaid;
	private PaymentStatus status;
	
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Bill getBillPayment() {
		return billPayment;
	}
	public void setBillPayment(Bill billPayment) {
		this.billPayment = billPayment;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getLatePaymentCharges() {
		return latePaymentCharges;
	}
	public void setLatePaymentCharges(double latePaymentCharges) {
		this.latePaymentCharges = latePaymentCharges;
	}
	public double getTotalPaid() {
		return totalPaid;
	}
	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
}
