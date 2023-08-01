package com.virtusa.project.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customers {
	@Id
	private String cid;
	private String cname;
	private String phone;
	private String password;
	
	private String pin;
	private BigDecimal balance;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", phone=" + phone + ", password=" + password + ", pin="
				+ pin + ", balance=" + balance + "]";
	}
	
	
	
}
