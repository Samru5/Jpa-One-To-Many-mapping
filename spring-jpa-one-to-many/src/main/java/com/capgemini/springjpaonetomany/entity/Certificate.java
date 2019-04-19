package com.capgemini.springjpaonetomany.entity;

import javax.persistence.*;

@Entity
public class Certificate {

	@Id
	private int cid;

	private String cname;

	@ManyToOne
	private Employee employee;

	public Certificate() {
		super();
	}

	public Certificate(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

//public Employee getEmployee() {
//	return employee;
//}
//
//public void setEmployee(Employee employee) {
//	this.employee = employee;
//}

	@Override
	public String toString() {
		return "Certificate [cid=" + cid + ", cname=" + cname + "]";
	}

}
