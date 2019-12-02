package com.tyss.retailerspringmvc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class OrderBean {
	
	@Id
	@Column
	@GeneratedValue
	private int oid;
	@Column
	private String Pname;
	@Column
	private int ppu;
	@Column
	private int quantity;
	@Column
	private int amountpayable;
	@Column
	private int rid;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getPpu() {
		return ppu;
	}
	public void setPpu(int ppu) {
		this.ppu = ppu;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmountpayable() {
		return amountpayable;
	}
	public void setAmountpayable(int amountpayable) {
		this.amountpayable = amountpayable;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
}
