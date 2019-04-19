package com.capgemini.springjpaonetomany.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	private int empid;

	private String empname;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Certificate> certificate;

	public Employee() {
		super();
	}

	public Employee(int empid, String empname, Set<Certificate> certificate) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.certificate = certificate;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Set<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(Set<Certificate> certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", certificate=" + certificate + "]";
	}

}
