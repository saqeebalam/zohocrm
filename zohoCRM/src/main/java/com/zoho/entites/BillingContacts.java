package com.zoho.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="billing_contacts")
public class BillingContacts {
	
	@Id
	private Long id;
	@Column(name = "first_name",nullable = false,length = 20)
	private String firstName;
	@Column(name = "last_name",nullable = false,length = 20)
	private String lastName;
	@Column(name = "product",nullable = false,length = 10)
	private String product;
	@Column(name = "amount",nullable = false,length = 10)
	private long amount;
	@Column(name = "gstTax",nullable = false,length = 20)
	private long gstTax;
	@Column(name = "amount_gst",nullable = false,length = 20)
	private long amountGst;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public long getGstTax() {
		return gstTax;
	}
	public void setGstTax(long gstTax) {
		this.gstTax = gstTax;
	}
	public long getAmountGst() {
		return amountGst;
	}
	public void setAmountGst(long amountGst) {
		this.amountGst = amountGst;
	}
	
	
	
	
}
