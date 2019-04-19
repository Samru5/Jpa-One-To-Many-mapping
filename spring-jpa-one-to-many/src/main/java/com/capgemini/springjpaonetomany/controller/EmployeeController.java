package com.capgemini.springjpaonetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springjpaonetomany.dao.EmployeeDao;
import com.capgemini.springjpaonetomany.entity.Certificate;
import com.capgemini.springjpaonetomany.entity.Employee;
import com.capgemini.springjpaonetomany.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;

	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public void addNew() {

		Set<Certificate> certificate = new HashSet<Certificate>();
		Certificate c1 = new Certificate(1, "Java");
		Certificate c2 = new Certificate(2, "Python");

		certificate.add(c1);
		certificate.add(c2);

		Employee employee = new Employee(112, "Tom", certificate);

		service.add(employee);

	}

	@RequestMapping("/new")
	public Employee findAll() {
		Employee employee = dao.findById(112).get();
		return employee;
	}
}